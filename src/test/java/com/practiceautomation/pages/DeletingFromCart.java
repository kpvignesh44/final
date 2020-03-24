package com.practiceautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeletingFromCart extends LoginPage {

	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By htmlcategoryclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[2]/a");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	By htmladdtobasket1 = By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]");
	By htmladdtobasket2 = By.xpath("//*[@id=\"content\"]/ul/li[3]/a[2]");
	By removeclick = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a");
		
		//To click HTML book category and add books to the cart
			public int htmlBookCategory() throws InterruptedException
			{
				Thread.sleep(5000);
				driver.findElement(shopbutton).click();
				
				Thread.sleep(5000);
				driver.findElement(htmlcategoryclick).click();
				driver.findElement(htmladdtobasket1).click();
				driver.findElement(htmladdtobasket2).click();

				Thread.sleep(5000);
				List <WebElement> html= driver.findElements(By.linkText("ADD TO BASKET"));
				System.out.println(html.size());
				int a=html.size();
				return a;
			}
			
				
	//To delete an item from cart
		public void delete() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
			
			Thread.sleep(2000);
			driver.findElement(removeclick).click();
		}
}
