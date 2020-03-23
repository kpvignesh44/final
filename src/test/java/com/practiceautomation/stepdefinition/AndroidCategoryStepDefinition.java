package com.practiceautomation.stepdefinition;

import org.junit.Assert;

import com.practiceautomation.pages.AndroidCategoryPage;
import com.practiceautomation.pages.BillingDetailsPage;
import com.practiceautomation.pages.DeleteItemPage;
import com.practiceautomation.pages.FilterAddToBasketPage;
import com.practiceautomation.pages.FilterFunctionalityPage;
import com.practiceautomation.pages.HtmlCategoryPage;
import com.practiceautomation.pages.IncreaseQuantityPage;
import com.practiceautomation.pages.InvalidLoginPage;
import com.practiceautomation.pages.JavaScriptPage;
import com.practiceautomation.pages.LoginPage;
import com.practiceautomation.pages.PlaceOrderPage;
import com.practiceautomation.pages.RegisterPage;
import com.practiceautomation.pages.SeleniumCategoryPage;
import com.practiceautomation.pages.SortingHighToLowPage;
import com.practiceautomation.pages.SortingLowToHighPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AndroidCategoryStepDefinition {
	LoginPage login = new LoginPage();

//	LoginPage login = new LoginPage();
//	Launch_Chrome l=new Launch_Chrome();
	RegisterPage reg = new RegisterPage();
	InvalidLoginPage invalid = new InvalidLoginPage();
	AndroidCategoryPage androidbook = new AndroidCategoryPage();
	BillingDetailsPage billing = new BillingDetailsPage();
	DeleteItemPage remove = new DeleteItemPage();
//	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
//	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
	HtmlCategoryPage html = new HtmlCategoryPage();
	IncreaseQuantityPage quantity = new IncreaseQuantityPage();
	JavaScriptPage js = new JavaScriptPage();
	PlaceOrderPage placeorder = new PlaceOrderPage();
	SeleniumCategoryPage selenium = new SeleniumCategoryPage();
	SortingHighToLowPage hightolow = new SortingHighToLowPage();
	SortingLowToHighPage lowtohigh = new SortingLowToHighPage();
	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
	@Given("^Launch chrome$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^opening the website$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^Enter Email and password in website$")
	public void enter_the_Email_and_password_in_Login() throws Exception 
	{
	    login.loginDetails();
	}

	@And("^login Button$")
	public void click_Login_Button() throws InterruptedException 
	{
	    login.clickLoginButton();
	}

	@Then("^Click Shop icon, click android and buy the book$")
	public int click_Shop_icon_click_android_and_buy_the_book() throws InterruptedException
	{
	    androidbook.androidBookCategory();
		int android=androidbook.androidBookCategory();
		System.out.println("Total number of Android books Available: "+android);
		Boolean b;
		if(android==0)
		{
			b=false;
			Assert.assertTrue(b);
			System.out.println("STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");
		}
		else
		{
			System.out.println("OUT OF STOCK");
		}
		
		return android;
	}

	@Then("^View the cart android book$")
	public void view_the_cart_android_book() throws InterruptedException
	{
	   androidbook.viewCartAndroid();
	}
	@Then("^Closing the browsers$")
	public void close_the_browser() throws InterruptedException 
	{
	    login.closeBrowser();
	}

}
