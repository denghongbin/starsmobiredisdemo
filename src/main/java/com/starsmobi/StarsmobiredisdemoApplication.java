package com.starsmobi;

import com.starsmobi.service.IUserService;
import com.starsmobi.serviceImp.UserServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@SpringBootApplication
public class StarsmobiredisdemoApplication {

	@Autowired
	private IUserService userService;

	private final static Logger logger = LoggerFactory.getLogger(StarsmobiredisdemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(StarsmobiredisdemoApplication.class, args);

		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		logger.info("=-=-=-=-=-=-=-=-=-=-=-=-=-=-= +++++++" +date);

		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 3);
		Date date2 = calendar.getTime();
		logger.info("=-=-=-=-=-=-=-=-=-=-=-=-=-=-= +++++++" +date2);

		long days=0;

		long time1 = date.getTime();
		long time2 = date2.getTime();
		long diff ;
		diff = time1 - time2;
		days = diff / (1000 * 60 * 60);
		logger.info("=-=-=-=-=-=-=-=-=-=-=-=-=-=-= +++++++" +days);
	}

}
