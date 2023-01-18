package program;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class dbConnection {
       String[] columnName;
       Connection connect() {
        // SQLite connection string
       //String url = "jdbc:sqlite::resource:wnsBUC.db";
       String url = "jdbc:sqlite:data/MainDB.db";
       Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
       
    }//end connection
    public void importXLS() throws IOException, SQLException{
    boolean pathChoosed;
     String csvFile="";
      //file chooser
      JFileChooser chooser = new JFileChooser();
      chooser.setCurrentDirectory(new java.io.File("."));
      chooser.setDialogTitle("Please choose CSV file");
      chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
      chooser.setAcceptAllFileFilterUsed(true);
      if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      pathChoosed=true;
      csvFile=chooser.getSelectedFile().getCanonicalPath();
      
      } else {
          pathChoosed=false;
      
      }
      
      BufferedReader br = null;
        String line = "";
        

        try {

            br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            
            
            stmt.executeUpdate("DELETE FROM users");
            
            while ((line = br.readLine()) != null) {
               String[] linie=line.split(",");
               System.out.println( linie[0]);
               int deskid=Integer.parseInt(linie[0]);
                stmt.executeUpdate("INSERT INTO users (DeskID,patch,name,uid,avaya,proff) VALUES ('"+deskid+"','"+linie[1]+"','"+linie[2]+"','"+linie[3]+"','"+linie[4]+"','"+linie[5]+"')");
            }
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

      
      
    }
    public void exportXLS(String tableName) throws IOException, SQLException{
    boolean pathChoosed;
     String path="";
      //file chooser
      JFileChooser chooser = new JFileChooser();
      chooser.setCurrentDirectory(new java.io.File("."));
      chooser.setDialogTitle("Please choose directory");
      chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      chooser.setAcceptAllFileFilterUsed(true);
      if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      
      pathChoosed=true;
      path=chooser.getSelectedFile().getCanonicalPath();
    
      } else {
          pathChoosed=false;
      
      }
      //filechooser
      
      
      //pana aici se creeaza fisierul
    if(pathChoosed==true){  
    FileWriter out=new FileWriter(new File(path+"/"+tableName+".csv"));
      BufferedWriter bw=new BufferedWriter(out);
        int nrColoane;
        int nrRanduri;
             Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet nc    = stmt.executeQuery("SELECT * FROM "+tableName+" LIMIT 0");
             ResultSetMetaData asd=nc.getMetaData();
             nrColoane = asd.getColumnCount(); //se aflla nr coloane
            
             for (int i=1;i<=nrColoane;i++){
                  bw.write(asd.getColumnName(i)+",");
                      }//se scriu coloanele
                  bw.write("\n");
            //scriem randurile
            ResultSet getRows  = stmt.executeQuery("SELECT * FROM "+tableName+" ");
            while (getRows.next()) {
                for (int i=1;i<=nrColoane;i++){
                    if (getRows.getString(i)==null){bw.write(""+",");}else//daca e null scrie spatiu
                    {bw.write(getRows.getString(i)+",");}}
                bw.write("\n");
               
            }      
                  
             bw.close();
           }    
             
    }
    public  Object[][] getInventory (String query) throws SQLException {
             int nrColoane;
             int nrRanduri;
             ArrayList<List> listaInLista=new ArrayList<List>();
             Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet nc    = stmt.executeQuery("SELECT * FROM inventar LIMIT 0");
             ResultSetMetaData asd=nc.getMetaData();
             nrColoane = asd.getColumnCount(); //se aflla nr coloane
             columnName=new String[nrColoane]; 
             
             for (int i=0;i<nrColoane;i++){
                     columnName[i]=asd.getColumnName(i+1);//se adauga umele coloanei la String list[]
                    
             }//s-a creat lista cu coloanele pt Obiectul raportului
             ResultSet nrC  = stmt.executeQuery("SELECT count(*) FROM inventar "+query);
             nrRanduri=nrC.getInt(1); //se afla nr randuri
             
             //initializam lista de randuri cu valori ne-nule;
             
             ResultSet getRows  = stmt.executeQuery("SELECT * FROM inventar "+query);
             while (getRows.next()) {
                               ArrayList tempList=new ArrayList<String>();
                              for (int i=0;i<nrColoane;i++){
                                  
                                  String val=getRows.getString(columnName[i]);
                                  if (val!=null){     
                                     tempList.add(val);}else{tempList.add("");}
                        //se completeaza temp list cu cate un rand cu valori
                              }
                              listaInLista.add(tempList);
                        //se adauga randul de valori la lista mare
                    }
            //S-au creat ambele liste-->se poate merge la obiect si afisare tabel
           
            Object[][] data=new Object[listaInLista.size()][nrColoane];//[312][35]
    
             for(int rand=0;rand<listaInLista.size();rand++) {
                              for (int col=0;col<nrColoane;col++ ){
                                  data[rand][col]=listaInLista.get(rand).get(col);
                              }
                }
             
             return data;     
           } 
    public String[] getCols(){return columnName;}
    public void updateInventory(String query){
    try {
            Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             stmt.executeUpdate(query);
        }
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void updateAssets (String id,ArrayList<String> list){
        String deskID=id;
        
     try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
              
       //Schimba asset tag computer
       if (list.get(0).equals(list.get(1))){System.out.println("sunt eegale");}//do nothing
       
       else{//1.nu sunt egale si continua
           if(list.get(0).equals("")){stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(1)+"' ");}
           //pana aici s-a sters campul,si se scoate din inventar cel vechi
           else{
           ResultSet rs    = stmt.executeQuery("SELECT DeskID,SystemAssetID FROM inventory WHERE SystemAssetID='"+list.get(0)+"' AND AssetType='Desktop'");
           boolean exists=rs.next(); 
           if (exists==true){
           String desk=rs.getString("DeskID");
           if(!"none".equals(desk)){JOptionPane.showMessageDialog(null, "Desktop Asset will be removed from Desk ID "+desk+" !");}   
           
           stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(1)+"' ");
           stmt.executeUpdate("UPDATE inventory SET DeskID='"+deskID+"' WHERE SystemAssetID='"+list.get(0)+"' ");
          
         }else{JOptionPane.showMessageDialog(null, "Inserted Desktop AssetTag does not exist in the inventory");}
       }}
           //  stmt.executeUpdate(updateMonitor1);
           
           
           if (list.get(3).equals(list.get(2))){System.out.println("sunt eegale");}//do nothing
           else{
           if (list.get(2).equals("")){stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(3)+"' ");}
           else{
           ResultSet rs    = stmt.executeQuery("SELECT DeskID FROM inventory WHERE SystemAssetID='"+list.get(2)+"' AND AssetType='Monitor'");
           boolean monitorExists=rs.next();
           
           if (monitorExists==true){
           String desk=rs.getString("DeskID");
           if(!"none".equals(desk)){JOptionPane.showMessageDialog(null, "Monitor1 Asset will be removed from Desk ID "+desk+" !");}
           stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(3)+"' ");
           stmt.executeUpdate("UPDATE inventory SET DeskID='"+deskID+"' WHERE SystemAssetID='"+list.get(2)+"' ");}
           else{JOptionPane.showMessageDialog(null, "Inserted Monitor 1 AssetTag does not exist in the inventory");}
           }}
             
