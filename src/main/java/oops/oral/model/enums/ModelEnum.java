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
 * File Name      : ModelEnum.java
 */
public enum ModelEnum
{
    CATEGORY_A(1, "A类"),
    CATEGORY_B(2, "B类"),
    CATEGORY_C(3, "C类");

    private final int value;
    private final String category;

    ModelEnum(int value, String category)
    {
        this.value = value;
        this.category = category;
    }

    public int getValue()
    {
        return value;
    }

    public String getCategory()
    {
        return category;
    }
}
