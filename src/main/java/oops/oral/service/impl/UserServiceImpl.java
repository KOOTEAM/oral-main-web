/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.service.impl;

import oops.oral.dao.UserMapper;
import oops.oral.domain.User;
import oops.oral.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description:
 * <p>
 * Create Author  : Administrator
 * Create Date    : 2016-03-15
 * Project        : oralRepo
 * File Name      : UserServiceImpl.java
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Resource
    private UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }
}
