package service;

import java.util.List;
import model.Customer;
import DAO.CustomerDao;

public class CustomerService {
    private CustomerDao customerDao;

    public CustomerService() {
        this.customerDao = new CustomerDao();
    }

    public List<Customer> getAllUsers() {
        return customerDao.getAllCustomer();
    }

    public void addCustomer(Customer c) {
        customerDao.addCustomer(c);
    }

    public void updateCustomer(Customer c) {
        customerDao.updateCustomer(c);
    }

    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }
        
    public int getCustomerCount() { 
        return customerDao.countCustomer(); }
}