package service;

import java.util.List;
import model.Request;
import DAO.RequestDao;

public class RequestService {
    
    public int getPendingRequestCount() {
        return requestDao.countPendingRequests();}
    
    private RequestDao requestDao;

    public RequestService() {
        this.requestDao = new RequestDao();
    }
    
    public List<Request> searchRequests(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return getAllRequests();
        }
        // Gọi hàm search từ DAO (Bạn cần tạo hàm này trong RequestDao)
        return requestDao.searchRequests(keyword.trim());
    }
    
    public List<Request> getAllRequests() {
        // Kiểm tra file RequestDao xem bạn đặt là getAllRequest() hay getAllRequests() nhé
        return requestDao.getAllRequest();
    }
    // ================= XÓA =================
    public void deleteRequest(int requestId) {
        requestDao.deleteRequest(requestId);
    }

    // ================= SỬA =================
    // Dựa vào file UpdateRequestFrame nãy mình làm, bạn chỉ cho phép sửa Trạng thái (status) và Mô tả (desc)
    public void updateRequest(int requestId, String status, String desc) {
        // Khởi tạo một đối tượng Request để đóng gói dữ liệu
        Request r = new Request();
        r.setRequestId(requestId);
        r.setStatus(status);
        r.setDescription(desc);
        
        // Gọi hàm update từ RequestDao và truyền object r vào
        requestDao.updateRequest(r);
    }
    public void addRequest(int customerId, Integer employeeId, String type, String desc, String status, String dateCreated) {
        Request r = new Request();
        r.setCustomerId(customerId);
        r.setEmployeeId(employeeId);
        r.setRequestType(type);
        r.setDescription(desc);
        r.setStatus(status);
        r.setDateCreated(java.sql.Date.valueOf(dateCreated));
        // Khi mới thêm yêu cầu, ngày xử lý (dateResolved) mặc định là null nên không cần set
        try {
            // Đảm bảo định dạng String là YYYY-MM-DD
            r.setDateCreated(java.sql.Date.valueOf(dateCreated));
        } catch (IllegalArgumentException e) {
            System.err.println("Lỗi định dạng ngày tháng: " + e.getMessage());
            // Có thể gán ngày hiện tại làm mặc định nếu lỗi
            r.setDateCreated(new java.sql.Date(System.currentTimeMillis()));
        }

        requestDao.addRequest(r);
    }
}