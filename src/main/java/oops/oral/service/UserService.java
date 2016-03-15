/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.service;

import oops.oral.domain.User;

/**
 * Description:
 * <p>
 * Create Author  : Administrator
 * Create Date    : 2016-03-15
 * Project        : oralRepo
 * File Name      : UserService.java
 */
public interface UserService
{
    public User findById(int id);
}
