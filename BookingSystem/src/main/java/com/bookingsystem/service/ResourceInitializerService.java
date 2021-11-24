package com.bookingsystem.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.dao.BookingDAO;
import com.bookingsystem.dao.DeviceDAO;
import com.bookingsystem.entity.Booking;

@Service("ResourceService")
public class ResourceInitializerService {
	
	@Autowired
	private BookingDAO bookingdao;
	
	@Autowired
	private DeviceDAO devicedao;
	
	
	public BookingDAO getBookingdao() {
		return bookingdao;
	}

	public void setBookingdao(BookingDAO bookingdao) {
		this.bookingdao = bookingdao;
	}

	public DeviceDAO getDevicedao() {
		return devicedao;
	}

	public void setDevicedao(DeviceDAO devicedao) {
		this.devicedao = devicedao;
	}
	
	public List<Booking> getBookingList(Map<String,Object> filters){
		
		return bookingdao.list(filters);
	}
	
}
