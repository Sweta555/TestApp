package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public static WebElement element = null;
	
	public static WebElement txtbox_UserName(WebDriver driver){
	
		element = driver.findElement(By.xpath("//*[@class='_2zrpKA']"));
		return element;
	}
	
	public static WebElement txtbox_Password(WebDriver driver){
		
		element = driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv']"));
		return element;
	}
	
	public static WebElement button_Login(WebDriver driver){
		
		element = driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
		return element;
	}
	
}
