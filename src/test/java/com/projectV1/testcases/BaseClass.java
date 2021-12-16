package com.projectV1.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.project1V1utilities.Readconfig;



public class BaseClass {
	Readconfig readconfig =new Readconfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username= readconfig.getuserName();
	public String password= readconfig.getPassword();
	public WebDriver driver;
	public static  Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver();
	}
	else if(br.equals("firefox"))
			{
		System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
		driver = new FirefoxDriver();
	}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(baseURL);
	}

	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();	
	}

}