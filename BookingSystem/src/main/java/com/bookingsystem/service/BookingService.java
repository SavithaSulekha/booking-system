package com.bookingsystem.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.dao.BookingDAO;
import com.bookingsystem.entity.Booking;
@Service
public class BookingService {

    
    @Autowired
    private BookingDAO dao;
    
    public List<Booking> listAll(Map<String,Object> filters) {
        return dao.list(filters);
    }
     
    public void save(Long deviceId,Long userId, Date fromDate, Date toDate) {
        Booking newBooking = new Booking();
        newBooking.setDeviceId(deviceId);
        newBooking.setUserId(userId);
        newBooking.setFromDate(fromDate);
        newBooking.setToDate(toDate);
        dao.insert(newBooking);
        
    }
          
    public void cancel(long id) {
        dao.deleteById(id);
    }

}