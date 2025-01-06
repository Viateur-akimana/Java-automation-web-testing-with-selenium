package com.viateur.selenium.demoqa;

import com.viateur.selenium.BasePage;
import com.viateur.selenium.demoqa.forms.FormsPage;
import com.viateur.selenium.demoqa.tables.ElementsPage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class HomePage extends BasePage {
    private By formClick = By.xpath("//div[@id='app']//h5[text()= \"Forms\"]");
    private By elements = By.xpath("//div[@id='app']//h5[text()='Elements']");
    public FormsPage scrollTOTheForms(){
        scrollToElements(formClick);
        click(formClick);
        return new FormsPage();
    }
    public ElementsPage scrollToTheElements(){
        scrollToElements(elements);
        click(elements);
        return new ElementsPage();
    }
}
