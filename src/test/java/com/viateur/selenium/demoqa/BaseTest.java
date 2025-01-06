package com.viateur.selenium.demoqa;

import com.viateur.selenium.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.io.FileHandler;
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

    @AfterMethod
    public void takeFailedResultScreenshoot(ITestResult testResult){

        if (ITestResult.FAILURE == testResult.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot) webDriver;
                File source = screenshot.getScreenshotAs(OutputType.FILE);
                File destination = new File(
                        System.getProperty("user.dir") +
                                "/resources/screenshots/" +
                                LocalDate.now() + "_" +
                                testResult.getName() +
                                ".png"
                );

                destination.getParentFile().mkdirs();

                FileHandler.copy(source, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public void tearDown(){
        delay(4000);
        webDriver.quit();
    }
}
