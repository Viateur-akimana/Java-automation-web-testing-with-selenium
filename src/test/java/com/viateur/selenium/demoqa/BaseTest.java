package com.viateur.selenium.demoqa;

import com.viateur.selenium.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.Utility.setUtilityDriver;
import static com.viateur.selenium.BasePage.delay;

public class BaseTest {

    protected WebDriver webDriver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String Demoqa_url="https://demoqa.com";

    @BeforeClass
    public void setup(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }
    @BeforeMethod
    public void loadApplication(){
        webDriver.get(Demoqa_url);
        basePage=new BasePage();
        basePage.setWebDriver(webDriver);
        setUtilityDriver();
        homePage=new HomePage();
    }

    @AfterClass
    public void tearDown(){
        delay(4000);
//        webDriver.quit();
    }
}
