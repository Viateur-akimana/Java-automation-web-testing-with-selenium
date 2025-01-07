package com.viateur.selenium.demoqa.allelements;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {


    @Test
    public void testEditOnWebTable(){
        String email="kierra@example.com";
        String expectedAge="5";
        var webTable=homePage.scrollToTheElements().goToTables();
        webTable.clickEdit(email);
        webTable.setAge("5");
        webTable.clickSubmitButton();
        String actualAge=webTable.getTableAge(email);
        Assert.assertEquals(actualAge,expectedAge,"\n The ages doesnot match \n");

    }
}
