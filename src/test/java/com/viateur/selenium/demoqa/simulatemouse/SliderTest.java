package com.viateur.selenium.demoqa.simulatemouse;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testInteraction(){
        int x=180;
        int y=0;
        var sliderPage=homePage.goToWidgets().clickToSlider();
         sliderPage.moveSlider(x,y);
         String value = sliderPage.getSliderValue();
         String expectedValue="79";
        Assert.assertEquals(value,expectedValue,"\n The values do not match\n");
    }
}
