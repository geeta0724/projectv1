package com.projectV1.testcases;


import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project1V1.pageobject.Loginpage;
import com.project1V1utilities.XLutils;

public class TC_LoginDDT002 extends BaseClass
{
	@Test(dataProvider="loginData")
	public void LoginDDT(String user, String pwd) throws InterruptedException
	{
		Loginpage lp = new Loginpage (driver);
		lp.setUserName(user);
		logger.info("username provided");
		lp.setpassword(pwd);
		logger.info("password provided");
		lp.clicksubmit();
		Thread.sleep(3000);
		
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
		logger.warn("login failed");
		}
	else
	{
	Assert.assertTrue(true);
	lp.clickLogout();
	driver.switchTo().alert().accept(); // close logout alert
	driver.switchTo().defaultContent();
	logger.info("login passed"); 
	}
	}
		
	
	public boolean isAlertPresent() //   Aletrs are present or no
	{
		try
		{
			driver.switchTo().alert();
			return true;
			}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
		
	}
		
		
		
	
@DataProvider (name = "Logindate")
	String[][] getDate()
	{
	String path= "";
	int rownum = XLutils.getRowcount(path, sheet1);
	int colcount= XLutils.getCellcount(path, sheet1,1);
	
	String logindate[][]=new String[rownum][colcount]
			for (i=1;i<=rownum;i++)
			{
				for(j=0;j<colcount;j++)
				{
					logindata[i-1][j]=XLutils.getcoldata(path, "sheet", i, j);
					
				}
			}
				
			return logindata;
			
	}


}
