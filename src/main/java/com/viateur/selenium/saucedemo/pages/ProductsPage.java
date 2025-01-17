package com.viateur.selenium.saucedemo.pages;

import com.viateur.selenium.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
    private By productHeader=By.xpath("//span[text()='Products']");

    public boolean isProductHeaderDisplayed(){
        return find(productHeader).isDisplayed();
    }
}
