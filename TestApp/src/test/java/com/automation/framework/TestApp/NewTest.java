package com.automation.framework.TestApp;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

public class NewTest {
 
	WebDriver driver;
	HomePage objLogin;
	
	@Test
  public void authentication() {
	  System.out.println("in Test Method"); 
	  
	
	  objLogin = PageFactory.initElements(driver, HomePage.class);
	  objLogin.loginUser("sskeepsmiling3", "ss123");
	  System.out.println(" Login Successfully.");
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("in Before test");
	   
	    File pathBinary = new File("C:\\Users\\ABHISHEK\\Downloads\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffbinary = new FirefoxBinary(pathBinary);
		FirefoxProfile ffprofile = new FirefoxProfile();
		driver = new FirefoxDriver(ffbinary,ffprofile);
		
	  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  	driver.get("https://www.myntra.com/");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in After test");
	  driver.quit();
  }
  
  
}
