package com.flipkart.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	public void launchurl(String url) {
		
		 WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   driver.get(url);
		   driver.manage().window().maximize();

	}
public void Inserttext(WebElement element,String value) {
		
		element.sendKeys(value, Keys.ENTER);
		
	}
public void button(WebElement ele) {
	ele.click();
}
public void waits() {
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
public void windowshandling() {
	 String parent = driver.getWindowHandle();
	   Set<String> child = driver.getWindowHandles();
	   for(String x:child) {
		   if(!parent.equals(x)) {
			   driver.switchTo().window(x);
		   }
	   }
}
public void quit() {
	 driver.quit();
}
public void backward() {
	  driver.navigate().back();
}
}
