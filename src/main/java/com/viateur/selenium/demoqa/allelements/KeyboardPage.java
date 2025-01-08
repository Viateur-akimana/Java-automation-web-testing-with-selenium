package com.viateur.selenium.demoqa.allelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.DynamicWaitUtility.explicitWait;
import static utilities.JavascriptUtility.scrollToElements;
import static utilities.KeysUtility.sendKeys;

public class KeyboardPage extends ElementsPage{
    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult =By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress() {
        explicitWait(5, currentAddressResult);
        return find(currentAddressResult).getText();
    }

    public void clickSubmitButton() {
        scrollToElements(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress(String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void setFullName(String name) {
        delay(1000);
        scrollToElements(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));

    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }
}
