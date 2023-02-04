package com.ChatGPT_TestCases;

import org.testng.annotations.Test;

import com_ChatGPT_PageObject.HomePage;
import com_ChatGPT_PageObject.WikiSearchResult_Page;
import com_ChatGPT_PageObject.WikiWelcomePage;

public class TC_ChatGPT extends BaseClass {
	@Test
	public void findCEO () throws InterruptedException {
		driver.get(baseURL);
		driver.manage().window().maximize(); // can also be handled through ChromeOptions
		HomePage hp = new HomePage(driver);
		hp.selectEnglish();
		System.out.println("English got selected");
		WikiWelcomePage wc = new WikiWelcomePage(driver);
		wc.searchText("ChatGPT");
		System.out.println("ChatGPT got entered in search bar");
		WikiSearchResult_Page sr = new WikiSearchResult_Page(driver);
		System.out.println("OpenAI CEO: "+sr.getText());
		
}
}
