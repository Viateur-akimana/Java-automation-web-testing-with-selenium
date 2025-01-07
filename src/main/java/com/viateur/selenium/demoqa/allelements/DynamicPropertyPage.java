package com.viateur.selenium.demoqa.allelements;

import org.openqa.selenium.By;

import static utilities.DynamicWaitUtility.explicitWait;

public class DynamicPropertyPage extends ElementsPage{
    private By wait=By.id("visibleAfter");

    public String getTextAfterClick(){
        explicitWait(5,wait);
        String text = find(wait).getText();
        return text;
    }
}
