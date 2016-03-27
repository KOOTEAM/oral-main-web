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
 * File Name      : GroupEnum.java
 */
public enum GroupEnum
{
    HOSPTIAL_TEST_1(1, "医院1"),
    HOSPTIAL_TEST_2(2, "医院2"),
    HOSPTIAL_TEST_3(3, "医院3"),
    HOSPTIAL_TEST_4(4, "医院4");

    private final int value;
    private final String name;

    GroupEnum(int value, String name)
    {
        this.value = value;
        this.name = name;
    }

    public int getValue()
    {
        return value;
    }

    public String getName()
    {
        return name;
    }
}
