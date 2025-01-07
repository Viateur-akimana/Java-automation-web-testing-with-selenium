package com.viateur.selenium.demoqa.widgets;

import com.viateur.selenium.demoqa.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class WidgetsPage extends HomePage {
    private By selectMenu=By.xpath("//li[@id=\"item-8\"]//span[text()=\"Select Menu\"]");
    private By date = By.xpath("//li[@id=\"item-2\"]//span[text()=\"Date Picker\"]");
    private By progress=By.xpath("//li[@id=\"item-4\"]//span[text()=\"Progress Bar\"]");
    public SelectMenuPage goToSelectMenu(){
        scrollToElements(selectMenu);
        click(selectMenu);
        return new SelectMenuPage();
    }
    public DatePage goToDatePage(){
        scrollToElements(date);
        click(date);
        return new DatePage();
    }
    public ProgressiveBarPage goToProgressBar(){
        scrollToElements(progress);
        click(progress);
        return new ProgressiveBarPage();
    }
}
