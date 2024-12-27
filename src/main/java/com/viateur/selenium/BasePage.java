package com.viateur.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver webDriver;

    public void setWebDriver(WebDriver webDriver) {
        BasePage.webDriver = webDriver;
    }
    protected static WebElement find(By Locator){
        return webDriver.findElement(Locator);
    }

    protected static void set(By Locator, String text){
        find(Locator).clear();
        find(Locator).sendKeys(text);
    }

    protected static void click(By Locator){
        find(Locator).click();
    }

}
