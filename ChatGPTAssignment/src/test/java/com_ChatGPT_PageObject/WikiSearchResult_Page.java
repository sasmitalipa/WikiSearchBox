package com_ChatGPT_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchResult_Page {
	WebDriver driver = null;

	public WikiSearchResult_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath= "//*[@id='mw-content-text']//div[contains(text(),'OpenAI CEO ')]/a" )
	WebElement textElement;
	
	 public String getText() {
		 
		return textElement.getText();
	 }
	
	
	
	
	
}
