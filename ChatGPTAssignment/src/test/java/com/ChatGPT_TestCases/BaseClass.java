package com.ChatGPT_TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	

	public String baseURL ="https://www.wikipedia.org/";
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser" )
	@BeforeClass
	public void setup(@Optional("chrome") String br) {
		
		if (br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		logger = LogManager.getLogger("BaseClass.class");
		//PropertyConfigurator.configure("./log4j2.properties");
		}
	}
	
	@AfterClass
	public void tearDown() {
	//	driver.quit();
	}
	
}
