package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.manager.SeleniumManager;


public class BaseTest {

	protected WebDriver driver;
	By ENEUR = By.xpath("//*[contains(@class, 'flex') and contains(@class, 'justify-end') and contains(@class, 'min-w-[92px]') and contains(@class, 'items-center') and contains(@class, 'gap-x-2.5')]");
	
    @BeforeClass
    public void setUp() {
        //WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
    }
	
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
