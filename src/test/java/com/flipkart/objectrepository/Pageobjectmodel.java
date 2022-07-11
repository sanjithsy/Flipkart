package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class Pageobjectmodel extends Commonactions{
	
	public Pageobjectmodel() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getCloseicon() {
		return closeicon;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getRedmi() {
		return redmi;
	}

	public WebElement getScrolld() {
		return scrolld;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getOrder() {
		return order;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getDelivery() {
		return delivery;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getDown() {
		return down;
	}

	public WebElement getCash() {
		return cash;
	}

	public WebElement getRemove() {
		return remove;
	}

	@FindBy(xpath="//button[text()='✕']")
		private WebElement closeicon;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchbar;
	
	@FindBy(xpath="(//div[contains(text(),'REDMI 9i Sport')])[1]")
	private WebElement redmi;
	
	@FindBy(xpath="//span[text()='View 4 more offers']")
	private WebElement scrolld;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement pin;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement cart;
	
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement order;

	@FindBy(xpath="//input[@maxlength='auto']")
	private WebElement login;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement conti;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement log;
	
	@FindBy(xpath="(//div[@class='_2jIO64'])[2]")
	private WebElement select;
	
	@FindBy(xpath="//button[text()='Deliver Here']")
	private WebElement delivery;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement con;
	
	@FindBy(xpath="//button[text()='Accept & Continue']")
	private WebElement accept;
	
	@FindBy(xpath="//span[text()='Not applicable ']")
	private WebElement down;
	
	@FindBy(xpath="//div[text()='Cash on Delivery']")
	private WebElement cash;
	
	@FindBy(xpath="//div[text()='Remove']")
	private WebElement remove;
}
