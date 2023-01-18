/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.*;


public class SingleDesk extends java.awt.Frame {
public String deskID="";
public String host;
public String macAdress;
public ArrayList<String> list=new ArrayList<>();
public boolean editedUser=false;
public boolean editedDesk=false;
public boolean editedTag=false;
    
    public SingleDesk(String id) {
     deskID=id;
     
     initComponents();  
     setTexts();
   }
   private void setTexts (){
        
        dbConnection conn=new dbConnection();
        list=conn.getAll(deskID);
        idField.setText(deskID);
        lanSocketField.setText("n/a");
        nameField.setText(list.get(0));
        uIdField.setText(list.get(1));
        avayaField.setText(list.get(2));
        proffField.setText(list.get(3));
        lanSocketField.setText(list.get(4));
        hostnameField.setText(list.get(5));
        host=list.get(5);//pentru commands trebuie hostame string
        macAdress=list.get(11);//pentru commands trebuie MAC string
        computerAssetField.setText(list.get(6));
        m1AssetField.setText(list.get(7));
        m2AssetField.setText(list.get(8));
        phoneField.setText(list.get(9));
        phoneAssetField.setText(list.get(10));
        macField.setText(list.get(11));
   }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        phoneField1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hostnameField = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        phoneField = new javax.swing.JTextPane();
        editDeskButton = new javax.swing.JButton();
        cmdButton = new javax.swing.JButton();
        cancel2 = new javax.swing.JButton();
        cancel2.setVisible(false);
        jScrollPane13 = new javax.swing.JScrollPane();
        macField = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        m1AssetField = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        computerAssetField = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        m2AssetField = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        phoneAssetField = new javax.swing.JTextPane();
        assetMovementButton = new javax.swing.JButton();
        cancel3 = new javax.swing.JButton();
        cancel3.setVisible(false);
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        uIdField = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        nameField = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        avayaField = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        proffField = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        idField = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        editUserButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cancel1 = new javax.swing.JButton();
        cancel1.setVisible(false);
        lanSocketField = new javax.swing.JTextField();

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("IP Phone:");
        jLabel15.setToolTipText("");

        phoneField1.setEditable(false);
        phoneField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane12.setViewportView(phoneField1);

