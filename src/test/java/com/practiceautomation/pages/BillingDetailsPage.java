package com.practiceautomation.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BillingDetailsPage extends LoginPage
{
	By shopbutton = By.xpath("//*[@id=\"menu-item-40\"]");
	By seleniumclick = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[4]/a");
	By seleniumaddtobasket = By.xpath("//*[@id=\"content\"]/ul/li/a[2]");
	By viewcartbutton = By.xpath("//*[@id=\"wpmenucartli\"]/a/span[1]");
	By proceedtocheckout = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/div/a");
	By firstname = By.xpath("//*[@id=\"billing_first_name\"]");
	By phoneno = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[2]/div[1]/div[1]/div/p[5]/input");
	By billingcountry = By.id("s2id_billing_country");
	By countrytextbox = By.xpath("//*[@id=\"s2id_autogen1_search\"]");
	By address = By.id("billing_address_1");
	By city = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[2]/div[1]/div[1]/div/p[9]/input");
	By stateorcountry = By.xpath("//*[@id=\"s2id_billing_state\"]/a/span[2]");
	By stateorcountrytextbox = By.xpath("//*[@id=\"s2id_autogen2_search\"]");
	By pincode = By.id("billing_postcode");
	By cod = By.id("payment_method_cod");
	By placeorder = By.id("place_order");
			
	//To click SeleniumBook category and add book to the cart
		public int seleniumBookCategoryPurchase() throws InterruptedException
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
		
		//To check if all the mandatory fields are not entered,display an appropriate error message in billing details section
		public void billingDetails() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(viewcartbutton).click();
			
			Thread.sleep(2000);
			driver.findElement(proceedtocheckout).click();
			
			Thread.sleep(2000);
			driver.findElement(firstname).sendKeys("Savita");
			driver.findElement(phoneno).sendKeys("9087654321");
			driver.findElement(billingcountry).click();
			
			driver.findElement(countrytextbox).sendKeys("india");
			Actions action=new Actions(driver);
			Thread.sleep(2000);
			action.sendKeys(Keys.DOWN).click().build().perform();
			Thread.sleep(2000);
			
			driver.findElement(address).sendKeys("No.24,Ezhaimariyaman kovil street");
			driver.findElement(city).sendKeys("pondicherry");
			driver.findElement(stateorcountry).click();
			
			driver.findElement(stateorcountrytextbox).sendKeys("po");
			Actions action1=new Actions(driver);
			action1.sendKeys(Keys.ENTER).build().perform();
			
			driver.findElement(pincode).sendKeys("605001");
			driver.findElement(cod).click();
			
			Thread.sleep(5000);
			driver.findElement(placeorder).click();
		}
		
		//To take screenshot if mandatory fields are missing
		public void screenshot2() throws InterruptedException, IOException
		{
			Thread.sleep(5000);
			TakesScreenshot snap = (TakesScreenshot)driver;
			File source = snap.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\User\\Desktop\\project\\Training_Project\\Screenshots\\snap2.png"));
		}
		
}
