package service;

import java.util.List;
import model.WaterMeter;
import DAO.WaterMeterDao;

public class WaterMeterService {
    private WaterMeterDao waterMeterDao;

    public WaterMeterService() {
        this.waterMeterDao = new WaterMeterDao();
    }

    public List<WaterMeter> getAllMeter() {
        return waterMeterDao.getAllMeter();
    }

    public void addMeter(WaterMeter m) {
        waterMeterDao.addMeter(m);
    }

    public void updateMeter(WaterMeter m) {
        waterMeterDao.updateMeter(m);
    }

    public void deleteMeter(int id) {
        waterMeterDao.deleteMeter(id);
    }
}