        setBounds(new java.awt.Rectangle(400, 100, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DESK INFORMATION"));
        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Hostname:");
        jLabel1.setToolTipText("");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        hostnameField.setEditable(false);
        hostnameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        hostnameField.setAutoscrolls(false);
        jScrollPane1.setViewportView(hostnameField);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("IP Phone:");
        jLabel5.setToolTipText("");

        phoneField.setEditable(false);
        phoneField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane3.setViewportView(phoneField);

        editDeskButton.setText("EDIT INFORMATION");
        editDeskButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editDeskButton.setMaximumSize(new java.awt.Dimension(130, 21));
        editDeskButton.setMinimumSize(new java.awt.Dimension(130, 21));
        editDeskButton.setPreferredSize(new java.awt.Dimension(130, 21));
        editDeskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDeskButtonActionPerformed(evt);
            }
        });

        cmdButton.setText("EXEC. COMMANDS");
        cmdButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmdButton.setMaximumSize(new java.awt.Dimension(130, 21));
        cmdButton.setMinimumSize(new java.awt.Dimension(130, 21));
        cmdButton.setPreferredSize(new java.awt.Dimension(130, 21));
        cmdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdButtonActionPerformed(evt);
            }
        });

        cancel2.setText("CANCEL");
        cancel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel2ActionPerformed(evt);
            }
        });

        macField.setEditable(false);
        macField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane13.setViewportView(macField);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("MAC:");
        jLabel16.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editDeskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editDeskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        editDeskButton.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("ASSET TAGS"));
        jPanel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("IP Phone:");
        jLabel6.setToolTipText("");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        m1AssetField.setEditable(false);
        m1AssetField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane4.setViewportView(m1AssetField);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Monitor 1:");
        jLabel7.setToolTipText("");

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        computerAssetField.setEditable(false);
        computerAssetField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane5.setViewportView(computerAssetField);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        m2AssetField.setEditable(false);
        m2AssetField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane6.setViewportView(m2AssetField);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Computer:");
        jLabel8.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Monitor 2:");
        jLabel12.setToolTipText("");

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        phoneAssetField.setEditable(false);
        phoneAssetField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane10.setViewportView(phoneAssetField);

        assetMovementButton.setText("ASSET MOVEMENT");
        assetMovementButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assetMovementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetMovementButtonActionPerformed(evt);
            }
        });

        cancel3.setText("CANCEL");
        cancel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(assetMovementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(cancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(assetMovementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("USER INFORMATION"));
        jPanel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Telefon");
        jLabel9.setToolTipText("");

        uIdField.setEditable(false);
        uIdField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane7.setViewportView(uIdField);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("User ID:");
        jLabel10.setToolTipText("");

        nameField.setEditable(false);
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane8.setViewportView(nameField);

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        avayaField.setEditable(false);
        avayaField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane9.setViewportView(avayaField);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nume:");
        jLabel11.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Info:");
        jLabel13.setToolTipText("");

        proffField.setEditable(false);
        proffField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane11.setViewportView(proffField);

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(243, 238, 238));
        idField.setBorder(null);
        idField.setAutoscrolls(false);
        jScrollPane2.setViewportView(idField);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Desk ID:");
        jLabel4.setToolTipText("");

        editUserButton.setText("EDIT INFORMATION");
        editUserButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editUserButton.setMaximumSize(new java.awt.Dimension(130, 21));
        editUserButton.setMinimumSize(new java.awt.Dimension(130, 21));
        editUserButton.setPreferredSize(new java.awt.Dimension(130, 21));
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("IPphone");
        jLabel14.setToolTipText("");

        cancel1.setText("CANCEL");
        cancel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });

        lanSocketField.setEditable(false);
        lanSocketField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lanSocketField.setMinimumSize(new java.awt.Dimension(4, 20));
        lanSocketField.setPreferredSize(new java.awt.Dimension(4, 20));
        lanSocketField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanSocketFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lanSocketField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lanSocketField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       if (editedUser==false&&editedDesk==false&&editedTag==false){
        this.dispose();}
       else{
           Component frame = null;
       JOptionPane.showMessageDialog(frame, "You made some modifications.Please save to DB");
      }
       
 // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void assetMovementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetMovementButtonActionPerformed
       if (editedTag==false){
        editedTag=true;    
        computerAssetField.setEditable(true);
        m1AssetField.setEditable(true);
        m2AssetField.setEditable(true);
        phoneAssetField.setEditable(true);
        assetMovementButton.setText("SAVE");
        cancel3.setVisible(true);
        }else{
        computerAssetField.setEditable(false);
        m1AssetField.setEditable(false);
        m2AssetField.setEditable(false);
        phoneAssetField.setEditable(false);   
        ArrayList<String> ptSalvat=new ArrayList<>();
        ptSalvat.add(computerAssetField.getText().toUpperCase());
        ptSalvat.add(list.get(6));
        ptSalvat.add(m1AssetField.getText().toUpperCase());
        ptSalvat.add(list.get(7));
        ptSalvat.add(m2AssetField.getText().toUpperCase());
        ptSalvat.add(list.get(8));
        ptSalvat.add(phoneAssetField.getText().toUpperCase());
        ptSalvat.add(list.get(10));
        dbConnection conn=new dbConnection();
        conn.updateAssets(deskID, ptSalvat);
        list.set(6,computerAssetField.getText().toUpperCase());
        list.set(7,m1AssetField.getText().toUpperCase());
        list.set(8,m2AssetField.getText().toUpperCase());
        list.set(10,phoneAssetField.getText().toUpperCase());
        editedTag=false;
        cancel3.setVisible(false);
        setTexts();
        assetMovementButton.setText("ASSET MOVEMENT");}
        // TODO add your handling code here:
    }//GEN-LAST:event_assetMovementButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        if (editedUser==false){
        editedUser=true;    
        nameField.setEditable(true);
        uIdField.setEditable(true);
        avayaField.setEditable(true);
        proffField.setEditable(true);
        lanSocketField.setEditable(true);
        editUserButton.setText("SAVE");
        cancel1.setVisible(true);
        }else{
        nameField.setEditable(false);
        uIdField.setEditable(false);
        avayaField.setEditable(false);
        proffField.setEditable(false);
        lanSocketField.setEditable(false);
        ArrayList<String> ptSalvat=new ArrayList<>();
        ptSalvat.add(nameField.getText());
        ptSalvat.add(uIdField.getText());
        ptSalvat.add(avayaField.getText());
        ptSalvat.add(proffField.getText());
        ptSalvat.add(lanSocketField.getText());
        dbConnection conn=new dbConnection();
        conn.updateUser(deskID, ptSalvat);
        editedUser=false;
        cancel1.setVisible(false);
        editUserButton.setText("EDIT INFORMATION");}
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void editDeskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDeskButtonActionPerformed
        if (editedDesk==false){
        editedDesk=true;    
        phoneField.setEditable(true);
        hostnameField.setEditable(true);
        macField.setEditable(true);
        editDeskButton.setText("SAVE");
        cancel2.setVisible(true);
        }else{
        phoneField.setEditable(false);
        hostnameField.setEditable(false);
        macField.setEditable(false);
        ArrayList<String> ptSalvat=new ArrayList<>();
        ptSalvat.add(hostnameField.getText().toUpperCase());
        ptSalvat.add(list.get(6));
        ptSalvat.add(phoneField.getText());
        ptSalvat.add(list.get(10));
        ptSalvat.add(macField.getText());
        dbConnection conn=new dbConnection();
        conn.updateDesk(deskID, ptSalvat);
        editedDesk=false;
        cancel2.setVisible(false);
        editDeskButton.setText("EDIT INFORMATION");}
    }//GEN-LAST:event_editDeskButtonActionPerformed

    private void cmdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdButtonActionPerformed
        if (host.toLowerCase().contains("rom")){
        cmdForm form=new cmdForm(host,macAdress);
        //form.setVisible(true);
        }else{JOptionPane.showMessageDialog(null, "HOSTNAME NOT VALID");}
    }//GEN-LAST:event_cmdButtonActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        dbConnection conn=new dbConnection();
        list=conn.getAll(deskID);
        
        nameField.setText(list.get(0));
        uIdField.setText(list.get(1));
        avayaField.setText(list.get(2));
        proffField.setText(list.get(3));
        lanSocketField.setText(list.get(4)); 
        cancel1.setVisible(false);
         editedUser=false;// TODO add your handling code here:
         editUserButton.setText("EDIT INFORMATION");
    }//GEN-LAST:event_cancel1ActionPerformed

    private void cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel2ActionPerformed
        dbConnection conn=new dbConnection();
        list=conn.getAll(deskID);
        hostnameField.setText(list.get(5));
        phoneField.setText(list.get(9));
        macField.setText(list.get(11));
        cancel2.setVisible(false);
         editedDesk=false;// TODO add your handling code here:
         editDeskButton.setText("EDIT INFORMATION");
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel2ActionPerformed

    private void cancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel3ActionPerformed
       dbConnection conn=new dbConnection();
        list=conn.getAll(deskID);
        computerAssetField.setText(list.get(6));
        m1AssetField.setText(list.get(7));
        m2AssetField.setText(list.get(8));
        phoneAssetField.setText(list.get(10));
        cancel3.setVisible(false);
         editedTag=false;// TODO add your handling code here:
         assetMovementButton.setText("EDIT INFORMATION");
// TODO add your handling code here:
    }//GEN-LAST:event_cancel3ActionPerformed

    private void lanSocketFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanSocketFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lanSocketFieldActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assetMovementButton;
    private javax.swing.JTextPane avayaField;
    private javax.swing.JButton cancel1;
    private javax.swing.JButton cancel2;
    private javax.swing.JButton cancel3;
    private javax.swing.JButton cmdButton;
    private javax.swing.JTextPane computerAssetField;
    private javax.swing.JButton editDeskButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JTextPane hostnameField;
    private javax.swing.JTextPane idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField lanSocketField;
    private javax.swing.JTextPane m1AssetField;
    private javax.swing.JTextPane m2AssetField;
    private javax.swing.JTextPane macField;
    private javax.swing.JTextPane nameField;
    private javax.swing.JTextPane phoneAssetField;
    private javax.swing.JTextPane phoneField;
    private javax.swing.JTextPane phoneField1;
    private javax.swing.JTextPane proffField;
    private javax.swing.JTextPane uIdField;
    // End of variables declaration//GEN-END:variables
}
