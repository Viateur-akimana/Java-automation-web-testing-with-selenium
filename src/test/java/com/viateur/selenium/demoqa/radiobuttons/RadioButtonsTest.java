package com.viateur.selenium.demoqa.radiobuttons;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTest extends BaseTest {


    @Test
    public void testClickRadioButton(){
        var formsPage = homePage.scrollTOTheForms().goToPractiseForm();
        formsPage.scrollAndClickFemaleButton();
        var isFemaleRadioButtonSelected = formsPage.isFemalRadioButtonSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected,"\n Female radio button is not selected \n");
    }

}
