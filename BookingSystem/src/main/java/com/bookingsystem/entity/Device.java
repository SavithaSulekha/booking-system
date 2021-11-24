package com.bookingsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long deviceId;
    private String name;
    private String status;
    public Device() {

    }
    public Device( Long deviceId, String name, String status) {
        this.setDeviceId(deviceId);
        this.setName(name);
        this.setStatus(status);
    }
    public Long getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Device [deviceId=" + deviceId +  ", name=" + name + ", status= "+ status +"]";
    }
}
