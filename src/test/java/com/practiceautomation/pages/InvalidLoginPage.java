package com.practiceautomation.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.excelutility.excelcode.ExcelUtility;

public class InvalidLoginPage extends LoginPage
{
	
	By myaccountclick = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By loginemail = By.id("username");
	By loginpassword = By.id("password");
	By loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");

	//To enter invalid login details
		public void invalidLogin() throws IOException, InterruptedException
		{
			Thread.sleep(2000);
			ExcelUtility excel1 = new ExcelUtility();
			
			driver.findElement(loginemail).sendKeys(excel1.username(2));
			driver.findElement(loginpassword).sendKeys(excel1.password(2));
			
			Thread.sleep(2000);
			driver.findElement(loginbutton).click();
		}
		
		//To take screenshot for invalid login
		public void screenshot1() throws InterruptedException, IOException
		{
			Thread.sleep(2000);
			TakesScreenshot snap = (TakesScreenshot)driver;
			File source = snap.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\HP\\Documents\\new\\snap1.png"));
		}
}
