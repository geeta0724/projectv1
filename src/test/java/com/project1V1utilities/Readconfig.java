package com.project1V1utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	
	public Readconfig()
	{
	File src = new File("C:\\Users\\DELL\\eclipse-workspace\\project1V1\\configurationfiles\\config.properties");
	
	try 
	{
		FileInputStream fis= new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}
	catch (Exception e)
	{
		System.out.println("Exception is " + e.getMessage());
		
	}
	}
	
	public String getApplicationURL()
	{
		String URL = pro.getProperty("baseURL");
		return URL;
	}
	
	public String getuserName()
	{
		String userName = pro.getProperty("userName");
		return userName;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getchromepath()
	{
		String chromepath = pro.getProperty("cheomepath");
		return chromepath;
	}
	
	public String getfirefoxpath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
		
	
}

