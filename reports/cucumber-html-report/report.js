$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/TestCase.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the practice automation website",
  "description": "",
  "id": "testing-the-practice-automation-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Automation Website",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;automation-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "testing-the-practice-automation-website;automation-website;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "testing-the-practice-automation-website;automation-website;;1"
    },
    {
      "cells": [
        "vignesh@gmail.com",
        "9869868@7\u0026"
      ],
      "line": 15,
      "id": "testing-the-practice-automation-website;automation-website;;2"
    },
    {
      "cells": [
        "vicky@gmail.com",
        "sanjeev!@#$"
      ],
      "line": 16,
      "id": "testing-the-practice-automation-website;automation-website;;3"
    },
    {
      "cells": [
        "kpvic@gmail.com",
        "admin^%$#"
      ],
      "line": 17,
      "id": "testing-the-practice-automation-website;automation-website;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Automation Website",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;automation-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    },
    {
      "line": 3,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user enters \"vignesh@gmail.com\" and \"9869868@7\u0026\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 4748070750,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 13555455329,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vignesh@gmail.com",
      "offset": 17
    },
    {
      "val": "9869868@7\u0026",
      "offset": 41
    }
  ],
  "location": "RegisterationStepDefinition.enter_the_Email_and_password(String,String)"
});
formatter.result({
  "duration": 7379822370,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.click_the_Register_button()"
});
formatter.result({
  "duration": 2061749227,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7100720500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Automation Website",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;automation-website;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    },
    {
      "line": 3,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user enters \"vicky@gmail.com\" and \"sanjeev!@#$\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3478932488,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 12780667699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vicky@gmail.com",
      "offset": 17
    },
    {
      "val": "sanjeev!@#$",
      "offset": 39
    }
  ],
  "location": "RegisterationStepDefinition.enter_the_Email_and_password(String,String)"
});
formatter.result({
  "duration": 7359837006,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.click_the_Register_button()"
});
formatter.result({
  "duration": 5244369700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7115676108,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Automation Website",
  "description": "To check if the user is able to register with valid details",
  "id": "testing-the-practice-automation-website;automation-website;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Practice_Automation"
    },
    {
      "line": 3,
      "name": "@TC-01_Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "open the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user enters \"kpvic@gmail.com\" and \"admin^%$#\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterationStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3478414447,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 13408242897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kpvic@gmail.com",
      "offset": 17
    },
    {
      "val": "admin^%$#",
      "offset": 39
    }
  ],
  "location": "RegisterationStepDefinition.enter_the_Email_and_password(String,String)"
});
formatter.result({
  "duration": 7335001234,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.click_the_Register_button()"
});
formatter.result({
  "duration": 2071425119,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7359904215,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To check if the user is able to login with valid details",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-is-able-to-login-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC-02_Login_Functionlity"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "open the Practice automation",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the Email and password in Login",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefiniton.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3367496615,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 12969744052,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2943893344,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefiniton.click_Login_Button()"
});
formatter.result({
  "duration": 8537272914,
  "status": "passed"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7082364775,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "To check if the user is able to filter the price using slider",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-is-able-to-filter-the-price-using-slider",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@TC-03_Filter_Functionality"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "Launching the chrome browser in system",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "opening the Practice automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Entering  the Email and password in Login",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Clicking Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "click_Shop_icon and Filter price using Slider",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Closing the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterFunctionalityStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3394307512,
  "status": "passed"
});
formatter.match({
  "location": "FilterFunctionalityStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 13540249007,
  "status": "passed"
});
formatter.match({
  "location": "FilterFunctionalityStepDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2440037108,
  "status": "passed"
});
formatter.match({
  "location": "FilterFunctionalityStepDefinition.click_Login_Button()"
});
formatter.result({
  "duration": 9715821929,
  "status": "passed"
});
formatter.match({
  "location": "FilterFunctionalityStepDefinition.click_shop_icon_and_Filter_price_using_Slider()"
});
formatter.result({
  "duration": 34632341025,
  "status": "passed"
});
formatter.match({
  "location": "FilterFunctionalityStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7112863884,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 35,
      "value": "#"
    }
  ],
  "line": 38,
  "name": "To check if the user is able to add the books in the basket on the filtered price",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-is-able-to-add-the-books-in-the-basket-on-the-filtered-price",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@TC_04_Filtering_And_adding_to_Basket"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "Launching the chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "opening the Practice automation",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "Entering the Email and password",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Clicking Login",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Click Shop icon Filter price using Slider",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "Add the books to the basket and View the cart",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Close",
  "keyword": "Then "
});
formatter.match({
  "location": "FilteringAddToBasketPageStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3313391138,
  "status": "passed"
});
formatter.match({
  "location": "FilteringAddToBasketPageStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 17104100983,
  "status": "passed"
});
formatter.match({
  "location": "FilteringAddToBasketPageStepDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2348808619,
  "status": "passed"
});
formatter.match({
  "location": "FilteringAddToBasketPageStepDefinition.click_Login_Button()"
});
formatter.result({
  "duration": 8418131744,
  "status": "passed"
});
formatter.match({
  "location": "FilteringAddToBasketPageStepDefinition.click_shop_icon_and_Filter_price_using_Slider()"
});
formatter.result({
  "duration": 64568923644,
  "status": "passed"
});
formatter.match({
  "location": "FilteringAddToBasketPageStepDefinition.add_the_books_to_the_basket_and_View_the_cart()"
});
formatter.result({
  "duration": 7251319079,
  "status": "passed"
});
formatter.match({
  "location": "FilteringAddToBasketPageStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7123110302,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "To check if the user is able to buy books from android category",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-is-able-to-buy-books-from-android-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@TC_05_Adding_books_from_android_Category"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "Launch chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "opening the website",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "Enter Email and password in website",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "login Button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Click Shop icon, click android and buy the book",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "View the cart android book",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AndroidCategoryStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3490811187,
  "status": "passed"
});
formatter.match({
  "location": "AndroidCategoryStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 15121855221,
  "status": "passed"
});
formatter.match({
  "location": "AndroidCategoryStepDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2365177135,
  "status": "passed"
});
formatter.match({
  "location": "AndroidCategoryStepDefinition.click_Login_Button()"
});
formatter.result({
  "duration": 9062308047,
  "status": "passed"
});
formatter.match({
  "location": "AndroidCategoryStepDefinition.click_Shop_icon_click_android_and_buy_the_book()"
});
formatter.result({
  "duration": 115596757787,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.practiceautomation.stepdefinition.AndroidCategoryStepDefinition.click_Shop_icon_click_android_and_buy_the_book(AndroidCategoryStepDefinition.java:60)\r\n\tat ✽.Then Click Shop icon, click android and buy the book(src/main/resources/Feature/TestCase.feature:54)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AndroidCategoryStepDefinition.view_the_cart_android_book()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegisterationStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 59,
  "name": "To check if the user is able to buy books from javascipt category",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-is-able-to-buy-books-from-javascipt-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 58,
      "name": "@TC_06_Adding_books_from_JavaScript_Category"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "Launching a chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "open automation website",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Enter Email password in website",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "Click Login Button in myaccount",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Click Shop icon, Click JavaScript and buy the book",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "View the cart js book",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "Closing the browser tab",
  "keyword": "Then "
});
formatter.match({
  "location": "JavascriptStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3479883614,
  "status": "passed"
});
formatter.match({
  "location": "JavascriptStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 13274743075,
  "status": "passed"
});
formatter.match({
  "location": "JavascriptStepDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2417881031,
  "status": "passed"
});
formatter.match({
  "location": "JavascriptStepDefinition.click_Login_Button()"
});
formatter.result({
  "duration": 9810640838,
  "status": "passed"
});
formatter.match({
  "location": "JavascriptStepDefinition.click_Shop_icon_Click_JavaScript_and_buy_the_book()"
});
formatter.result({
  "duration": 53240565193,
  "status": "passed"
});
formatter.match({
  "location": "JavascriptStepDefinition.view_the_cart_js_book()"
});
formatter.result({
  "duration": 5173069937,
  "status": "passed"
});
formatter.match({
  "location": "JavascriptStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7107957974,
  "status": "passed"
});
formatter.scenario({
  "line": 68,
  "name": "To check if the user is able to able to filter the prices from low to high",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-is-able-to-able-to-filter-the-prices-from-low-to-high",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 67,
      "name": "@TC_07_Filtering_The_Price_from_low_to_high"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "Launching the chrome browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "open the Automation Practice website",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Enter the Email and password in Practice website",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "Click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Click Shop icon and in Dropdown select the prices from low to high",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "Close the browser tab",
  "keyword": "Then "
});
formatter.match({
  "location": "SotingLowtoHighStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3549761784,
  "status": "passed"
});
formatter.match({
  "location": "SotingLowtoHighStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 13237583436,
  "status": "passed"
});
formatter.match({
  "location": "SotingLowtoHighStepDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2317664601,
  "status": "passed"
});
formatter.match({
  "location": "SotingLowtoHighStepDefinition.click_Login_Button()"
});
formatter.result({
  "duration": 9355076842,
  "status": "passed"
});
formatter.match({
  "location": "SotingLowtoHighStepDefinition.click_Shop_icon_and_in_Dropdown_select_the_prices_from_low_to_high()"
});
formatter.result({
  "duration": 23047154209,
  "status": "passed"
});
formatter.match({
  "location": "SotingLowtoHighStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7091679322,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "To check if the user is able to buy books from HTML category",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-is-able-to-buy-books-from-html-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 76,
      "name": "@TC_08_Delete_item_from_cart"
    }
  ]
});
formatter.step({
  "line": 78,
  "name": "Launch the chrome browser to open the automation website",
  "keyword": "Given "
});
formatter.step({
  "line": 79,
  "name": "opening the Practice automation website on chrome",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "Enter the Email_id and password in Login",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "Clicking Login Button on automation website",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "Click Shop icon, Click HTML and buy the book",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "View the cart and Delete item from cart",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "Closing the chrome browser tabs",
  "keyword": "Then "
});
formatter.match({
  "location": "DeletingCartStepDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 4278768467,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 14053380898,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2317359893,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.click_Login_Button()"
});
formatter.result({
  "duration": 9893916338,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.click_Shop_icon_Click_HTML_and_buy_the_book()"
});
formatter.result({
  "duration": 55783401764,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.view_the_cart_html_book()"
});
formatter.result({
  "duration": 8697835856,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7127639386,
  "status": "passed"
});
formatter.scenario({
  "line": 87,
  "name": "To check if the user able to place the order",
  "description": "",
  "id": "testing-the-practice-automation-website;to-check-if-the-user-able-to-place-the-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 86,
      "name": "@TC_09_Placing_the_order"
    }
  ]
});
formatter.step({
  "line": 88,
  "name": "Launching a chrome to open website",
  "keyword": "Given "
});
formatter.step({
  "line": 89,
  "name": "opening the Practice automation website in system",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "Enter Email password in  auto website",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "Click Login Button in automation website",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "Click Shop button  click Java and buy the book",
  "keyword": "Then "
});
formatter.step({
  "line": 93,
  "name": "View cart, Click proceed to checkout, Enter the billing details and Click place order",
  "keyword": "Then "
});
formatter.step({
  "line": 94,
  "name": "Order status Message",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Logut the user",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "Closing the browser tabs",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.launch_the_chrome_browser_in_system()"
});
formatter.result({
  "duration": 3318064082,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 12812335422,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 2312130395,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.click_Login_Button()"
});
formatter.result({
  "duration": 9168557844,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.click_Shop_icon_Click_JavaScript_and_buy_the_book()"
});
formatter.result({
  "duration": 52357679507,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.view_cart_Click_proceed_to_checkout_Enter_the_billing_details_and_Click_place_order()"
});
formatter.result({
  "duration": 24576617614,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.order_status_Message()"
});
formatter.result({
  "duration": 3971330271,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.logut_the_user()"
});
formatter.result({
  "duration": 10691937285,
  "status": "passed"
});
formatter.match({
  "location": "PlaceOrderStepsDefinition.close_the_browser()"
});
formatter.result({
  "duration": 7158729409,
  "status": "passed"
});
});