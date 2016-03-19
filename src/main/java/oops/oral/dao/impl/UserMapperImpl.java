/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.dao.impl;

import oops.oral.dao.UserMapper;
import oops.oral.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * <p>
 * Create Author  : Administrator
 * Create Date    : 2016-03-19
 * Project        : oralRepo
 * File Name      : UserMapperImpl.java
 */
@Service("userMapper")
public class UserMapperImpl implements UserMapper
{
    public User findById(int id) {
        return null;
    }

    public List<User> findByPassword(String password) {
        return null;
    }

    public List<User> findByNameAndPassword(Map<String, String> userInfo) {
        return null;
    }

    public void insertUser1(User user) {
//        return null;
    }

    public void insertUser2(User user) {
//        return null;
    }

    public void updateUserPassword(User user) {
//        return null;
    }

    public void delete(User user) {
//        return null;
    }

    public void deleteByGreaterThanId(int id) {
//        return null;
    }
}
