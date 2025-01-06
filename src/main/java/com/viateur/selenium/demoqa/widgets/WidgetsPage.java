package com.viateur.selenium.demoqa.widgets;

import com.viateur.selenium.demoqa.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class WidgetsPage extends HomePage {
    private By selectMenu=By.xpath("//li[@id=\"item-8\"]//span[text()=\"Select Menu\"]");
    public SelectMenuPage goToSelectMenu(){
        scrollToElements(selectMenu);
        click(selectMenu);
        return new SelectMenuPage();
    }
}
