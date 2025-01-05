package com.viateur.selenium.saucedemo.pages;

import com.viateur.selenium.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static By usernameForm=By.id("user-name");
    private static By passwordForm=By.id("password");
    private static By loginButtonForm=By.id("login-button");
    private static By errorMessages=By.cssSelector("#login_button_container h3");


    public static void setUsernameForm(String username) {
        set(usernameForm, username);
    }
    public static void setPasswordForm(String password) {
        set(passwordForm,password);
    }
    public static ProductsPage clickLoginButton(){
        click(loginButtonForm);
        return new ProductsPage();
    }
    public static ProductsPage logIntoApplication(String username, String password){
        setUsernameForm(username);
        setPasswordForm(password);
        return clickLoginButton();
    }

    public static String getErrorMessage(){
        return find(errorMessages).getText();
    }
}
