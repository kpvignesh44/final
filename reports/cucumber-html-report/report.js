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
  "duration": 4650241765,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.open_the_Practice_automation_website()"
});
formatter.result({
  "duration": 16538328630,
  "status": "passed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.enter_the_Email_and_password_in_Login()"
});
formatter.result({
  "duration": 32124425416,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#username\"}\n  (Session info: chrome\u003d80.0.3987.149)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-P3S8U0P\u0027, ip: \u0027192.168.43.77\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:60976}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: feb2ee4ee48c1e1ad5c19a9888bc8b7e\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.practiceautomation.pages.LoginPage.loginDetails(LoginPage.java:42)\r\n\tat com.practiceautomation.stepdefinition.DeletingCartStepDefinition.enter_the_Email_and_password_in_Login(DeletingCartStepDefinition.java:30)\r\n\tat ✽.Then Enter the Email_id and password in Login(src/main/resources/Feature/TestCase.feature:80)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DeletingCartStepDefinition.click_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletingCartStepDefinition.click_Shop_icon_Click_HTML_and_buy_the_book()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletingCartStepDefinition.view_the_cart_html_book()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletingCartStepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});