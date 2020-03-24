////package com.practiceautomation.stepdefinition;
////
////import java.io.IOException;
////import org.junit.Assert;
////
////import com.practiceautomation.pages.AndroidCategoryPage;
////import com.practiceautomation.pages.BillingDetailsPage;
////import com.practiceautomation.pages.DeleteItemPage;
////import com.practiceautomation.pages.FilterAddToBasketPage;
////import com.practiceautomation.pages.FilterFunctionalityPage;
////import com.practiceautomation.pages.HtmlCategoryPage;
////import com.practiceautomation.pages.IncreaseQuantityPage;
////import com.practiceautomation.pages.InvalidLoginPage;
////import com.practiceautomation.pages.JavaScriptPage;
////import com.practiceautomation.pages.Launch_Chrome;
////import com.practiceautomation.pages.LoginPage;
////import com.practiceautomation.pages.PlaceOrderPage;
////import com.practiceautomation.pages.RegisterPage;
////import com.practiceautomation.pages.SeleniumCategoryPage;
////import com.practiceautomation.pages.SortingHighToLowPage;
//import com.practiceautomation.pages.SortingLowToHighPage;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////
////public class PracticeAutomationStepDefinition extends RegisterPage
////{
////	
////	LoginPage login = new LoginPage();
//////	Launch_Chrome l=new Launch_Chrome();
////	RegisterPage reg = new RegisterPage();
////	InvalidLoginPage invalid = new InvalidLoginPage();
////	AndroidCategoryPage androidbook = new AndroidCategoryPage();
////	BillingDetailsPage billing = new BillingDetailsPage();
////	DeleteItemPage remove = new DeleteItemPage();
////	FilterAddToBasketPage filteraddtobasket = new FilterAddToBasketPage();
////	FilterFunctionalityPage filterfunc = new FilterFunctionalityPage();
////	HtmlCategoryPage html = new HtmlCategoryPage();
////	IncreaseQuantityPage quantity = new IncreaseQuantityPage();
////	JavaScriptPage js = new JavaScriptPage();
////	PlaceOrderPage placeorder = new PlaceOrderPage();
////	SeleniumCategoryPage selenium = new SeleniumCategoryPage();
////	SortingHighToLowPage hightolow = new SortingHighToLowPage();
////	SortingLowToHighPage lowtohigh = new SortingLowToHighPage();
////	
//////	@Given("^Launch the chrome browser in system$")
//////	public void launch_the_chrome_browser_in_system() 
//////	{
//////	    login.launchChrome();
//////	}
//////
//////	@Then("^open the Practice automation website$")
//////	public void open_the_Practice_automation_website() throws InterruptedException 
//////	{
//////	    login.openWebsite();
//////	}
//////
//////	@Then("^Enter the Email and password$")
//////	public void enter_the_Email_and_password() throws InterruptedException 
//////	{
//////	    reg.register();
//////	}
//////
//////	@Then("^Click the Register button$")
//////	public void click_the_Register_button() throws InterruptedException
//////	{
//////	    reg.clickRegisterButton();
//////	}
//////
//////	@Then("^Close the browser$")
//////	public void close_the_browser() throws InterruptedException 
//////	{
//////	    login.closeBrowser();
//////	}
////
//////	@Then("^Enter the Email and password in Login$")
//////	public void enter_the_Email_and_password_in_Login() throws Exception 
//////	{
//////	    login.loginDetails();
//////	}
//////
//////	@Then("^Click Login Button$")
//////	public void click_Login_Button() throws InterruptedException 
//////	{
//////	    login.clickLoginButton();
//////	}
//////
//////	@Then("^Enter the invalid Email and password and click login button$")
//////	public void enter_the_invalid_Email_and_password_in_Login() throws IOException, InterruptedException
//////	{
//////	    invalid.invalidLogin();
//////	}
//////
//////	@Then("^Take Screenshot if invalid$")
//////	public void take_Screenshot_if_invalid() throws InterruptedException, IOException
//////	{
//////	    invalid.screenshot1();
//////	}
////
//////	@Then("^click_Shop_icon and Filter price using Slider$")
//////	public void click_shop_icon_and_Filter_price_using_Slider() throws InterruptedException 
//////	{
//////		filterfunc.sliderfunc();
//////	}
////
//////	@Then("^Click Shop icon and Filter price using Slider$")
//////	public void click_Shop_icon_and_Filter_price_using_Slider() throws InterruptedException 
//////	{
//////		filteraddtobasket.sliderFilter();
//////	}
//////
//////	@Then("^Add the books to the basket and View the cart$")
//////	public void add_the_books_to_the_basket_and_View_the_cart() throws InterruptedException
//////	{
//////		filteraddtobasket.addToBasketViewCartFilter();
//////	}
//////
//////	@Then("^Click Shop icon, click android and buy the book$")
//////	public int click_Shop_icon_click_android_and_buy_the_book() throws InterruptedException
//////	{
//////	    androidbook.androidBookCategory();
//////		int android=androidbook.androidBookCategory();
//////		System.out.println("Total number of Android books Available: "+android);
//////		Boolean b;
//////		if(android==0)
//////		{
//////			b=false;
//////			Assert.assertTrue(b);
//////			System.out.println("STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");
//////		}
//////		else
//////		{
//////			System.out.println("OUT OF STOCK");
//////		}
//////		
//////		return android;
//////	}
//////
//////	@Then("^View the cart android book$")
//////	public void view_the_cart_android_book() throws InterruptedException
//////	{
//////	   androidbook.viewCartAndroid();
//////	}
////
////	@Then("^Click Shop icon, Click HTML and buy the book$")
////	public int click_Shop_icon_Click_HTML_and_buy_the_book() throws InterruptedException
////	{
////		Thread.sleep(2000);
////		html.htmlBookCategory();
////		int htmlbook=html.htmlBookCategory();
////		System.out.println("Total number of HTML books Available: "+htmlbook);
////		Boolean bo;
////		if(htmlbook==0)
////		{
////			bo=false;
////			Assert.assertTrue(bo);
////			System.out.println("OUT OF STOCK");
////		}
////		else
////		{
////			System.out.println(" STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");
////		}
////		return htmlbook;
////	}
////
////	@Then("^View the cart html book$")
////	public void view_the_cart_html_book() throws InterruptedException 
////	{
////	   html.viewCartHtml();
////	}
////
////	@Then("^View the cart, Increase quantity and update$")
////	public void view_the_cart_Increase_quantity_and_update() throws InterruptedException
////	{
////	    quantity.quantityUpdate();
////	}
////
////	@Then("^Click Shop icon, Click JavaScript and buy the book$")
////	public int click_Shop_icon_Click_JavaScript_and_buy_the_book() throws InterruptedException 
////	{
////		js.javascriptBookCategory();
////		int javascript=js.javascriptBookCategory();
////		boolean script;
////		if(javascript==0)
////		{
////			script=false;
////			System.out.println("OUT OF STOCK");
////			Assert.assertTrue(script);
////		}
////		else
////		{
////			System.out.println("STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");	
////		}
////		return javascript;
////	}
////
////	@Then("^View the cart js book$")
////	public void view_the_cart_js_book() throws InterruptedException 
////	{
////	    js.viewCartJavaScript();
////	}
////
////	@Then("^Click Shop icon, Click Selenium and buy the book$")
////	public int click_Shop_icon_Click_Selenium_and_buy_the_book() throws InterruptedException 
////	{
////		selenium.seleniumBookCategory();
////		int sel_book=selenium.seleniumBookCategory();
////		boolean book;
////		if(sel_book==0)
////		{
////			book=false;
////			Assert.assertTrue(false);
////			System.out.println("OUT OF STOCKS");
////		}		
////		else
////		{
////			System.out.println("STOCKS ARE AVAILABLE ,YOU CAN BUY THE BOOK");	
////		}
////		return sel_book;
////	}
////
////	@Then("^View the cart selenium book$")
////	public void view_the_cart_selenium_book() throws InterruptedException 
////	{
////	    selenium.viewCartSelenium();
////	}
////
////	@Then("^View the cart and Delete item from cart$")
////	public void view_the_cart_and_Delete_item_from_cart() throws InterruptedException 
////	{
////	    remove.delete();
////	}
////
////	@Then("^Click Shop icon and in Dropdown select the prices from low to high$")
////	public void click_Shop_icon_and_in_Dropdown_select_the_prices_from_low_to_high() throws InterruptedException 
////	{
////	    lowtohigh.priceLowToHigh();
////	}
////
////	@Then("^Click Shop icon and in Dropdown select the prices from high to low$")
////	public void click_Shop_icon_and_in_Dropdown_select_the_prices_from_high_to_low() throws InterruptedException 
////	{
////	    hightolow.priceHighToLow();
////	}
////
////	@Then("^Click Shop button  Click Selenium, buy the book and View cart$")
////	public void click_Shop_button_Click_Selenium_buy_the_book_and_View_cart() throws InterruptedException 
////	{
////		billing.seleniumBookCategoryPurchase();
////	}
////
////	@Then("^Click proceed to checkout, enter the mandatory details in billing details and click place order$")
////	public void click_proceed_to_checkout_enter_the_mandatory_details_in_billing_details_and_click_place_order() throws InterruptedException  
////	{
////	    billing.billingDetails();
////	}
////
////	@Then("^Take Screenshot if mandatory fields are mising$")
////	public void take_Screenshot_if_mandatory_fields_are_mising() throws InterruptedException, IOException 
////	{
////	    billing.screenshot2();
////	}
////
////	@Then("^Click Shop button  click JavaScript and buy the book$")
////	public void click_Shop_button_click_JavaScript_and_buy_the_book() throws InterruptedException 
////	{
////	    placeorder.javascriptBookCategoryPurchase();
////	}
////
////	@Then("^View cart, Click proceed to checkout, Enter the billing details and Click place order$")
////	public void view_cart_Click_proceed_to_checkout_Enter_the_billing_details_and_Click_place_order() throws InterruptedException
////	{
////	    placeorder.placingOrderDetails();
////	}
////
//	//@Then("^Order status Message$")
////	public void order_status_Message() throws InterruptedException 
////	{
////	    placeorder.message();
////	}
////
////	@Then("^Logut the user$")
////	public void logut_the_user() throws InterruptedException 
////	{
////	    placeorder.signout();
////	}
////
////	
////	
////}
////
