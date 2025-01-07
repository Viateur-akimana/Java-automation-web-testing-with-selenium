package com.viateur.selenium.demoqa.modals;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ModalTest extends BaseTest {

    @Test
    public void testModal(){
        var modalPage=homePage.goToFramesPage().goToModalPage();
        modalPage.clickSmallModalButton();
        String smallModalText = modalPage.getSmallModalText();
        Assert.assertTrue(smallModalText.contains("small modal"));
        modalPage.clickCloseButton();
    }

}
