package com.pack.TestLAM.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	static List<String> users=new ArrayList();
	static
	{
		users.add("admin");
		users.add("gopal");
	}
	private static final Logger logger = LoggerFactory.getLogger(MyService.class);

	public String getLogin(String userName)
	{
		logger.info("Generating greeting for {}", userName);
		int flag=0;
		for(String s: users)
		{
			if(s.equalsIgnoreCase(userName))
			{
				flag=1;
				break;
			}else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			logger.info("welcome {}", userName);
		return "valid" +" "+userName;	
		
		}
		logger.info("not valid");
		return "Invalid";
	}
	
	
}
