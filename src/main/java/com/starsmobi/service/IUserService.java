package com.starsmobi.service;

import com.starsmobi.model.UserModel;

/**
 * Created by vincent on 2017-05-31.
 */
public interface IUserService {

    public void createUser(UserModel userModel);

    public long getDistanceDays(String timeOne, String timeTwo) throws Exception;
}
