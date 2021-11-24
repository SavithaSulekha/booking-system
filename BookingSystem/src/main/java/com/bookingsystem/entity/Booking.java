package com.bookingsystem.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;
    public Long deviceId;
    public Long userId;
    public Date fromDate;
    public Date toDate;
    public Booking() {

    }
    public Booking(Long id, Long deviceId, Long userId, Date fromDate,Date toDate) {
        this.setId(id);
        this.setDeviceId(deviceId);
        this.setUserId(userId);
        this.setFromDate(fromDate);
        this.setToDate(toDate);
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Date getFromDate() {
        return fromDate;
    }
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    public Date getToDate() {
        return toDate;
    }
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    

}
