package service;

import java.util.List;
import model.WaterUsage;
import DAO.UsageDao;

public class UsageService {
    private UsageDao waterUsageDao;

    public UsageService() {
        this.waterUsageDao = new UsageDao();
    }

    public List<WaterUsage> getAllUsage() {
        return waterUsageDao.getAllUsage();
    }

    public void addUsage(WaterUsage u) {
        waterUsageDao.addUsage(u);
    }

    public void updateUsage(WaterUsage u) {
        waterUsageDao.updateUsage(u);
    }

    public void deleteUsage(int id) {
        waterUsageDao.deleteUsage(id);
    }
}