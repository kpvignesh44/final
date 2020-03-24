package com.practiceautomation.stepdefinition;

import org.junit.Assert;

import com.practiceautomation.pages.FilterAddToBasketPage;
import com.practiceautomation.pages.FilterFunctionalityPage;
import com.practiceautomation.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FilteringAddToBasketPageStepDefinition {
	LoginPage login = new LoginPage();
	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
	@Given("^Launching the chrome$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^opening the Practice automation$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^Entering the Email and password$")
	public void enter_the_Email_and_password_in_Login() throws Exception 
	{
	    login.loginDetails();
	}

	@And("^Clicking Login$")
	public void click_Login_Button() throws InterruptedException 
	{
	    login.clickLoginButton();
	}
	@Then("^Click Shop icon Filter price using Slider$")
	public void click_shop_icon_and_Filter_price_using_Slider() throws InterruptedException 
	{
		filteraddtobasket.sliderFilter();
		String url1=filteraddtobasket.sliderFilter();
String expectedurl="http://practice.automationtesting.in/shop/?min_price=394&max_price=500";
		
		Assert.assertEquals(expectedurl, url1);
		
	}
	@And("^Add the books to the basket and View the cart$")
	public void add_the_books_to_the_basket_and_View_the_cart() throws InterruptedException
	{
		filteraddtobasket.addToBasketViewCartFilter();
	}

	@Then("^Close$")
	public void close_the_browser() throws InterruptedException 
	{
	    login.closeBrowser();
	}

	
//
//@TC_05_Filtering_And_adding_to_Basket
//Scenario: To check if the user is able to add the books in the basket on the filtered price
//Given Launching the chrome
//Then opening the Practice automation
//Then Entering the Email and password
//And Clicking Login
//Then Click Shop icon Filter price using Slider
//And Add the books to the basket and View the cart
//Then Close the browser
	
	
	
	
	
	
	
	
	
	
	
	
	
}
