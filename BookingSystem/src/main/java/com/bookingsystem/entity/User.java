package com.bookingsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String password;
    private String emailId;
    
    public User() {

    }
    public User(Long userId, String name, String password,String emailId) {
        this.setUserId(userId);
        this.setName(name);
        this.setPassword(password);
        this.setEmailId(emailId);
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmailId()
    {
        return emailId;
    }

    public void setEmailId(String emailId)
    {
        this.emailId = emailId;
    }
    @Override
    public String toString() {
        return "User [id=" + userId + ", password=" + password + ", name=" + name + "]";
    }
}

