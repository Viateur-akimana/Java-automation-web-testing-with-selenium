package com.viateur.selenium.demoqa.windows;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getUrl;

public class WindowsTest extends BaseTest {

    @Test
    public void testWindows(){
        var windows=homePage.goToFramesPage().scrollToWindows();
        windows.clickNewWindow();
        windows.switchToNewWindow();
        String actualUrl=getUrl();
        String expectedUrl = "https://demoqa.com/sample";
        Assert.assertEquals(actualUrl,expectedUrl,"\n The actual and expected url are not the same\n");

    }
}
