package com.starsmobi.controller;

import com.starsmobi.model.UserModel;
import com.starsmobi.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vincent on 2017-06-01.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
 private IUserService userService;

    @ApiOperation(value = "新建用户")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createUser(UserModel userModel){

        userService.createUser(userModel);
    }
}
