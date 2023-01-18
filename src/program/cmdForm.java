
package program;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author wns2kadmin
 */
public class cmdForm extends javax.swing.JFrame {
//String property = "java.io.tmpdir";//dir temp al windowsului
//String exepath =System.getProperty(property)+"wnsAppTemp"; //path-ul catre exe files
//String PsExec=exepath+"/PsExec.exe";
//String wol=exepath+"/wol.exe";
 String PsExec="data/PsExec.exe"; 
 String wol="data/wol.exe";
String hostname;
String mac;

          //get from run
        
        
      
    public cmdForm(String host,String macAdress) {
        hostname=host;
        mac=macAdress;
        initComponents();
        this.setVisible(true);//asta face figuri la cum porneste
        hostnameLabel.setText("Commands are aplying to: "+host);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hostnameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        damewareButton = new javax.swing.JButton();
        chgpsswdButton = new javax.swing.JButton();
        wakeButton = new javax.swing.JButton();
        textArea = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));

        hostnameLabel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        hostnameLabel.setText("jLabel1");
        hostnameLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jButton1.setText("Ping Host");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logoff user");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        damewareButton.setText("Dameware Connect");
        damewareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damewareButtonActionPerformed(evt);
            }
        });

        chgpsswdButton.setText("Change admin pass");
        chgpsswdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpsswdButtonActionPerformed(evt);
            }
        });

        wakeButton.setText("Wake Computer");
        wakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wakeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(damewareButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chgpsswdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(damewareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chgpsswdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        textArea.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hostnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hostnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       executePing(); 
               // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        logoff(); // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        restart();// TODO add your handling code here:
    }//GEN-LAST:event_restartButtonActionPerformed

    private void damewareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damewareButtonActionPerformed
      damePath();
        // TODO add your handling code here:
    }//GEN-LAST:event_damewareButtonActionPerformed

    private void chgpsswdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpsswdButtonActionPerformed
         chgpass();         // TODO add your handling code here:
    }//GEN-LAST:event_chgpsswdButtonActionPerformed

    private void wakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wakeButtonActionPerformed
         wakeOnLan();        // TODO add your handling code here:
    }//GEN-LAST:event_wakeButtonActionPerformed
   public void damePath(){
      String[] list=new dbConnection().getForDameware();
      String path=list[1];
      String pass=list[0];
      
      if (new File(path).exists() && path.contains("DWRCC")){
             try {
                Runtime rt = Runtime.getRuntime();
                
                Process pr = rt.exec(path+" -c: -h: -a:1 -m:"+hostname+" -u:wns2kadmin -p:"+pass);
                
                //Process pr = rt.exec("cmd /c ping "+hostname);
                //Process pr = rt.exec(exepath+"/PsExec.exe");
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                String line=null;
 
                while((line=input.readLine()) != null) {
                    textArea.append(line+"\n");
                    
                }
  } catch(Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
          }else{
             JOptionPane.showMessageDialog(this, "Path to Dameware is not set.Please select location of DWRCC.exe");
             JFileChooser chooser = new JFileChooser();
             chooser.setCurrentDirectory(new java.io.File("."));
              chooser.setDialogTitle("Please choose DWRCC.exe file");
             chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
             chooser.setFileFilter(new FileNameExtensionFilter(".exe","exe"));
             
             if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                  path=chooser.getSelectedFile().getAbsolutePath();
                 new dbConnection().setForDameware(path);
                     
                     } else {}
      
                } //file chooser
      }
    
   public void chgpass(){
      // new dbConnection().chgPassword("asd");
       String input = JOptionPane.showInputDialog("Please enter new password");
    if (input == null) { System.out.println("The user canceled");
     }else{new dbConnection().chgPassword(input);
    }
   }
   
   public void executePing(){
 try {
                Runtime rt = Runtime.getRuntime();
                
                //Process pr = rt.exec("cmd /d dir");
                Process pr = rt.exec("cmd /c ping "+hostname);
                //Process pr = rt.exec(exepath+"/PsExec.exe");
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                String line=null;
 
                while((line=input.readLine()) != null) {
                    textArea.append(line+"\n");
                    System.out.println(line);
                }
            } catch(Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
 } 
   public void logoff(){
       String logoff=PsExec+" -accepteula \\\\"+hostname+" logoff console";
 try {
                Runtime rt = Runtime.getRuntime();
                
                //Process pr = rt.exec("cmd /d dir");
                //Process pr = rt.exec("cmd /c ping "+hostname);
                Process pr = rt.exec(logoff);
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                String line=null;
 
                while((line=input.readLine()) != null) {
                    textArea.append(line+"\n");
                    System.out.println(line);
                    this.repaint();
                }
 
                
 
            } catch(Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
 }   
   public void restart(){
       String restart=PsExec+" -accepteula \\\\"+hostname+" shutdown -r";
       try {
                Runtime rt = Runtime.getRuntime();
                //Process pr = rt.exec("cmd /d dir");
                //Process pr = rt.exec("cmd /c ping "+hostname);
                Process pr = rt.exec(restart);
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                String line=null;
                while((line=input.readLine()) != null) {
                    textArea.append(line+"\n");
                    System.out.println(line);
                    this.repaint();
                }
 
                int exitVal = pr.waitFor();
                System.out.println("Exited with error code "+exitVal);
 
            } catch(Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
 }
   public void wakeOnLan (){
      
       String wake=wol+" "+mac;
       try {
                Runtime rt = Runtime.getRuntime();
                
                //Process pr = rt.exec("cmd /d dir");
                //Process pr = rt.exec("cmd /c ping "+hostname);
                Process pr = rt.exec(wake);
                BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                String line=null;
 
                while((line=input.readLine()) != null) {
                    textArea.append(line+"\n");
                   
                    this.repaint();
                }
 
                int exitVal = pr.waitFor();
                System.out.println("Exited with error code "+exitVal);
 
            } catch(Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }
 }
      
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chgpsswdButton;
    private javax.swing.JButton damewareButton;
    private javax.swing.JLabel hostnameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton restartButton;
    private java.awt.TextArea textArea;
    private javax.swing.JButton wakeButton;
    // End of variables declaration//GEN-END:variables
}
