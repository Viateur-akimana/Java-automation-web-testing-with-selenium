package com.viateur.selenium.demoqa.modals;

import org.openqa.selenium.By;

public class ModalPage extends AlertFramesWindows{
    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(smallModalText).getText();
    }

    public void clickCloseButton() {
        click(closeButton);
    }
}
