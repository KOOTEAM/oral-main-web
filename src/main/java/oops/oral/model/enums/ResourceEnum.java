/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.model.enums;

/**
 * Description:
 * <p>
 * Create Author  : Administrator
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : ResourceEnum.java
 */
public enum ResourceEnum
{
    TXT(1),
    XLS(2);

    private final int value;

    ResourceEnum(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
