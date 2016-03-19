/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.domain;

import java.util.Date;

/**
 * Description:
 * <p>
 * Create Author  : lilzhang
 * Create Date    : 2016-03-16
 * Project        : oralRepo
 * File Name      : BaseEntity.java
 */
public class BaseEntity
{
    private long id;
    private Date addTime;
    private Date updateTime;
    private boolean isValid;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Date getAddTime()
    {
        return addTime;
    }

    public void setAddTime(Date addTime)
    {
        this.addTime = addTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public boolean isValid()
    {
        return isValid;
    }

    public void setValid(boolean valid)
    {
        isValid = valid;
    }
}
