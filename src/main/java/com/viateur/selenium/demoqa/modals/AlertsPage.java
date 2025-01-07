package com.viateur.selenium.demoqa.modals;

import org.openqa.selenium.By;

public class AlertsPage extends AlertFramesWindows{
    private By informationAlert = By.id("alertButton");
    private By confirmationAlert = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promptAlert= By.id("promtButton");
    private By promptResult = By.id("promptResult");

    public String getPromptAlertResult() {
        return find(promptResult).getText();
    }

    public void clickPromptAlertButton() {
        click(promptAlert);
    }

    public void clickInformationAlertButton() {
        click(informationAlert);
    }

    public void clickConfirmationAlertButton() {
        click(confirmationAlert);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }
}
