package com.bookingsystem.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.bookingsystem.entity.Booking;
import com.ticketing.entity.Queries;


@Repository
public class BookingDAO{
    public List<Booking> list(Map<String,Object> filters) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager manager = factory.createEntityManager();
        // append filter conditions to the query
        Query query = manager.createQuery("SELECT d.Name AS 'DeviceName',u.Name AS 'UserName',d.Status,b.FromDate,b.ToDate FROM Booking b JOIN Device d ON d.DeviceId = b.DeviceId JOIN User u ON u.UserId = b.UserId");
        List<Booking> list = query.getResultList();        
        manager.close();
        factory.close();
        
        return list;
    }
    
public Booking insert(Booking b) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction txn = manager.getTransaction();
        txn.begin();
        System.out.println(b);
        manager.persist(b);
        txn.commit();
        manager.close();
        factory.close();
        
        return b;
    }
}
