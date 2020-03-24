package com.practiceautomation.stepdefinition;

import org.junit.Assert;

import com.practiceautomation.pages.AndroidCategoryPage;
import com.practiceautomation.pages.BillingDetailsPage;

import com.practiceautomation.pages.FilterAddToBasketPage;
import com.practiceautomation.pages.FilterFunctionalityPage;


import com.practiceautomation.pages.JavaScriptPage;
import com.practiceautomation.pages.LoginPage;
import com.practiceautomation.pages.PlaceOrderPage;
import com.practiceautomation.pages.RegisterPage;

import com.practiceautomation.pages.SortingLowToHighPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PlaceOrderStepsDefinition {

	LoginPage login = new LoginPage();

	RegisterPage reg = new RegisterPage();
	AndroidCategoryPage androidbook = new AndroidCategoryPage();
	BillingDetailsPage billing = new BillingDetailsPage();
	JavaScriptPage js = new JavaScriptPage();
	PlaceOrderPage placeorder = new PlaceOrderPage();
	SortingLowToHighPage lowtohigh = new SortingLowToHighPage();
	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
	@Given("^Launching a chrome to open website$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^opening the Practice automation website in system$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^Enter Email password in  auto website$")
	public void enter_the_Email_and_password_in_Login() throws Exception 
	{
	    login.loginDetails();
	}

	@And("^Click Login Button in automation website$")
	public void click_Login_Button() throws InterruptedException 
	{
	    login.clickLoginButton();
	}

	@Then("^Click Shop button  click Java and buy the book$")
	public int click_Shop_icon_Click_JavaScript_and_buy_the_book() throws InterruptedException 
	{
		js.javascriptBookCategory();
		int javascript=js.javascriptBookCategory();
		boolean script;
		if(javascript==0)
		{
			script=false;
			System.out.println("OUT OF STOCK");
			Assert.assertTrue(script);
		}
		else
		{
			System.out.println("STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");	
		}
		return javascript;
	}

//	@Then("^View the cart javascript book$")
//	public void view_the_cart_js_book() throws InterruptedException 
//	{
//	    js.viewCartJavaScript();
//	}
	@Then("^View cart, Click proceed to checkout, Enter the billing details and Click place order$")
	public void view_cart_Click_proceed_to_checkout_Enter_the_billing_details_and_Click_place_order() throws InterruptedException
	{
	    placeorder.placingOrderDetails();
	}



@Then("^Order status Message$")
	public void order_status_Message() throws InterruptedException 
	{
	    placeorder.message();
	}

	@Then("^Logut the user$")
	public void logut_the_user() throws InterruptedException 
	{
	    placeorder.signout();
	}

	@Then("^Closing the browser tabs$")
	public void close_the_browser() throws InterruptedException 
	{
	    login.closeBrowser();
	}

	
}
