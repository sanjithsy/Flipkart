$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Mobilepurchase.feature");
formatter.feature({
  "name": "",
  "description": "  Mobile Validation",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "Mobilevalidation.launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search product",
  "keyword": "When "
});
formatter.match({
  "location": "Mobilevalidation.search_product()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat com.flipkart.resources.Commonactions.Inserttext(Commonactions.java:27)\r\n\tat com.flipkart.stepdefinition.Mobilevalidation.search_product(Mobilevalidation.java:39)\r\n\tat ✽.search product(src/test/resources/Features/Mobilepurchase.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "select product \u0026 add that to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilevalidation.select_product_add_that_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "place order \u0026 login to the application",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilevalidation.place_order_login_to_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select address \u0026 Select payment option",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilevalidation.select_address_Select_payment_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Remove product from the cart",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilevalidation.remove_product_from_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user closes application",
  "keyword": "Then "
});
formatter.match({
  "location": "Mobilevalidation.user_closes_application()"
});
formatter.result({
  "status": "skipped"
});
});