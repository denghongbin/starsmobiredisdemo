package com.starsmobi.mapper;

import com.starsmobi.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {
    public void createUser(UserModel userModel);

}
