package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public Properties prop;
	
	public TestBase()
	{
		
		try {
			
			prop= new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"src/test/resources/testproperties/global.properties");
					prop.load(ip);
			
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public String getbaseURL()
	{
		String url=prop.getProperty("baseurl");
		if(url != null) 
		return url;
		else throw new RuntimeException("URL not found");
		
	}

}
