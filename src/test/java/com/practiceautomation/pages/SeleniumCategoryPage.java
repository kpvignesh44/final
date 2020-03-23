package com.practiceautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumCategoryPage extends LoginPage
{
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By seleniumclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[4]/a");
	By seleniumaddtobasket = By.xpath("//*[@id=\"content\"]/ul/li/a[2]");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	
			
	//To click SeleniumBook category and add book to the cart
		public int seleniumBookCategory() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(shopbutton).click();
			
			Thread.sleep(5000);
			driver.findElement(seleniumclick).click();
			driver.findElement(seleniumaddtobasket).click();
			
			Thread.sleep(5000);
			List <WebElement> sele= driver.findElements(By.linkText("ADD TO BASKET"));
			System.out.println(sele.size());
			int selenium=sele.size();
			return selenium;
		}
		
		//To click view cart icon
		public void viewCartSelenium() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
		}
}
