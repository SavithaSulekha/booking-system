package com.bookingsystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.dao.DeviceDAO;

@Service
public class DeviceService {
    
    @Autowired
    private DeviceDAO dao;
    
    public void save(Long deviceId,String status) {
        dao.updateDeviceStatus(deviceId,status);    

}
}
