package com.manyin.vhr.controller;

import com.manyin.vhr.common.result.ResultBean;
import com.manyin.vhr.common.result.SuccessMsg;

import com.manyin.vhr.entity.UserInfoEntity;
import com.manyin.vhr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
@RequestMapping(value = "user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public ResultBean list(){
        //获取list
        List<UserInfoEntity> userList = userService.getAll();
        return ResultBean.success(SuccessMsg.SUCCESS_WITH_RESULT(userList));

    }

}
