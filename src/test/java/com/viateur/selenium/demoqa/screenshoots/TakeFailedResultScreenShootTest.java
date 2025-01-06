package com.viateur.selenium.demoqa.screenshoots;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.annotations.Test;

public class TakeFailedResultScreenShootTest extends BaseTest {
    @Test
    public void testSubmitButtonWithoutUsingJavascriptExecutor(){
        var practisePage = homePage.scrollTOTheForms().goToPractiseForm();
        practisePage.clickSubmit();
    }
}
