package com.ChatGPT_TestCases;


import org.testng.annotations.Test;

import com_ChatGPT_PageObject.HomePage;

public class TC_HomePage extends BaseClass {
	
	@Test
	public void selectEnglish() {
		driver.get(baseURL);
		HomePage hp = new HomePage(driver);
		hp.selectEnglish();
	}

}
