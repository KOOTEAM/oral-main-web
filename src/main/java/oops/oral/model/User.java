/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Description:
 * <p>
 * Create Author  : LilZhang
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : User.java
 */
@Entity
public class User extends BaseEntity
{
    private String loginName;
    private String name;
    private String password;
    private String cellNumber;
    private String email;
    private String iconUrl;
    private Doctor doctor;

    @Column(nullable = false, length = 15)
    public String getLoginName()
    {
        return loginName;
    }

    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }

    @Column(nullable = false, length = 15)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Column(nullable = false, length = 31)
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Column(nullable = true, length = 15)
    public String getCellNumber()
    {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber)
    {
        this.cellNumber = cellNumber;
    }

    @Column(nullable = true, length = 255)
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Column(nullable = true, length = 511)
    public String getIconUrl()
    {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl)
    {
        this.iconUrl = iconUrl;
    }

    @OneToOne(targetEntity = Doctor.class)
    @JoinColumn(name="doctor_id")
    public Doctor getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }
}