//stmt.executeUpdate(updateMon2);
           if (list.get(5).equals(list.get(4))){System.out.println("sunt eegale");}//do nothing
           else{
           if (list.get(4).equals("")){stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(5)+"' ");}
           else{
           ResultSet rs    = stmt.executeQuery("SELECT DeskID FROM inventory WHERE SystemAssetID='"+list.get(4)+"' AND AssetType='Monitor'");
           boolean monitorExists=rs.next();
           
           if (monitorExists==true){
           String desk=rs.getString("DeskID");
           if(!"none".equals(desk)){JOptionPane.showMessageDialog(null, "Monitor2 Asset will be removed from Desk ID "+desk+" !");}
           stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(5)+"' ");
           stmt.executeUpdate("UPDATE inventory SET DeskID='"+deskID+"' WHERE SystemAssetID='"+list.get(4)+"' ");}
           else{JOptionPane.showMessageDialog(null, "Inserted Monitor 1 AssetTag does not exist in the inventory");}
           }}
//TELEFON
//stmt.executeUpdate(updateMon2);
           if (list.get(7).equals(list.get(6))){System.out.println("sunt eegale");}//do nothing
           else{
           if (list.get(6).equals("")){stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(7)+"' ");}
           else{
           ResultSet rs    = stmt.executeQuery("SELECT DeskID FROM inventory WHERE SystemAssetID='"+list.get(6)+"' AND AssetType='Ip Phone'");
           boolean monitorExists=rs.next();
           
           if (monitorExists==true){
           String desk=rs.getString("DeskID");
           if(!"none".equals(desk)){JOptionPane.showMessageDialog(null, "Phone Asset will be removed from Desk ID "+desk+" !");}
           stmt.executeUpdate("UPDATE inventory SET DeskID='none' WHERE SystemAssetID='"+list.get(7)+"' ");
           stmt.executeUpdate("UPDATE inventory SET DeskID='"+deskID+"' WHERE SystemAssetID='"+list.get(6)+"' ");}
           else{JOptionPane.showMessageDialog(null, "Inserted IPPhone AssetTag does not exist in the inventory");}
           }}
     }
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    
    }//update ASSETS
    public void insertNewProduct (String Category,String Item, String itemCode,Double purchaseCost,Double sellingCost,Double Quantity){
       try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
              
           stmt.executeUpdate("INSERT INTO inventar (Category,Item,ItemCode,PurchaseCost,SellingCost,StockQuantity) VALUES ('"+Category+"','"+Item+"','"+itemCode+"',"+purchaseCost+","+sellingCost+","+Quantity+") ");
           JOptionPane.showMessageDialog(null, "New Product Added succesfully"); }
           
           catch (SQLException e) {
            System.out.println(e.getMessage());
             }
            }
    public void buyProduct (String Item, Double Quantity,Double purchaseCost){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
        Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime()); 
        Double oldquantity=0.0;
        String category="";
        String itemCode="";
        //get curent stats:
       try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet getOldQuantity    = stmt.executeQuery("SELECT Category,ItemCode,StockQuantity FROM inventar WHERE Item='"+Item+"'  ")){
             oldquantity=getOldQuantity.getDouble("StockQuantity");
             category=getOldQuantity.getString("Category");
             itemCode=getOldQuantity.getString("ItemCode");
           } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //set new quantity in inventar table
        oldquantity=oldquantity+Quantity;
         try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
              
           stmt.executeUpdate("UPDATE inventar SET StockQuantity="+oldquantity+" ,PurchaseCost="+purchaseCost+" WHERE Item='"+Item+"'  ");
          
            }
           
           catch (SQLException e) {
            System.out.println(e.getMessage());
             }
         //editare tabel tranzactii
          try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
              System.out.println(ts);  
          stmt.executeUpdate("INSERT INTO transactions (Category,Item,ItemCode,TransactionType,BuyPrice,SellPrice,Quantity,TransactionDate) VALUES ('"+category+"','"+Item+"','"+itemCode+"','BUY',"+purchaseCost+",'0',"+Quantity+",'"+ts+"') ");
           JOptionPane.showMessageDialog(null, "Transaction Completed"); }
           
           catch (SQLException e) {
            System.out.println(e.getMessage());
             }
         
    }
    public void sellProduct (String Item, Double Quantity,Double purchaseCost){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
        Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime()); 
        Double oldquantity=0.0;
        String category="";
        String itemCode="";
        //get curent stats:
       try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet getOldQuantity    = stmt.executeQuery("SELECT Category,ItemCode,StockQuantity FROM inventar WHERE Item='"+Item+"'  ")){
             oldquantity=getOldQuantity.getDouble("StockQuantity");
             category=getOldQuantity.getString("Category");
             itemCode=getOldQuantity.getString("ItemCode");
           } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //set new quantity in inventar table
        oldquantity=oldquantity-Quantity;
         try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
              
           stmt.executeUpdate("UPDATE inventar SET StockQuantity="+oldquantity+" ,PurchaseCost="+purchaseCost+" WHERE Item='"+Item+"'  ");
          
            }
           
           catch (SQLException e) {
            System.out.println(e.getMessage());
             }
         //editare tabel tranzactii
          try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
              System.out.println(ts);  
          stmt.executeUpdate("INSERT INTO transactions (Category,Item,ItemCode,TransactionType,BuyPrice,SellPrice,Quantity,TransactionDate) VALUES ('"+category+"','"+Item+"','"+itemCode+"','SELL','0',"+purchaseCost+","+Quantity+",'"+ts+"') ");
           JOptionPane.showMessageDialog(null, "Transaction Completed"); }
           
           catch (SQLException e) {
            System.out.println(e.getMessage());
             }
         
    }
    public ArrayList<String> getProdDetails (String Item){
           ArrayList<String> lista=new ArrayList<>();
           Double purchaseCost=0.0;
           String itemCode="";
        
       try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet getstats    = stmt.executeQuery("SELECT ItemCode,PurchaseCost FROM inventar WHERE Item='"+Item+"'  ")){
             purchaseCost=getstats.getDouble("PurchaseCost");
             itemCode=getstats.getString("ItemCode");
             lista.add(itemCode);lista.add(String.valueOf(purchaseCost));
           } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    
    
    
        return lista;
    }
    
    
    
    
    public ArrayList<String> getForSearch(String id){
        String deskID=id;
        ArrayList<String> lista=new ArrayList<>();
        for (int i=0;i<5;i++){lista.add("none");}
        String user = "SELECT name,uid FROM users WHERE DeskID="+deskID+" AND DeskID<>'1000' ";
        String computer = "SELECT Hostname FROM inventory WHERE AssetType='Desktop' AND DeskID="+deskID+" ";
        String phone = "SELECT Extension FROM inventory WHERE AssetType='Ip Phone' AND DeskID="+deskID+" ";
        
        
     //get and ADD USER DATA   
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rsUser    = stmt.executeQuery(user)){
            
            // loop through the result set
           
            while (rsUser.next()) {
             lista.set(0,rsUser.getString("name"));
            
            }
         } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //get and ADD USER DATA   
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rsUser    = stmt.executeQuery(user)){
            
            // loop through the result set
           
            while (rsUser.next()) {
             lista.set(3,rsUser.getString("uid"));
            
            }
         } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //get COMPUTER data
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(computer)){
            
            // loop through the result set
           
            while (rs.next()) {
             lista.set(1,rs.getString("Hostname")); 
             
             }
        
        } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        //get PHONE data
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(phone)){
            
            // loop through the result set
           
            while (rs.next()) {
             lista.set(2,rs.getString("Extension")); 
             
             
              }
        
        } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return lista;
    }
    
    public ArrayList<String> getAllCategories(){
        
        ArrayList<String> listaCategorii=new ArrayList<>();
        String categorie = "SELECT DISTINCT Category FROM inventar";
        //get and ADD Category  
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet getCat    = stmt.executeQuery(categorie)){
        // loop through the result set
            while (getCat.next()) {
             String categorieTmp=getCat.getString("Category");
                listaCategorii.add(categorieTmp);
                
             
            }
         } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaCategorii;
    }
    public ArrayList<String> getAllProducts(){
        
        ArrayList<String> listaProduse=new ArrayList<>();
        String categorie = "SELECT Item FROM inventar";
        System.out.println("S-a executat functia getAllCategories()");
        //get and ADD Category  
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet getCat    = stmt.executeQuery(categorie)){
        // loop through the result set
            while (getCat.next()) {
             String categorieTmp=getCat.getString("Item");
                listaProduse.add(categorieTmp);
            }
         } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaProduse;
    }
    
    
    public void chgPassword(String pass){
       String updateUsr="UPDATE admin SET pass='"+pass+"'  WHERE name='wns2kadmin' ";
        try {
            Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             stmt.executeUpdate(updateUsr);
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public String[] getTooltip(String id){
        
        String deskID=id;
        String[] lista=new String[4];
        for (int i=0;i<4;i++){lista[i]="none";}
        String user = "SELECT name,uid FROM users WHERE DeskID="+deskID+" ";
        String computer = "SELECT Hostname FROM inventory WHERE AssetType='Desktop' AND DeskID="+deskID+" ";
        String phone = "SELECT Extension FROM inventory WHERE AssetType='Ip Phone' AND DeskID="+deskID+" ";
        
        
     //get and ADD USER DATA   
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rsUser    = stmt.executeQuery(user)){
            
            // loop through the result set
           
            while (rsUser.next()) {
             lista[0]=rsUser.getString("name");
            
            }
         } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //get and ADD USER DATA   
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rsUser    = stmt.executeQuery(user)){
            
            // loop through the result set
           
            while (rsUser.next()) {
             lista[1]=rsUser.getString("uid");
            
            }
         } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //get COMPUTER data
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(computer)){
              // loop through the result set
             while (rs.next()) {
             lista[2]=rs.getString("Hostname"); 
            }
        
        } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        //get PHONE data
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(phone)){
            
            // loop through the result set
           
            while (rs.next()) {
             lista[3]=rs.getString("Extension"); 
             
             
              }
        
        } 
       catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return lista;
    }
    public static void main(String[] args) {
        
        
        
    }

    
}
