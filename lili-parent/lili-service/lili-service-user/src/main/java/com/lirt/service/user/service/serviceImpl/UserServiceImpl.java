package com.lirt.service.user.service.serviceImpl;

import com.lirt.service.user.api.entity.User;
import com.lirt.service.user.mapper.UserMapper;
import com.lirt.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectList(null);
    }
}
