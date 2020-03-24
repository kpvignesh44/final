package com.practiceautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterPage extends LoginPage

{

	By myaccountclick = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By registeremail = By.id("reg_email");
	By registerpassword = By.id("reg_password");
	By registerbutton = By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]");
     
	//To enter registration details
		public void register(String username,String password) throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(registeremail).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(registerpassword).sendKeys(password);
		}
		
		//To click Register button
		public void clickRegisterButton() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(registerbutton).click();
		}
}
