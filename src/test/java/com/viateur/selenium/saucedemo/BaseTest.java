package com.viateur.selenium.saucedemo;

import com.viateur.selenium.BasePage;
import com.viateur.selenium.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver webDriver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    String url="https://saucedemo.com";

    @BeforeClass
    public void setup(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        basePage = new BasePage();
        basePage.setWebDriver(webDriver);
    }
    @AfterClass
    public void teardown(){
      webDriver.quit();
    }
}
