package com.practiceautomation.stepdefinition;

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

public class RegisterationStepDefinition {
	LoginPage login = new LoginPage();
	RegisterPage reg = new RegisterPage();
	AndroidCategoryPage androidbook = new AndroidCategoryPage();
	BillingDetailsPage billing = new BillingDetailsPage();
	
	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
	
	JavaScriptPage js = new JavaScriptPage();
	PlaceOrderPage placeorder = new PlaceOrderPage();
	SortingLowToHighPage lowtohigh = new SortingLowToHighPage();
	
	@Given("^Launch the chrome browser in system$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^open the Practice automation website$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^The user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_Email_and_password(String username,String password) throws InterruptedException 
	{
	    reg.register(username,password);
	}

	@And("^Click the Register button$")
	public void click_the_Register_button() throws InterruptedException
	{
	    reg.clickRegisterButton();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws InterruptedException 
	{
	    login.closeBrowser();
	}

}
