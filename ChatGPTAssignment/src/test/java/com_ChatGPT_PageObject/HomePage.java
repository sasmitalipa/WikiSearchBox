package com_ChatGPT_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		
		WebDriver driver = null;

		public HomePage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);	
	}

	@FindBy(id = "js-link-box-en")
	WebElement languageEnglish;
	
	public void selectEnglish() {
		languageEnglish.click();
	}
		
		
}
