package service;

import DAO.AccountDao;

public class AccountService {
    
    private AccountDao accountDao;

    public AccountService() {
        // Khởi tạo đối tượng DAO để tương tác với Database
        this.accountDao = new AccountDao();
    }

    // Cầu nối kiểm tra đăng nhập
    public String checkLogin(String username, String password) {
        return accountDao.checkLogin(username, password);
    }
    
    // Cầu nối đăng ký tài khoản
    public void registerAccount(String username, String password) {
        accountDao.registerAccount(username, password);
    }
}