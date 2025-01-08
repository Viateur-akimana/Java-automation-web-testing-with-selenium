package com.viateur.selenium.demoqa.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SliderPage extends WidgetsPage{
    private By slider = By.xpath("//div[@id=\"sliderContainer\"]//input[@type=\"range\"]");
    private By sliderValue=By.id("sliderValue");

    public void moveSlider(int x, int y){
        Actions act=new Actions(webDriver);
        act.dragAndDropBy(find(slider),x,y).perform();
    }
    public String getSliderValue(){
        return find(sliderValue).getText();
    }
}
