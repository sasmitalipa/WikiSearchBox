package com_ChatGPT_PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiWelcomePage {

	WebDriver driver = null;

	public WikiWelcomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath= "//*[@id='searchform']/div//input")
	WebElement searchBox;
	
	public void searchText(String text) throws InterruptedException {
		
		searchBox.sendKeys(text);
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.RETURN);
	}

	

}
