package com.starsmobi.serviceImp;

import com.starsmobi.mapper.UserMapper;
import com.starsmobi.model.UserModel;
import com.starsmobi.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by vincent on 2017-05-31.
 */
@Service("userService")
public class UserServiceImp implements IUserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

    @Autowired
    private UserMapper userMapper;

    public UserServiceImp() {
        super();
    }

    @Override
    public void createUser(UserModel userModel) {

        userMapper.createUser(userModel);

    }

    public long getDistanceDays(String timeOne, String timeTwo) throws Exception{

        Date one = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(timeOne);
        Date two = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(timeTwo);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        long days=0;
        try {
            one = df.parse(timeOne);
            two = df.parse(timeTwo);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            diff = time1 - time2;
            days = diff / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }
}
