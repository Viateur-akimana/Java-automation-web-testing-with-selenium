package com.viateur.selenium.demoqa.widgets;

import org.openqa.selenium.By;

import static utilities.DynamicWaitUtility.fluentWait;


public class ProgressiveBarPage extends WidgetsPage{
     private By start = By.id("startStopButton");
    private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public String getProgressValue() {
        fluentWait(30, progressValue);
        return find(progressValue).getText();
    }

     public void clickTheStartButton(){
         click(start);
     }
}
