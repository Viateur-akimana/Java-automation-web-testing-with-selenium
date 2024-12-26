package com.viateur.selenium.pages;

import com.viateur.selenium.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameForm=By.id("user-name");
    private By passwordForm=By.id("password");
    private By loginButtonForm=By.id("login-button");
    private By errorMessages=By.xpath("#login_button_container h3");


    public void setUsernameForm(String username) {
        set(usernameForm, username);
    }
    public void setPasswordForm(String password) {
        set(passwordForm,password);
    }
    public ProductsPage clickLoginButton(){
        click(loginButtonForm);
        return new ProductsPage();
    }
    public ProductsPage logIntoApplication(String username, String password){
        setUsernameForm(username);
        setPasswordForm(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        return find(errorMessages).getText();
    }
}
