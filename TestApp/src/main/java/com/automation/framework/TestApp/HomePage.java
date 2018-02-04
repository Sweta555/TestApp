package com.automation.framework.TestApp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait Wait;
	
	//public HomePage(WebDriver driver){
		
	//}
	
	
	
	@FindBy(how=How.CSS, using="a[class*='desktop-logo']")
	WebElement logo;
	
	@FindBy(how=How.CSS, using="div.desktop-userIconsContainer")
	WebElement icon;
	
	@FindBy(how=How.CSS, using="a.desktop-linkButton[data-track='login']")
	WebElement loginOption;
	
	@FindBy(how=How.CSS, using="input[name='email']")
	WebElement email;
	
	@FindBy(how=How.CSS, using="input[name='password']")
	WebElement password;
	
	@FindBy(how=How.CSS, using="button.login-login-button")
	WebElement loginBtn;
	
	public void loginUser(String uname, String pwd){
		
		if(logo.isDisplayed()){
			System.out.println("On Myntra Homepage");
		}
		else
			System.out.println("Error in navigating HomePage");
		icon.click();
		loginOption.click();
		email.sendKeys(uname);
		password.sendKeys(pwd);
		//loginBtn.click();
		driver.findElement(By.cssSelector("button.login-login-button")).click();
		
	}
	
	/*
	public static void main(String[] args) {
		
		File pathBinary = new File("C:\\Users\\ABHISHEK\\Downloads\\firefox-sdk\\bin\\firefox.exe");
		FirefoxBinary ffbinary = new FirefoxBinary(pathBinary);
		FirefoxProfile ffprofile = new FirefoxProfile();
		
		//System.setProperty("webdriver.firefox.driver", "C:\\Users\\ABHISHEK\\Downloads\\firefox-sdk\\bin\\firefox.exe");
		
		WebDriver driver = new FirefoxDriver(ffbinary,ffprofile);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.myntra.com");
		 
		//Boolean Logo = driver.findElement(By.xpath("//*[contains(@class, 'desktop-logo')]")).isDisplayed();
		//Boolean Logo = driver.findElement(By.cssSelector("a[class*='desktop-logo']")).isDisplayed();
		Boolean Logo = driver.findElement(By.cssSelector("div.desktop-logoContainer")).isDisplayed();
		//desktop-logoContainer
		System.out.println(Logo);
		
		driver.findElement(By.cssSelector("div.desktop-userIconsContainer")).click();
		driver.findElement(By.cssSelector("a.desktop-linkButton[data-track='login']")).click();
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Sweta");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Sweta123");
		driver.findElement(By.cssSelector("button.login-login-button")).click();
		

	}*/

}
