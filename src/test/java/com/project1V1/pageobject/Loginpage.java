package com.project1V1.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;
 
	public Loginpage (WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
 
 @FindBy(name="uid")
 WebElement txtUserName;
 
 @FindBy(name="password")
 WebElement txtPassword;
 
 @FindBy(name="btnlogin")
 WebElement btnLogin;
 
 @FindBy(xpath="")
 WebElement lnkLogout;
 
 public void setUserName(String uname)
 {
	 txtUserName.sendKeys(uname);

 }
 
 public void setpassword(String pwd)
 {
	 txtPassword.sendKeys(pwd);

 }
 
 public void clicksubmit()
 {
	btnLogin.click();
	
 }
	
	public void clickLogout()
	{
	lnkLogout.click();
	}

 }
 
	
	


