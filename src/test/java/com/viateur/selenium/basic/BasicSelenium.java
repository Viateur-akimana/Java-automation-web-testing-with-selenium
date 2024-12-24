package com.viateur.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicSelenium {
    WebDriver webDriver;

    @BeforeClass
    public void setup(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterClass
    public void teardown(){
        webDriver.quit();
    }
    @Test
    public void testingLoginIntoApplication(){
        WebElement username= webDriver.findElement(By.name("username"));
        username.sendKeys("Admin");

        var password = webDriver.findElement(By.name("password"));
        password.sendKeys("admin123");

        webDriver.findElement(By.tagName("button")).click();

        String actualResult=webDriver.findElement(By.tagName("h6")).getText();
        String expectedResult="Dashboard";
        Assert.assertEquals(actualResult,expectedResult);
    }
}
