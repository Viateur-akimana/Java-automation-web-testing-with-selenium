package com.viateur.selenium.demoqa.forms;

import org.openqa.selenium.By;

import static utilities.JavascriptUtility.clickButton;
import static utilities.JavascriptUtility.scrollToElements;

public class PractiseFormPage extends FormsPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox=By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox=By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox=By.id("hobbies-checkbox-3");
    public void scrollAndClickFemaleButton(){
        scrollToElements(femaleRadioButton);
        clickButton(femaleRadioButton);
    }
    public boolean isFemalRadioButtonSelected(){
        return find(femaleRadioButton).isSelected();
    }
    public void clickSportsCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElements(sportsHobbyCheckbox);
            clickButton(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElements(readingHobbyCheckbox);
            clickButton(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElements(musicHobbyCheckbox);
            clickButton(musicHobbyCheckbox);
        }
    }
    public void unclickReadingCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElements(readingHobbyCheckbox);
            clickButton(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }
}
