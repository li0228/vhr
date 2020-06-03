package com.manyin.vhr.service;

import com.manyin.vhr.entity.UserInfoEntity;
import com.manyin.vhr.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserMapper userMapper;

    public List<UserInfoEntity> getAll(){
        return userMapper.getAll();
    }
}
