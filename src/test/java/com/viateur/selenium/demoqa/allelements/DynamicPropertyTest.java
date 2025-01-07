package com.viateur.selenium.demoqa.allelements;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicPropertyTest extends BaseTest {

    @Test
    public void testDynamicWait(){
        var dynamicPage=homePage.scrollToTheElements().clickToDynamicPropertiesPage();
        String actualText = dynamicPage.getTextAfterClick();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText,expectedText,"\n The text visible are not the same\n");
    }
    @Test
    public void testProgressBar(){
        var progressPage = homePage.goToWidgets().goToProgressBar();
        progressPage.clickTheStartButton();
        String actualResult = progressPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualResult,expectedValue,"\n the actual and expected value doesnot match\n");
    }
}
