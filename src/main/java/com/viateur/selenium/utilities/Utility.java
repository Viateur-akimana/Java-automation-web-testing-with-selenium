package com.viateur.selenium.utilities;

import com.viateur.selenium.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {
    public static WebDriver webDriver;


    public static void setUtilityDriver(){
        webDriver = BasePage.webDriver;
    }
}
