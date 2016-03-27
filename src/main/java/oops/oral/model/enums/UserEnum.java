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
 * Create Author  : lilZhang
 * Create Date    : 2016-03-20
 * Project        : oralRepo
 * File Name      : UserType.java
 */
public enum UserEnum
{
    DOCTOR(1);

    private final int value;

    UserEnum(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}
