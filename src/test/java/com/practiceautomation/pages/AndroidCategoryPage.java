package com.practiceautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidCategoryPage extends LoginPage
{
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By androidclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[1]/a");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	
			
		//To click android book category
		public int androidBookCategory() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(shopbutton).click();
			
			Thread.sleep(5000);
			driver.findElement(androidclick).click();

			Thread.sleep(5000);
			List <WebElement> s= driver.findElements(By.linkText("ADD TO BASKET"));
			System.out.println(s.size());
			int size=s.size();
			return size;
			
		}
		
		//To click view cart icon
		public void viewCartAndroid() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
		}
		
}
