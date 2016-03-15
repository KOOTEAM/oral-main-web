/*
 *
 * Copyright (c) 2010-2015 by Shanghai HanTao Information Co., Ltd.
 * All rights reserved.
 *
 */

package oops.oral.dao;

import oops.oral.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * <p>
 * Create Author  : Administrator
 * Create Date    : 2016-03-15
 * Project        : oralRepo
 * File Name      : UserMapper.java
 */
public interface UserMapper
{
    User findById(int id);

    List<User> findByPassword(String password);

    List<User> findByNameAndPassword(Map<String, String> userInfo);

    void insertUser1(User user);

    void insertUser2(User user);

    void updateUserPassword(User user);

    void delete(User user);

    void deleteByGreaterThanId(int id);
}
