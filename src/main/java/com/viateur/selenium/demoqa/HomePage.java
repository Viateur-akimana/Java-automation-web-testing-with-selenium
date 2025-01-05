package com.viateur.selenium.demoqa;

import com.viateur.selenium.BasePage;
import com.viateur.selenium.demoqa.forms.FormsPage;
import org.openqa.selenium.By;

import static com.viateur.selenium.utilities.JavascriptUtility.scrollToElements;

public class HomePage extends BasePage {
    private By formClick = By.xpath("//div[@id='app']//h5[text()= \"Forms\"]");
    public FormsPage scrollTOTheForms(){
        scrollToElements(formClick);
        click(formClick);
        return new FormsPage();
    }
}
