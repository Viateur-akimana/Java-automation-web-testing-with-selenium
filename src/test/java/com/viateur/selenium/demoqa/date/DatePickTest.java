package com.viateur.selenium.demoqa.date;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickTest extends BaseTest {

    @Test
    public void testPickingDate(){
        String month = "January";
        String monthNumber = "01";
        String day = "21";
        String year = "2025";
        var datePage = homePage.goToWidgets().goToDatePage();
        datePage.clickSelectDate();
        datePage.selectMonth(month);
        datePage.selectYear(year);
        datePage.clickDay(day);
        String actualDate=datePage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate,expectedDate,"\n actual and expected dates are not the same \n");

    }
}
