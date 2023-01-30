/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.DeliveryPackage;
import Model.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author emi
 */
public class EditPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    
    DeliveryPackage delPackage;
  
    public EditPanel() {
        initComponents();
    }
    
    EditPanel(DeliveryPackage delPackage){
        initComponents();
        this.delPackage = delPackage;

        displayPackage();
        displayProductList();
    }
    
    public void displayPackage(){
        editCustName.setText(this.delPackage.getCustomer().getFullName());
        editCustId.setText(String.valueOf(this.delPackage.getCustomer().getCustId()));
        editPackageId.setText(String.valueOf(this.delPackage.getPackageId()));
        editPackageWeight.setText(String.valueOf(this.delPackage.getPackageWeight()));
        
        //these three fields will not allow changes
        editCustName.setEditable(false);
        editCustId.setEditable(false);
        editPackageId.setEditable(false);
        
        
    }
    
    public void displayProductList(){
        for (Product p: delPackage.getProductList()){
            productIdComboBoxForEdit.addItem(p.getProductId());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updatePackageButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        editPackageId = new javax.swing.JTextField();
        editProductId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        editProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editPrice = new javax.swing.JTextField();
        editPackageWeight = new javax.swing.JTextField();
        editCustName = new javax.swing.JTextField();
        editCustId = new javax.swing.JTextField();
        productIdComboBoxForEdit = new javax.swing.JComboBox();
        showButtonForEdit = new javax.swing.JButton();
        updateProductButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        updatePackageButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updatePackageButton.setText("Update Package");
        updatePackageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePackageButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setText("Package ID");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("Package Weight");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Product ID");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setText("Product Name");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setText("Product Price");

        editPackageId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPackageIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Customer Full Name");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Customer ID");

        editPackageWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPackageWeightActionPerformed(evt);
            }
        });

        showButtonForEdit.setText("Show");
        showButtonForEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonForEditActionPerformed(evt);
            }
        });

        updateProductButton.setText("Update Product");
        updateProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(62, 62, 62))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(productIdComboBoxForEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showButtonForEdit)
                            .addComponent(editProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editPackageId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editPackageWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(editCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(editCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(updateProductButton)
                                    .addComponent(updatePackageButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(6, 6, 6))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(editCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(editPackageId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(editPackageWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addComponent(updatePackageButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productIdComboBoxForEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showButtonForEdit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(editProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(editProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(editPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(updateProductButton)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editPackageIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPackageIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPackageIdActionPerformed

    private void editPackageWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPackageWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPackageWeightActionPerformed

    private void showButtonForEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonForEditActionPerformed
        // TODO add your handling code here:
        
        int pidSelected = (int) productIdComboBoxForEdit.getSelectedItem();
        Product productSelected = delPackage.findProductById(pidSelected);
        
        //show product details that alrady exist
        if (productSelected != null){
            editProductId.setText(String.valueOf(productSelected.getProductId()));
            editProductName.setText(productSelected.getProductName());
            editPrice.setText(String.valueOf(productSelected.getProductPrice()));
        }else{
            JOptionPane.showMessageDialog(null, "Product Not Found");
        }
        
        //productId will not allow changes
        editProductId.setEditable(false);
    }//GEN-LAST:event_showButtonForEditActionPerformed

    private void updateProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductButtonActionPerformed
        // TODO add your handling code here:
        
        int pidSelected = (int) productIdComboBoxForEdit.getSelectedItem();
        Product productSelected = delPackage.findProductById(pidSelected);
        
        //set the product name and price to the updated value (id does not allow changes)
        productSelected.setProductName(editProductName.getText());
        productSelected.setProductPrice(Double.valueOf(editPrice.getText()));
    }//GEN-LAST:event_updateProductButtonActionPerformed
    
    
    private void updatePackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePackageButtonActionPerformed
        // TODO add your handling code here:
        delPackage.setPackageWeight(Double.valueOf(editPackageWeight.getText()));
    }//GEN-LAST:event_updatePackageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editCustId;
    private javax.swing.JTextField editCustName;
    private javax.swing.JTextField editPackageId;
    private javax.swing.JTextField editPackageWeight;
    private javax.swing.JTextField editPrice;
    private javax.swing.JTextField editProductId;
    private javax.swing.JTextField editProductName;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox productIdComboBoxForEdit;
    private javax.swing.JButton showButtonForEdit;
    private javax.swing.JButton updatePackageButton;
    private javax.swing.JButton updateProductButton;
    // End of variables declaration//GEN-END:variables


}
