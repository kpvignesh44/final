package com.practiceautomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PlaceOrderPage extends LoginPage
{
	
	By myaccountclick = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By javascriptclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[3]/a");
	By javascriptaddtobasket1 = By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]");
	By javascriptaddtobasket2 = By.xpath("//*[@id=\"content\"]/ul/li[3]/a[2]");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	By proceedtocheckout = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/a");
	By firstname = By.xpath("//*[@id=\"billing_first_name\"]");
	By lastname = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[2]/div[1]/div[1]/div/p[2]/input");
	By phoneno = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[2]/div[1]/div[1]/div/p[5]/input");
	By billingcountry = By.id("s2id_billing_country");
	By countrytextbox = By.xpath("//*[@id=\"s2id_autogen1_search\"]");
	By address = By.id("billing_address_1");
	By city = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[2]/div[1]/div[1]/div/p[9]/input");
	By stateorcountry = By.xpath("//*[@id=\"s2id_billing_state\"]/a/span[2]");
	By stateorcountrytextbox = By.xpath("//*[@id=\"s2id_autogen2_search\"]");
	By pincode = By.id("billing_postcode");
	By cod = By.id("payment_method_cod");
	By thankyoumessage = By.xpath("//*[@id=\"page-35\"]/div/div[1]/p[1]");
	By placeorder = By.id("place_order");
	By signoutclick = By.linkText("Sign out");
	
	//To click JavaScript book category and add books to the cart
			public int javascriptBookCategoryPurchase() throws InterruptedException
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

	//To enter all the necessary credentials in billing details section 
		public void placingOrderDetails() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
			
			Thread.sleep(2000);
			driver.findElement(proceedtocheckout).click();
			
			Thread.sleep(2000);
			driver.findElement(firstname).sendKeys("Madhumitha");
			driver.findElement(lastname).sendKeys("V");
			driver.findElement(phoneno).sendKeys("9087654356");
			driver.findElement(billingcountry).click();
			
			driver.findElement(countrytextbox).sendKeys("india");
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			act.sendKeys(Keys.DOWN).click().build().perform();
			Thread.sleep(2000);
			
			driver.findElement(address).sendKeys("No.9a,Sowbernika garden,Ariyankuppam");
			driver.findElement(city).sendKeys("pondicherry");
			driver.findElement(stateorcountry).click();
			
			driver.findElement(stateorcountrytextbox).sendKeys("po");
			Actions a=new Actions(driver);
			a.sendKeys(Keys.ENTER).build().perform();
			
			driver.findElement(pincode).sendKeys("605007");
			driver.findElement(cod).click();
			
			Thread.sleep(5000);
			driver.findElement(placeorder).click();
		}
		
		//To display order received message in console
		public void message() throws InterruptedException
		{
			Thread.sleep(2000);
			String b= driver.findElement(thankyoumessage).getText();
			System.out.println(b);
		}
		
		//To check if the user able to logout
		public void signout() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(myaccountclick).click();
			
			Thread.sleep(2000);
			driver.findElement(signoutclick).click();
		}
}
