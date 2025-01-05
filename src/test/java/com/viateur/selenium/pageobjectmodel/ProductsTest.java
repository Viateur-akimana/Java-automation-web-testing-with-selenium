package com.viateur.selenium.pageobjectmodel;

import com.viateur.selenium.saucedemo.pages.LoginPage;
import com.viateur.selenium.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{

    @Test
    public void testIsProductHeaderDisplayed(){
        ProductsPage productsPage= LoginPage.logIntoApplication("standard_user","secret_sauce");
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(),"\n Header is not displayed \n ");
    }
}
