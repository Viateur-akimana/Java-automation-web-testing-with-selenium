package com.viateur.selenium.demoqa.checkBox;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox(){
        var formsPage= homePage.scrollTOTheForms().goToPractiseForm();

        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected,"\n The checkbox for reading is selected \n");
    }
}
