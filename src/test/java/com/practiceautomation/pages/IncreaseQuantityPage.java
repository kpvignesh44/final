package com.practiceautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IncreaseQuantityPage extends LoginPage
{
	
	By quantityclick = By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input");
	By updatebutton = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form/table/tbody/tr[4]/td/input[1]");
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By htmlcategoryclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[2]/a");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	By htmladdtobasket1 = By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]");
	By htmladdtobasket2 = By.xpath("//*[@id=\"content\"]/ul/li[3]/a[2]");
	
	
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
		
	
	//To increase quantity and update the basket
		public void quantityUpdate() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
			
			Thread.sleep(5000);
			driver.findElement(quantityclick).click();
					
			Thread.sleep(5000);
			driver.findElement(quantityclick).clear();
			driver.findElement(quantityclick).sendKeys("3");
					
			Thread.sleep(5000);
			driver.findElement(updatebutton).click();
		}
}
