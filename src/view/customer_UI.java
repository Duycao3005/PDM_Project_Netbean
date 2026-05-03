
package view;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.UIManager;
import java.awt.CardLayout;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class customer_UI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(customer_UI.class.getName());
    private String loggedInUser;
    /**
     * Creates new form customer_UI
     */
    public customer_UI(String username) {
        initComponents();
        this.setTitle("Water Management System Customer");
        this.loggedInUser = username;
        jTable1.setRowHeight(30);
jTable1.setShowGrid(false);
jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
Main_Panel.add(Bill_Panel, "BILL");
Main_Panel.add(Wate_usagge_information_Panel, "WATER");
Main_Panel.add(Payment_Panel, "PAYMENT");
Main_Panel.add(Feedback_Panel, "FEEDBACK");
Main_Panel.add(Detail_information_Panel, "INFO");
jTextField11.setEditable(false);
jTextField12.setEditable(false);
jTextField13.setEditable(false);
jTextField14.setEditable(false);
jTextField15.setEditable(false);
jTextField16.setEditable(false);
jTextField18.setEditable(false);
jTextField19.setEditable(false);
jTextField20.setEditable(false);
jTextField21.setEditable(false);    
jTextField22.setEditable(false);
jTextField23.setEditable(false); 
jTextField24.setEditable(false);
jTextField11.setFocusable(false);
jTextField12.setFocusable(false);
jTextField13.setFocusable(false);
jTextField14.setFocusable(false);
jTextField15.setFocusable(false);
jTextField16.setFocusable(false);
jTextField18.setFocusable(false);
jTextField19.setFocusable(false);
jTextField20.setFocusable(false);
jTextField21.setFocusable(false);
jTextField22.setFocusable(false);
jTextField23.setFocusable(false);
jTextField24.setFocusable(false);

// Bỏ viền tập trung và làm phẳng nút
Information_Buttom.putClientProperty("JButton.buttonType", "tab");
Information_Buttom.putClientProperty("JButton.arc", 10); // Bo góc 10px

// Nếu muốn căn trái toàn bộ text và icon (thường đẹp hơn cho sidebar)
Information_Buttom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
Information_Buttom.setIconTextGap(20);
Information_Buttom.setMargin(new java.awt.Insets(0, 20, 0, 0));
jTable1.setShowVerticalLines(false);
    jTable1.setShowHorizontalLines(true);
    // Thêm vào trong hàm styleTable
jTable1.putClientProperty("Table.alternateRowColor", new java.awt.Color(245, 245, 245));
jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
jScrollPane1.setViewportBorder(null);
// Thêm vào Constructor của customer_UI
jTextArea1.putClientProperty("JTextField.placeholderText", "Hãy chia sẻ ý kiến hoặc vấn đề của bạn tại đây...");
jTextArea1.putClientProperty("Component.arc", 20); // Bo góc khung nhập liệu
jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Tạo khoảng trống lề trong
jTextArea1.setBackground(new java.awt.Color(250, 250, 250)); // Màu trắng sứ
// Cấu hình cho Send_Buttom
jButton3.putClientProperty("JButton.buttonType", "roundRect"); // Nút bo tròn hoàn toàn
jButton3.putClientProperty("FlatLaf.style", "background: #1A305E; foreground: #FFFFFF"); // Màu xanh đậm đồng bộ sidebar
jButton3.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Đổi con trỏ khi di qua
// Giả sử Panel của bạn tên là Feedback_Container_Panel
jPanel10.setOpaque(true);
jPanel10.setBackground(Color.WHITE);

jPanel12.setOpaque(true);
jPanel12.setBackground(Color.WHITE);
jPanel10.putClientProperty("FlatLaf.style", "arc: 30");
jPanel11.putClientProperty("FlatLaf.style", "arc: 30");
jPanel12.putClientProperty("FlatLaf.style", "arc: 30");
jPanel10.putClientProperty("FlatLaf.style", "arc: 30");
jPanel12.putClientProperty("FlatLaf.style", "arc: 30");

    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Bill_Buttom = new javax.swing.JButton();
        Information_Buttom = new javax.swing.JButton();
        Water_usage_Buttom = new javax.swing.JButton();
        Feedback_Buttom = new javax.swing.JButton();
        Payment_Buttom = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        Main_Panel = new javax.swing.JPanel();
        Detail_information_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        Feedback_Panel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        Payment_Panel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        Bill_Panel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Wate_usagge_information_Panel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1104, 574));
        jPanel2.setPreferredSize(new java.awt.Dimension(1104, 574));

        jLayeredPane1.setBackground(new java.awt.Color(26, 48, 94));
        jLayeredPane1.setOpaque(true);

        Bill_Buttom.setBackground(new java.awt.Color(26, 48, 94));
        Bill_Buttom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Bill_Buttom.setForeground(new java.awt.Color(255, 255, 255));
        Bill_Buttom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-bill-50.png"))); // NOI18N
        Bill_Buttom.setText("Bill");
        Bill_Buttom.setBorder(null);
        Bill_Buttom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bill_Buttom.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Bill_Buttom.addActionListener(this::Bill_ButtomActionPerformed);

        Information_Buttom.setBackground(new java.awt.Color(26, 48, 94));
        Information_Buttom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Information_Buttom.setForeground(new java.awt.Color(255, 255, 255));
        Information_Buttom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-information-50.png"))); // NOI18N
        Information_Buttom.setText("Information");
        Information_Buttom.setBorder(null);
        Information_Buttom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Information_Buttom.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Information_Buttom.addActionListener(this::Information_ButtomActionPerformed);

        Water_usage_Buttom.setBackground(new java.awt.Color(26, 48, 94));
        Water_usage_Buttom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Water_usage_Buttom.setForeground(new java.awt.Color(255, 255, 255));
        Water_usage_Buttom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-water-39.png"))); // NOI18N
        Water_usage_Buttom.setText("Water usage");
        Water_usage_Buttom.setBorder(null);
        Water_usage_Buttom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Water_usage_Buttom.addActionListener(this::Water_usage_ButtomActionPerformed);

        Feedback_Buttom.setBackground(new java.awt.Color(26, 48, 94));
        Feedback_Buttom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Feedback_Buttom.setForeground(new java.awt.Color(255, 255, 255));
        Feedback_Buttom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-feedback-50.png"))); // NOI18N
        Feedback_Buttom.setText("Feedback");
        Feedback_Buttom.setBorder(null);
        Feedback_Buttom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Feedback_Buttom.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Feedback_Buttom.addActionListener(this::Feedback_ButtomActionPerformed);

        Payment_Buttom.setBackground(new java.awt.Color(26, 48, 94));
        Payment_Buttom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Payment_Buttom.setForeground(new java.awt.Color(255, 255, 255));
        Payment_Buttom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-payment-50.png"))); // NOI18N
        Payment_Buttom.setText("Payment");
        Payment_Buttom.setBorder(null);
        Payment_Buttom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Payment_Buttom.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Payment_Buttom.addActionListener(this::Payment_ButtomActionPerformed);

        jLabel40.setBackground(new java.awt.Color(26, 48, 94));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/image-removebg-preview (2).png"))); // NOI18N
        jLabel40.setOpaque(true);

        jLayeredPane1.setLayer(Bill_Buttom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Information_Buttom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Water_usage_Buttom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Feedback_Buttom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Payment_Buttom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Information_Buttom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Water_usage_Buttom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Bill_Buttom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Payment_Buttom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Feedback_Buttom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(Information_Buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Water_usage_Buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bill_Buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Payment_Buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Feedback_Buttom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Main_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Main_Panel.setPreferredSize(new java.awt.Dimension(1050, 574));
        Main_Panel.setLayout(new java.awt.CardLayout());

        Detail_information_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-man-50.png"))); // NOI18N
        jLabel1.setText("Detail information");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setInheritsPopupMenu(false);
        Detail_information_Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 808, 52));

        jPanel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/Screenshot 2026-05-02 010912.png"))); // NOI18N
        jLabel22.setText("Fullname:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-location-32.png"))); // NOI18N
        jLabel23.setText("Address:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-email-open-32.png"))); // NOI18N
        jLabel24.setText("Email:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-price-tag-32.png"))); // NOI18N
        jLabel25.setText("Type:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-phone-32.png"))); // NOI18N
        jLabel26.setText("Phone:");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField11.addActionListener(this::jTextField11ActionPerformed);

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField12.addActionListener(this::jTextField12ActionPerformed);

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField13.addActionListener(this::jTextField13ActionPerformed);

        jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField14.addActionListener(this::jTextField14ActionPerformed);

        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField15.addActionListener(this::jTextField15ActionPerformed);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        Detail_information_Panel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 129, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/Thiết kế chưa có tên.png"))); // NOI18N
        Detail_information_Panel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

        Main_Panel.add(Detail_information_Panel, "card2");

        Feedback_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-feedback-50.png"))); // NOI18N
        jLabel39.setText("Feedback");
        jLabel39.setToolTipText("");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel39.setInheritsPopupMenu(false);
        Feedback_Panel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 64, 808, 52));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        Feedback_Panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 703, 280));

        jButton3.setText("Send");
        jButton3.addActionListener(this::jButton3ActionPerformed);
        Feedback_Panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, 39));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/Thiết kế chưa có tên.png"))); // NOI18N
        Feedback_Panel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 650));

        Main_Panel.add(Feedback_Panel, "card6");

        Payment_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-payment-50.png"))); // NOI18N
        jLabel38.setText("Payment ");
        jLabel38.setToolTipText("");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel38.setInheritsPopupMenu(false);
        Payment_Panel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 30, 808, 52));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Payment day", "Amount", "Method"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Payment_Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 119, 720, 370));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/Thiết kế chưa có tên.png"))); // NOI18N
        Payment_Panel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 830, 570));

        Main_Panel.add(Payment_Panel, "card5");

        Bill_Panel.setPreferredSize(new java.awt.Dimension(845, 610));
        Bill_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-cycle-39.png"))); // NOI18N
        jLabel31.setText("Billing_period:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-calender-39.png"))); // NOI18N
        jLabel33.setText("Due day:");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-money-39.png"))); // NOI18N
        jLabel34.setText("Total amount:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-price-tag-32.png"))); // NOI18N
        jLabel35.setText("Status:");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-calender-39 (1).png"))); // NOI18N
        jLabel36.setText("Issue day:");

        jTextField19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField19.addActionListener(this::jTextField19ActionPerformed);

        jTextField21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField21.addActionListener(this::jTextField21ActionPerformed);

        jTextField22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField22.addActionListener(this::jTextField22ActionPerformed);

        jTextField23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField23.addActionListener(this::jTextField23ActionPerformed);

        jTextField24.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField24.addActionListener(this::jTextField24ActionPerformed);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jTextField23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(42, 42, 42)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel35))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );

        Bill_Panel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 370));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-bill-50.png"))); // NOI18N
        jLabel2.setText("Bill");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Bill_Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 150, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/Thiết kế chưa có tên.png"))); // NOI18N
        Bill_Panel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

        Main_Panel.add(Bill_Panel, "card4");

        Wate_usagge_information_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-water-tap-50.png"))); // NOI18N
        jLabel27.setText("Water usage information");
        jLabel27.setToolTipText("");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel27.setInheritsPopupMenu(false);
        Wate_usagge_information_Panel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 59, 808, 52));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-calender-39.png"))); // NOI18N
        jLabel28.setText("Date(mm/y):");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-new-year-calendar-39.png"))); // NOI18N
        jLabel29.setText("Current");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-water-hose-39.png"))); // NOI18N
        jLabel30.setText("Total usage:");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/icons8-previous-39.png"))); // NOI18N
        jLabel32.setText("Previous:");

        jTextField16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField16.addActionListener(this::jTextField16ActionPerformed);

        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField18.addActionListener(this::jTextField18ActionPerformed);

        jTextField20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField20.addActionListener(this::jTextField20ActionPerformed);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel28))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        Wate_usagge_information_Panel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 720, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaga/Thiết kế chưa có tên.png"))); // NOI18N
        Wate_usagge_information_Panel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

        Main_Panel.add(Wate_usagge_information_Panel, "card3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Main_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bill_ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bill_ButtomActionPerformed
CardLayout card = (CardLayout) Main_Panel.getLayout();
        card.show(Main_Panel,"BILL");// TODO add your handling code here:
    }//GEN-LAST:event_Bill_ButtomActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void Water_usage_ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Water_usage_ButtomActionPerformed
