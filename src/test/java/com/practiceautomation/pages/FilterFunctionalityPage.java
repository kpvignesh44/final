package com.practiceautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FilterFunctionalityPage extends LoginPage
{

	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By filterslider = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[1]/div");
	By filterbutton = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form/div/div[2]/button");
	
	//To do slider operation in filter 
		public String sliderfunc() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(shopbutton).click();
			
			Thread.sleep(5000);
			WebElement Slider = driver.findElement(filterslider);

			Actions builder = new Actions(driver);
			org.openqa.selenium.interactions.Action dragAndDrop = builder.clickAndHold(Slider).moveByOffset(40,0).release().build();
			Thread.sleep(5000);
			dragAndDrop.perform(); 
			Thread.sleep(5000);
			driver.findElement(filterbutton).click();
			Thread.sleep(3000);
			String filter =	driver.getCurrentUrl();
			System.out.println(filter);
			return filter;
		}
		
		
}
