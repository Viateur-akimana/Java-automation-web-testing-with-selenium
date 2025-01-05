package com.viateur.selenium.pageobjectmodel;

import com.viateur.selenium.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testGetErrorMessages(){
        LoginPage.setUsernameForm("standard_user");
        LoginPage.setUsernameForm("afsdfdsa");
        LoginPage.clickLoginButton();
        String actualMessage=LoginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));

    }
}
