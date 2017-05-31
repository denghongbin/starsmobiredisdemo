package com.starsmobi.serviceImp;

import com.starsmobi.mapper.UserMapper;
import com.starsmobi.model.UserModel;
import com.starsmobi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vincent on 2017-05-31.
 */
@Service("userService")
public class UserServiceImp implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(UserModel userModel) {

        userMapper.createUser(userModel);

    }
}
