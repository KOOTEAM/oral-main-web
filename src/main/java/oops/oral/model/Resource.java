/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.model;

import oops.oral.model.enums.ResourceEnum;

import javax.persistence.*;

/**
 * Description:
 * <p>
 * Create Author  : lilZhang
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : Resource.java
 */
@Entity
public class Resource extends BaseEntity
{
    private ResourceEnum resourceType;
    private Doctor doctor;
    private String url;

    @Enumerated(EnumType.ORDINAL)
    public ResourceEnum getResourceType()
    {
        return resourceType;
    }

    public void setResourceType(ResourceEnum resourceType)
    {
        this.resourceType = resourceType;
    }

    @ManyToOne(targetEntity = Doctor.class)
    @JoinColumn(name="doctor_id")
    public Doctor getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    @Column(nullable = true, length = 511)
    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
