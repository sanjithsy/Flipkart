package com.flipkart.stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.Pageobjectmodel;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobilevalidation extends Pageobjectmodel{
	
	Commonactions c = new Commonactions();
	Pageobjectmodel p = new Pageobjectmodel();
	
	
	
	@Given("launch the URL")
	public void launch_the_URL() {
	   System.out.println("Url launch");
		
		
	}

	@When("search product")
	public void search_product() {
		
	   c.Inserttext(p.getSearchbar(), "redmi mobiles");
		
	}

	@And("select product & add that to cart")
	public void select_product_add_that_to_cart() throws Throwable {
	
		c.button(p.getRedmi());
	   
	   c.windowshandling();
	   JavascriptExecutor j = (JavascriptExecutor)driver;
	   WebElement scrolld = driver.findElement(By.xpath("//span[text()='View 4 more offers']"));
	   j.executeScript("arguments[0].scrollIntoView(true)", scrolld);
	   WebElement pin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   pin.sendKeys("629165",Keys.ENTER);
	   c.Inserttext(p.getPin(),"629165");
	   c.wait();
	   c.button(p.getCart());
	   
	}

	@And("place order & login to the application")
	public void place_order_login_to_the_application() {
	  
	    c.button(p.getOrder());
	    c.Inserttext(p.getLogin(),"9787685695");
	    c.button(p.getConti());
	    c.Inserttext(p.getPass(),"Raja@1234");
	    c.button(p.getLog());
	}

	@And("Select address & Select payment option")
	public void select_address_Select_payment_option() throws Throwable {
		
		c.button(p.getSelect());
		Thread.sleep(5000);
	   c.button(p.getDelivery());
	   c.button(p.getCon());
	   c.button(p.getAccept());
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   WebElement down = driver.findElement(By.xpath("//span[text()='Not applicable ']"));
	   js.executeScript("arguments[0].scrollIntoView(true)", down);
	  c.wait();
	  c.button(p.getCash());
	}

	@And("Remove product from the cart")
	public void remove_product_from_the_cart() {
	  c.backward();
	  c.button(p.getRemove());
	}

	@Then("user closes application")
	public void user_closes_application() {
	  c.quit();
	}

}
