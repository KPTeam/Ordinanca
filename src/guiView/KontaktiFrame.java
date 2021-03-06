/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiView;

import buisnessLogic.AppException;
import buisnessLogic.Controller;
import buisnessLogic.KontaktiInterface;
import buisnessLogic.KontaktiRepository;
import database.Kontakti;
import database.Pacienti;
import guiModel.KontaktiModelTable;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class KontaktiFrame extends javax.swing.JInternalFrame {
    Pacienti p;
    KontaktiInterface kontaktiInterface = new KontaktiRepository();
    KontaktiModelTable kontaktiModel = new KontaktiModelTable();
    Controller cr = new Controller();
    
    public KontaktiFrame(Pacienti P) {
        initComponents();
        this.p = P;
        emriPacienti.setText(P.getEmri() + "   " +P.getMbiemri()); 
        tableLoad();
        tableMoveKey();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tel1Label = new javax.swing.JLabel();
        tel2Label = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emriPacienti = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        tel1TextField = new javax.swing.JTextField();
        tel2TextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        tel1Label.setText("Tel 1:");

        tel2Label.setText("Tel 2:");

        emailLabel.setText("E-mail :");

        createButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/add.png"))); // NOI18N
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createButton.setMaximumSize(new java.awt.Dimension(53, 53));
        createButton.setMinimumSize(new java.awt.Dimension(53, 53));
        createButton.setPreferredSize(new java.awt.Dimension(53, 53));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editButton.setMaximumSize(new java.awt.Dimension(53, 53));
        editButton.setMinimumSize(new java.awt.Dimension(53, 53));
        editButton.setPreferredSize(new java.awt.Dimension(53, 53));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Pacienti");

        emriPacienti.setText("jLabel3");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(table);

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delet.png"))); // NOI18N
        Delete.setMaximumSize(new java.awt.Dimension(53, 53));
        Delete.setMinimumSize(new java.awt.Dimension(53, 53));
        Delete.setPreferredSize(new java.awt.Dimension(53, 53));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cncl.png"))); // NOI18N
        cancel.setMaximumSize(new java.awt.Dimension(53, 53));
        cancel.setMinimumSize(new java.awt.Dimension(53, 53));
        cancel.setPreferredSize(new java.awt.Dimension(53, 53));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        tel1TextField.setMaximumSize(new java.awt.Dimension(150, 20));
        tel1TextField.setPreferredSize(new java.awt.Dimension(150, 20));

        tel2TextField.setMaximumSize(new java.awt.Dimension(150, 20));
        tel2TextField.setPreferredSize(new java.awt.Dimension(150, 20));

        emailTextField.setMaximumSize(new java.awt.Dimension(150, 20));
        emailTextField.setPreferredSize(new java.awt.Dimension(150, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emriPacienti))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tel2Label)
                                    .addComponent(emailLabel)
                                    .addComponent(tel1Label))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tel1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tel2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tel1Label)
                                    .addComponent(tel1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tel2Label)
                                    .addComponent(tel2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(emriPacienti))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        createButton.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try{
            Kontakti k = new Kontakti();
      
        k.setEmail(cr.email(emailTextField.getText()));
        k.setNrtel1(cr.vetemNumra(tel1TextField.getText(),"Tel 1"));
        k.setNrtel2(cr.vetemNumra(tel2TextField.getText(), "Tel 2"));
        k.setPacientiID(p);
        kontaktiInterface.create(k);
        tableLoad();
        clearFields();
        }
        catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
            try{
            Kontakti k = kontaktiModel.getKontakti(row);
      
        k.setEmail(cr.email(emailTextField.getText()));
        k.setNrtel1(cr.vetemNumra(tel1TextField.getText(),"Tel 1"));
        k.setNrtel2(cr.vetemNumra(tel2TextField.getText(), "Tel 2"));
        k.setPacientiID(p);
        kontaktiInterface.edit(k);
        tableLoad();
        clearFields();
        }
        catch (AppException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        }
         else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te edituar!");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       int row=table.getSelectedRow();
        if(row!=-1){
            Kontakti k=kontaktiModel.getKontakti(row);
            kontaktiInterface.delete(k);
            clearFields();
            tableLoad();

        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       clearFields();
    }//GEN-LAST:event_cancelActionPerformed
    private void clearFields()
    {
        tel1TextField.setText("");
        tel2TextField.setText("");
        emailTextField.setText("");
    }
    
     private void tableLoad(){
       List<Kontakti>listKontakti=kontaktiInterface.findAll();
        kontaktiModel.add(listKontakti);
        table.setModel(kontaktiModel);
        kontaktiModel.fireTableDataChanged(); 
    }
     private void tableMoveKey(){
        ListSelectionModel rowSM = table.getSelectionModel();
        
        rowSM.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting())
                    return; // if you don't want to handle intermediate selections
                ListSelectionModel rowSM = (ListSelectionModel)e.getSource();
                int selectedIndex = rowSM.getMinSelectionIndex();
                if(selectedIndex > -1){
                    Kontakti k= kontaktiModel.getKontakti(selectedIndex);
                    tel1TextField.setText(k.getNrtel1());
                    tel2TextField.setText(k.getNrtel2());
                    emailTextField.setText(k.getEmail());
                       
                }
            }
        });
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton cancel;
    private javax.swing.JButton createButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emriPacienti;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table;
    private javax.swing.JLabel tel1Label;
    private javax.swing.JTextField tel1TextField;
    private javax.swing.JLabel tel2Label;
    private javax.swing.JTextField tel2TextField;
    // End of variables declaration//GEN-END:variables
}
