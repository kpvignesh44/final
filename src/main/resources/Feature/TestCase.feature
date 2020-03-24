@Practice_Automation
Feature: Testing the practice automation website
@TC-01_Register
Scenario Outline:
	To check if the user is able to register with valid details
Given Launch the chrome browser in system
Then open the Practice automation website
Then The user enters "<username>" and "<password>"
And Click the Register button
Then Close the browser

Examples: 

|username	        |password	|
|vignesh@gmail.com	|9869868@7&	|
|vicky@gmail.com	|sanjeev!@#$|
|kpvic@gmail.com	|admin^%$#	|

@TC-02_Login_Functionlity
Scenario: To check if the user is able to login with valid details
Given Launch the chrome browser
Then open the Practice automation
Then  Enter the Email and password in Login
And Click Login Button
Then Close the browser

@TC-03_Filter_Functionality
Scenario: To check if the user is able to filter the price using slider
Given Launching the chrome browser in system
Then opening the Practice automation website
Then  Entering  the Email and password in Login
And Clicking Login Button
Then click_Shop_icon and Filter price using Slider
Then Closing the browser
#

@TC_04_Filtering_And_adding_to_Basket
Scenario: To check if the user is able to add the books in the basket on the filtered price
Given Launching the chrome
Then opening the Practice automation
Then Entering the Email and password
And Clicking Login
Then Click Shop icon Filter price using Slider
And Add the books to the basket and View the cart
Then Close


@TC_05_Adding_books_from_android_Category
Scenario: To check if the user is able to buy books from android category
Given Launch chrome
Then opening the website
Then Enter Email and password in website
And login Button
Then Click Shop icon, click android and buy the book
Then View the cart android book
Then Close the browser

@TC_06_Adding_books_from_JavaScript_Category
Scenario: To check if the user is able to buy books from javascipt category
Given Launching a chrome
Then open automation website
Then Enter Email password in website
And Click Login Button in myaccount
Then Click Shop icon, Click JavaScript and buy the book
Then View the cart js book
Then Closing the browser tab
@TC_07_Filtering_The_Price_from_low_to_high
Scenario: To check if the user is able to able to filter the prices from low to high
Given Launching the chrome browser in the system
Then open the Automation Practice website
Then  Enter the Email and password in Practice website
And Click Login button
Then Click Shop icon and in Dropdown select the prices from low to high
Then Close the browser tab

@TC_08_Delete_item_from_cart
Scenario: To check if the user is able to buy books from HTML category
Given Launch the chrome browser to open the automation website
Then opening the Practice automation website on chrome
Then Enter the Email_id and password in Login
And Clicking Login Button on automation website
Then Click Shop icon, Click HTML and buy the book
Then View the cart and Delete item from cart
Then Closing the chrome browser tabs

@TC_09_Placing_the_order
Scenario: To check if the user able to place the order 
Given Launching a chrome to open website
Then  opening the Practice automation website in system
Then Enter Email password in  auto website
And Click Login Button in automation website
Then Click Shop button  click Java and buy the book 
Then View cart, Click proceed to checkout, Enter the billing details and Click place order
And Order status Message
And Logut the user
Then Closing the browser tabs
