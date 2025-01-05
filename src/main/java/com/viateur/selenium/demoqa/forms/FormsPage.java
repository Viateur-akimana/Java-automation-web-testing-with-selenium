package com.viateur.selenium.demoqa.forms;

import com.viateur.selenium.demoqa.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class FormsPage extends HomePage {
    private By menuForm = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
    public PractiseFormPage goToPractiseForm(){
        scrollToElements(menuForm);
        click(menuForm);
        return new PractiseFormPage();
    }
}
