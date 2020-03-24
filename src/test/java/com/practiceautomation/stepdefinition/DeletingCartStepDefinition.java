package com.practiceautomation.stepdefinition;

import org.junit.Assert;

import com.practiceautomation.pages.DeletingFromCart;
import com.practiceautomation.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DeletingCartStepDefinition {
	LoginPage login = new LoginPage();
	
	@Given("^Launch the chrome browser to open the automation website$")
	public void launch_the_chrome_browser_in_system() 
	{
	    login.launchChrome();
	}

	@Then("^opening the Practice automation website on chrome$")
	public void open_the_Practice_automation_website() throws InterruptedException 
	{
	    login.openWebsite();
	}

	@Then("^Enter the Email_id and password in Login$")
	public void enter_the_Email_and_password_in_Login() throws Exception 
	{
	    login.loginDetails();
	}

	@And("^Clicking Login Button on automation website$")
	public void click_Login_Button() throws InterruptedException 
	{
	    login.clickLoginButton();
	}
	
	
	
	DeletingFromCart html=new DeletingFromCart ();
	@Then("^Click Shop icon, Click HTML and buy the book$")
public int click_Shop_icon_Click_HTML_and_buy_the_book() throws InterruptedException
{
	Thread.sleep(2000);
	html.htmlBookCategory();
	int htmlbook=html.htmlBookCategory();
	System.out.println("Total number of HTML books Available: "+htmlbook);
	Boolean bo;
	if(htmlbook==0)
	{
		bo=false;
		Assert.assertTrue(bo);
		System.out.println("OUT OF STOCK");
	}
	else
	{
		System.out.println(" STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");
	}
	return htmlbook;
}

@Then("^View the cart and Delete item from cart$")
public void view_the_cart_html_book() throws InterruptedException 
{
 html.delete();
}
@Then("^Closing the chrome browser tabs$")
public void close_the_browser() throws InterruptedException 
{
    login.closeBrowser();
}
}
