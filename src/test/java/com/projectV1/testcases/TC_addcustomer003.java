package com.projectV1.testcases;

import org.testng.annotations.Test;

import com.project1V1.pageobject.Loginpage;

public class TC_addcustomer003 extends BaseClass
{
	
	@Test
	public void addnewCustomer() throws InterruptedException
	{
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		Thread.sleep(3000);
		
		Addcustomer ad
		
	}

}
