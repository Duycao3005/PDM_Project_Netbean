
package view;


public class UpdatePaymentFrame extends javax.swing.JFrame {
    
    private int paymentId;
    private service.PaymentService paymentService = new service.PaymentService();

    public UpdatePaymentFrame() {
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE); // Không tắt cả app
    }

    public void setPaymentData(int id, int billId, String date, double amount, String method) {
        this.paymentId = id;
        txtBillId.setText(String.valueOf(billId));
        txtDate.setText(date);
        txtAmount.setText(String.valueOf(amount));
        txtMethod.setText(method);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBillId = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtMethod = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBillId.addActionListener(this::txtBillIdActionPerformed);

        btnSave.setText("Save");
        btnSave.addActionListener(this::btnSaveActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("UPDATE PAYMENT");

        jLabel2.setText("Payment ID:");

        jLabel3.setText("Bill ID:");

        jLabel4.setText("Amount Paid:");

        jLabel5.setText("Payment Method:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addGap(0, 110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtBillId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBillId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            int billId = Integer.parseInt(txtBillId.getText());
            String date = txtDate.getText();
            double amount = Double.parseDouble(txtAmount.getText());
            String method = txtMethod.getText();

            paymentService.updatePayment(paymentId, billId, date, amount, method);
            javax.swing.JOptionPane.showMessageDialog(this, "Update succeed!");
            this.dispose(); // Đóng form
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBillIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBillId;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtMethod;
    // End of variables declaration//GEN-END:variables
}
