/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author ThinkPad
 */
public class AddBillFrame extends javax.swing.JDialog {
    
    private Integer currentBillId = null;

// Hàm này được gọi từ BillFrame để đẩy dữ liệu cũ lên form
public void setBillToUpdate(model.Bill bill) {
    this.currentBillId = bill.getBillId();
    
    // Đổi giao diện cho phù hợp với Update
    jLabel1.setText("UPDATE BILL");
    jButton2.setText("SAVE"); // Đổi chữ nút ADD thành SAVE
    
    // Điền dữ liệu cũ vào các ô nhập
    jTextField2.setText(String.valueOf(bill.getMeterId()));
    jTextField4.setText(String.valueOf(bill.getTotalAmount()));
    
    // Xử lý tách chuỗi Ngày/Tháng/Năm để đưa lên 3 JComboBox
    if(bill.getBillingPeriod() != null && bill.getBillingPeriod().contains("/")) {
        String[] parts = bill.getBillingPeriod().split("/");
        if(parts.length == 3) {
            jComboBox1.setSelectedItem(parts[0]); // Ngày
            jComboBox2.setSelectedItem(parts[1]); // Tháng
            jComboBox3.setSelectedItem(parts[2]); // Năm
        }
    }
    
    // Chọn trạng thái
    if ("Paid".equalsIgnoreCase(bill.getStatus())) {
        jRadioButton1.setSelected(true);
    } else {
        jRadioButton2.setSelected(true);
    }
}
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddBillFrame.class.getName());

    public AddBillFrame(java.awt.Frame parent, boolean modal) {
    super(parent, modal); 
    initComponents();
    this.setModal(true); // ÉP THÊM MỘT LẦN NỮA Ở ĐÂY
    this.setLocationRelativeTo(parent);
}

// Hàm 2: Dùng để NetBeans Design không bị lỗi
    public AddBillFrame() {
    super((java.awt.Frame)null, true);
    initComponents();
    this.setLocationRelativeTo(null);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ADD BILL");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setText("Bill ID:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel3.setText("Meter :");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));

        jLabel4.setText("Period :");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(this::cancelButtonActionPerformed);

        jLabel5.setText("Total:");

        jButton2.setText("ADD");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel6.setText("Status:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Paid ");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Unpaid ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4)
                                .addComponent(jTextField2)
                                .addComponent(jTextField1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelButton)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(125, 125, 125)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cancelButton))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
 
    this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        // 1. Lấy dữ liệu từ giao diện
        int meterId = Integer.parseInt(jTextField2.getText().trim());

        String day = jComboBox1.getSelectedItem().toString();
        String month = jComboBox2.getSelectedItem().toString();
        String year = jComboBox3.getSelectedItem().toString();
        String period = day + "/" + month + "/" + year; 

        double totalAmount = Double.parseDouble(jTextField4.getText().trim());

        String status = "Unpaid"; 
        if (jRadioButton1.isSelected()) {
            status = "Paid";
        } else if (jRadioButton2.isSelected()) {
            status = "Unpaid";
        }

        // 2. Tạo đối tượng Bill và set giá trị
        model.Bill newBill = new model.Bill();
        newBill.setMeterId(meterId);
        newBill.setBillingPeriod(period);
        newBill.setTotalAmount(totalAmount);
        newBill.setStatus(status);

        long millis = System.currentTimeMillis();
        newBill.setIssueDate(new java.sql.Date(millis)); 
        newBill.setDueDate(new java.sql.Date(millis + (30L * 24 * 60 * 60 * 1000)));

        // 3. Gọi Service để Thêm hoặc Cập nhật vào Database
        service.BillService service = new service.BillService();
        
        if (this.currentBillId == null) {
            // Chế độ THÊM MỚI
            service.addBill(newBill);
            javax.swing.JOptionPane.showMessageDialog(this, "Add Bill Succeed!");
        } else {
            // Chế độ CẬP NHẬT
            newBill.setBillId(this.currentBillId); // Gắn ID cũ vào để Update
            service.updateBill(newBill);
            javax.swing.JOptionPane.showMessageDialog(this, "Update Bill Succeed!");
        }

        // 4. Đóng form (KHÔNG CÒN dòng thông báo dư thừa ở đây nữa)
        this.dispose(); 

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Input the right type for Meter ID and Total!", "Type Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
        // Sử dụng FlatLightLaf thay vì FlatDarkLaf
        com.formdev.flatlaf.FlatLightLaf.setup();
    } catch (Exception ex) {
        java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, "Không thể tải Light Mode", ex);
    }

    // 2. Chạy ứng dụng
    java.awt.EventQueue.invokeLater(() -> {
        new MainFrame().setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
