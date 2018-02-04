package com.automation.framework.TestApp;

import utility.ExcelUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	WebDriver driver;
	
 @BeforeTest
 public void launchBrowser(){
	 		
		File pathBinary = new File("C:\\Users\\ABHISHEK\\Downloads\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffbinary = new FirefoxBinary(pathBinary);
		FirefoxProfile ffprofile = new FirefoxProfile();		
		driver = new FirefoxDriver(ffbinary,ffprofile);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
 }
 
/* @BeforeMethod
 public void openURL(){
	   
 }*/
	
  @Test(dataProvider="Authentication")
  public void loginFlipkart(String UserName,String Password) throws Exception{
	  		
			driver.findElement(By.className("_2zrpKA")).sendKeys(UserName);
			driver.findElement(By.cssSelector("input._2zrpKA._3v41xv[type='password']")).sendKeys(Password);
			
			driver.findElement(By.cssSelector("button._2AkmmA._1LctnI._7UHT_c[type='submit']")).click();
			driver.close();
	  
  }

  @DataProvider 
  public Object[][] Authentication() throws Exception{

       Object[][] testObjArray = ExcelUtils.getTableArray(".//src//main//java//testData//TestData.xls","Sheet1");
       System.out.println("testObjArray "+testObjArray[0][0]);
       System.out.println("testObjArray "+testObjArray[0][1]);
       //System.out.println("testObjArray "+testObjArray[0][2]);
       return testObjArray;

		}
}
