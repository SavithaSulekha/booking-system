package com.bookingsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bookingsystem.entity.Device;

public class DeviceDAO {
    public void updateDeviceStatus(Long deviceId, String status) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction txn = manager.getTransaction();
        txn.begin();
        Device d = manager.find(Device.class, deviceId);
        if (d != null) {
            d.setStatus(status);
        }
        manager.persist(d);
        txn.commit();
        manager.close();
        factory.close();
    }

}
