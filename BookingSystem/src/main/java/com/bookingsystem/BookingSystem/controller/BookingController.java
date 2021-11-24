package com.bookingsystem.BookingSystem.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.ws.rs.FormParam;

import com.bookingsystem.entity.Booking;
import com.bookingsystem.service.BookingService;
import com.bookingsystem.service.DeviceService;
import com.bookingsystem.service.LoginService;
import com.bookingsystem.entity.User;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private LoginService loginService;
    @Autowired
    private DeviceService deviceService;

    @GetMapping("/login")
    public String login(@FormParam("userId") Long userId, @FormParam("password") String password) {
        User user = loginService.validate(userId, password);
        if (user != null) {
            return "mainpage";
        }
        return "index";
    }

    @GetMapping("/list")
    public String listBookings(@QueryParam("filter") String filterStr) {
        Map<String,Object> filterMap = null; // convert filterStr to Map
        List<Booking> bookingList = bookingService.listAll(filterMap);
        return "mainpage";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBooking(HttpServletRequest request) {
        Booking b = bookingService.save(Long.parseLong(request.getParameter("deviceId")), Long.parseLong(request.getParameter("userId")), Date.valueOf(request.getParameter("fromDate")), Date.valueOf(request.getParameter("toDate")));
        deviceService.save(b.deviceId, "booked");
        return "mainpage";
    }
}