CardLayout card = (CardLayout) Main_Panel.getLayout();
        card.show(Main_Panel, "WATER");       
        // TODO add your handling code here:
    }//GEN-LAST:event_Water_usage_ButtomActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Information_ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Information_ButtomActionPerformed
CardLayout card = (CardLayout) Main_Panel.getLayout();
        card.show(Main_Panel, "INFO");        // TODO add your handling code here:
    }//GEN-LAST:event_Information_ButtomActionPerformed

    private void Feedback_ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Feedback_ButtomActionPerformed
CardLayout card = (CardLayout) Main_Panel.getLayout();
        card.show(Main_Panel, "FEEDBACK");  // TODO add your handling code here:
    }//GEN-LAST:event_Feedback_ButtomActionPerformed

    private void Payment_ButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_ButtomActionPerformed
CardLayout card = (CardLayout) Main_Panel.getLayout();
        card.show(Main_Panel, "PAYMENT");        // TODO add your handling code here:
    }//GEN-LAST:event_Payment_ButtomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new customer_UI("test").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bill_Buttom;
    private javax.swing.JPanel Bill_Panel;
    private javax.swing.JPanel Detail_information_Panel;
    private javax.swing.JButton Feedback_Buttom;
    private javax.swing.JPanel Feedback_Panel;
    private javax.swing.JButton Information_Buttom;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JButton Payment_Buttom;
    private javax.swing.JPanel Payment_Panel;
    private javax.swing.JPanel Wate_usagge_information_Panel;
    private javax.swing.JButton Water_usage_Buttom;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    // End of variables declaration//GEN-END:variables
}
