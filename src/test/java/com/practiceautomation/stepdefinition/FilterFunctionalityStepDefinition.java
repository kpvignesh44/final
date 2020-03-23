package com.practiceautomation.stepdefinition;

import com.practiceautomation.pages.FilterAddToBasketPage;
import com.practiceautomation.pages.FilterFunctionalityPage;
import com.practiceautomation.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FilterFunctionalityStepDefinition {
	LoginPage login = new LoginPage();
	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
	@Given("^Launching the chrome browser in system$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^opening the Practice automation website$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^Entering  the Email and password in Login$")
	public void enter_the_Email_and_password_in_Login() throws Exception 
	{
	    login.loginDetails();
	}

	@Then("^Clicking Login Button$")
	public void click_Login_Button() throws InterruptedException 
	{
	    login.clickLoginButton();
	}
	@Then("^click_Shop_icon and Filter price using Slider$")
	public void click_shop_icon_and_Filter_price_using_Slider() throws InterruptedException 
	{
		filterfunc.sliderfunc();
	}
	@Then("^Closing the browser$")
	public void close_the_browser() throws InterruptedException 
	{
	    login.closeBrowser();
	}
	
}
