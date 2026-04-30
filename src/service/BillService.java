package service;

import java.util.List;
import model.Bill;
import DAO.BillDao;

public class BillService {
    private BillDao billDao;

    public BillService() {
        this.billDao = new BillDao();
    }

    public List<Bill> getAllBills() {
        return billDao.getAllBill();
    }

    public void addBill(Bill b) {
        billDao.addBill(b);
    }

    public void updateBill(Bill b) {
        billDao.updateBill(b);
    }

    public void deleteBill(int id) {
        billDao.deleteBill(id);
    }
    
    public int getUnpaidCount() { 
        return billDao.countUnpaidBills(); }
}