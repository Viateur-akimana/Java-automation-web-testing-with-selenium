package com.viateur.selenium.demoqa.allelements;

import com.viateur.selenium.demoqa.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class ElementsPage extends HomePage {
    private By webTables = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By dynamicProperties = By.xpath("//li[@id=\"item-8\"]/span[text()=\"Dynamic Properties\"]");
    private By keyboard=By.xpath("//li[@id='item-0']/span[text()='Text Box']");

    public DynamicPropertyPage clickToDynamicPropertiesPage(){
        scrollToElements(dynamicProperties);
        click(dynamicProperties);
        return new DynamicPropertyPage();
    }
    public TablePage goToTables(){
        scrollToElements(webTables);
        click(webTables);
        return new TablePage();
    }
    public KeyboardPage goToKeyboard(){
        scrollToElements(keyboard);
        click(keyboard);
        return new KeyboardPage();
    }
}
