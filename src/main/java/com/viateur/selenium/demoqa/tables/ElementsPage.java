package com.viateur.selenium.demoqa.tables;

import com.viateur.selenium.demoqa.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class ElementsPage extends HomePage {
    private By webTables = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    public TablePage goToTables(){
        scrollToElements(webTables);
        click(webTables);
        return new TablePage();
    }
}
