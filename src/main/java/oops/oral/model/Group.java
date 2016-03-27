/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.model;

import oops.oral.model.enums.GroupEnum;

import javax.persistence.*;
import java.util.List;

/**
 * Description:
 * <p>
 * Create Author  : lilZhang
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : Group.java
 */
@Entity
public class Group extends BaseEntity
{
    private GroupEnum groupType;
    private List<Doctor> doctors;
    private String address;

    @Enumerated(EnumType.ORDINAL)
    public GroupEnum getGroupType()
    {
        return groupType;
    }

    public void setGroupType(GroupEnum groupType)
    {
        this.groupType = groupType;
    }

    @OneToMany(mappedBy = "group", targetEntity = Doctor.class)
    public List<Doctor> getDoctors()
    {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors)
    {
        this.doctors = doctors;
    }

    @Column(nullable = true, length = 255)
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
