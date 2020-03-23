package com.practiceautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JavaScriptPage extends LoginPage
{
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By javascriptclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[3]/a");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	By javascriptaddtobasket1 = By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]");
	By javascriptaddtobasket2 = By.xpath("//*[@id=\"content\"]/ul/li[3]/a[2]");
	
	
	//To click JavaScript book category and add books to the cart
		public int javascriptBookCategory() throws InterruptedException
		{	
			Thread.sleep(5000);
			driver.findElement(shopbutton).click();
			
			Thread.sleep(5000);
			driver.findElement(javascriptclick).click();
			driver.findElement(javascriptaddtobasket1).click();
			driver.findElement(javascriptaddtobasket2).click();
			
			Thread.sleep(5000);
			List <WebElement> js= driver.findElements(By.linkText("ADD TO BASKET"));
			System.out.println(js.size());
			int java=js.size();
			return java;
		}
		
		//To click view cart icon
				public void viewCartJavaScript() throws InterruptedException
				{
					Thread.sleep(2000);
					driver.findElement(viewcartbutton).click();
				}
				
}
