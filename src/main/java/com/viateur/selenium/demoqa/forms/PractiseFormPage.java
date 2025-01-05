package com.viateur.selenium.demoqa.forms;

import org.openqa.selenium.By;

import static utilities.JavascriptUtility.clickButton;
import static utilities.JavascriptUtility.scrollToElements;

public class PractiseFormPage extends FormsPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    public void scrollAndClickFemaleButton(){
        scrollToElements(femaleRadioButton);
        clickButton(femaleRadioButton);
    }
    public boolean isFemalRadioButtonSelected(){
        return find(femaleRadioButton).isSelected();
    }
}
