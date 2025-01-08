package com.viateur.selenium.demoqa.simulateKeyboard;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class KeyboardTest extends BaseTest {

    @Test
    public void testSimulatingKeyboard(){
        var keyboardPage= homePage.scrollToTheElements().goToKeyboard();
        keyboardPage.setFullName("Viateur AKIMANA");
        keyboardPage.setEmail("akimanaviateur@gmail.com");
        keyboardPage.setCurrentAddress("gym 250");
        keyboardPage.clickSubmitButton();
        String actualAddress = keyboardPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("gym"),"\n The address should contain the gym text\n");

    }
}
