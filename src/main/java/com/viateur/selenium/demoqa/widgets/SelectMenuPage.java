package com.viateur.selenium.demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.DropDownUtility.selectByIndex;
import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavascriptUtility.scrollToElements;

public class SelectMenuPage extends WidgetsPage{
    private By multiSelect = By.id("cars");
    public void selectMultiOptions(String text){
        scrollToElements(multiSelect);
        selectByVisibleText(multiSelect,text);
    }
    public void selectMultiOptions(int index){
        scrollToElements(multiSelect);
        selectByIndex(multiSelect,index);
    }


}
