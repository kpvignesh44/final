package com.practiceautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {
	WebDriver driver;
	public void launchChrome() 
	{ 
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	
}
