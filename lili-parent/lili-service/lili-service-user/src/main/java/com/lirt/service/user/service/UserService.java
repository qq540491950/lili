package com.lirt.service.user.service;

import com.lirt.service.user.api.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();
}
