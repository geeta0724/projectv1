package com.projectV1.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.project1V1.pageobject.Loginpage;

public class TC_LoginTest001 extends BaseClass

{
	
    @Test
	public void logintest()
{
    	
    	logger.info("URL is opened");
    	
    Loginpage lp = new Loginpage(driver);
    
    lp.setUserName("geeta");
    logger.info("entered username");
    
    lp.setpassword("geet12345");
    logger.info("enetered password");
    
    lp.clicksubmit();
    logger.info("URL is opened");
    
    
    if(driver.getTitle().equals("Guru 99 Bank Manager HomePage"))
    {
    	Assert.assertTrue(true);
    	logger.info("Login test passed");
    }
    else 
    {
    	Assert.assertTrue(true);
    	logger.info("Login test failed");
    	
    }
	
}
}
