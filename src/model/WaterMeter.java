/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ThinkPad
 */
public class WaterMeter {

    public int getMeterId() {
        return meterId;
    }

    public void setMeterId(int meterId) {
        this.meterId = meterId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private int meterId;
    private int customerId;
    private java.sql.Date installationDate;
    private String meterType;
    private String status;
    
}
