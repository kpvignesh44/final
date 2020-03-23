package com.practiceautomation.stepdefinition;

import com.practiceautomation.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefiniton {

	LoginPage login = new LoginPage();

	@Given("^Launch the chrome browser$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^open the Practice automation$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^Enter the Email and password in Login$")
	public void enter_the_Email_and_password_in_Login() throws Exception 
	{
	    login.loginDetails();
	}

	@Then("^Click Login Button$")
	public void click_Login_Button() throws InterruptedException 
	{
	    login.clickLoginButton();
	}
}
