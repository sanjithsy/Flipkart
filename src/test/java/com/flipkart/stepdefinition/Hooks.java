package com.flipkart.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.objectrepository.Pageobjectmodel;
import com.flipkart.resources.Commonactions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commonactions{
	
	Commonactions c = new Commonactions();
	Pageobjectmodel p = new Pageobjectmodel();

	@Before
	public void beforelaunch() {
		
		c.launchurl("https://www.flipkart.com/");
		c.button(p.getCloseicon());
	}
	@After
	
	public void afterlaunch() {
		  c.quit();
	}
	
}
