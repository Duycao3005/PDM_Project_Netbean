package service;

import java.util.List;
import model.Payment;
import DAO.PaymentDao;

public class PaymentService {
    
    public double getTotalRevenue() {
        return paymentDao.sumRevenue();}
    
    private PaymentDao paymentDao;

    public PaymentService() {
        // Khởi tạo đối tượng PaymentDao
        this.paymentDao = new PaymentDao();
    }

    public List<Payment> getAllPayments() {
        // Gọi hàm từ PaymentDao
        // Lưu ý: Kiểm tra xem trong file PaymentDao bạn đặt tên hàm là getAllPayment() hay gì nhé
        return paymentDao.getAllPayment(); 
    }
    // XÓA: Chỉ cần gọi hàm deletePayment từ PaymentDao
    public void deletePayment(int paymentId) {
        paymentDao.deletePayment(paymentId);
    }

    // SỬA: Đóng gói dữ liệu vào object Payment rồi truyền sang PaymentDao
    public void updatePayment(int paymentId, int billId, String date, double amount, String method) {
        // Tạo một đối tượng Payment mới để chứa dữ liệu sửa
        Payment p = new Payment();
        p.setPaymentId(paymentId);
        p.setBillId(billId);
        
        // Chuyển đổi chuỗi String (date) sang kiểu java.sql.Date để khớp với Database
        p.setPaymentDate(java.sql.Date.valueOf(date)); 
        
        p.setAmount(amount);
        p.setPaymentMethod(method);

        // Gọi hàm updatePayment bên file PaymentDao và truyền đối tượng p vào
        paymentDao.updatePayment(p);
    }
    public void addPayment(int billId, String date, double amount, String method) {
        // Đóng gói dữ liệu (không cần id vì database sẽ tự động tăng AUTO_INCREMENT)
        Payment p = new Payment();
        p.setBillId(billId);
        p.setPaymentDate(java.sql.Date.valueOf(date)); // Đổi chữ thành định dạng Ngày
        p.setAmount(amount);
        p.setPaymentMethod(method);

        // Gọi sang DAO để đưa vào database
        paymentDao.addPayment(p);
    }
}