package com.practiceautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelutility.excelcode.ExcelUtility;

public class LoginPage 
{
	
	static WebDriver driver;
	By loginemail = By.id("username");
	By loginpassword = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
	
	//To launch ChromeBrowser
			public void launchChrome() 
			{ 
				System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");			
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				System.out.println(driver.getTitle());
			}
			
			//To open Practice Automation WebSite
			public void openWebsite() throws InterruptedException 
			{
				Thread.sleep(5000);
				driver.get("http://practice.automationtesting.in/my-account/");
			}
			
	//To enter login details
		public void loginDetails() throws Exception
		{
			Thread.sleep(2000);
			ExcelUtility excel = new ExcelUtility();

			driver.findElement(loginemail).sendKeys(excel.username(1));	
			driver.findElement(loginpassword).sendKeys(excel.password(1));
		}
		
	//To click login button
		public void clickLoginButton() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(loginbutton).click();
		}
		
		//To close the browser
				public void closeBrowser() throws InterruptedException
				{
					Thread.sleep(5000);
					driver.close();
				}
}
