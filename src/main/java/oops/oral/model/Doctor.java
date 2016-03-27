/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.model;

import javax.persistence.*;
import java.util.List;

/**
 * Description:
 * <p>
 * Create Author  : lilZhang
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : Doctor.java
 */
@Entity
public class Doctor extends BaseEntity
{
    private User user;
    private Group group;
    private List<Resource> resources;
    private List<Patient> patients;

    @OneToOne(mappedBy="doctor", targetEntity = User.class)
    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @ManyToOne(optional = false, fetch = FetchType.LAZY,
            targetEntity = Group.class)
    @JoinColumn(name="group_id")
    public Group getGroup()
    {
        return group;
    }

    public void setGroup(Group group)
    {
        this.group = group;
    }

    @OneToMany(mappedBy="doctor", targetEntity = Resource.class)
    public List<Resource> getResources()
    {
        return resources;
    }

    public void setResources(List<Resource> resources)
    {
        this.resources = resources;
    }

    @ManyToMany(fetch=FetchType.LAZY, mappedBy="doctors",
            targetEntity=Patient.class)
    public List<Patient> getPatients()
    {
        return patients;
    }

    public void setPatients(List<Patient> patients)
    {
        this.patients = patients;
    }
}
