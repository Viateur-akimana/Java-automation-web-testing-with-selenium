package com.viateur.selenium.demoqa.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;

public class DatePage extends WidgetsPage{
    private By dateField = By.id("datePickerMonthYearInput");
    private By monthSelect = By.className("react-datepicker__month-select");
    private By yearSelect = By.cssSelector(".react-datepicker__year-select");
    public void selectDate(){
        click(dateField);
    }
    public String getDate(){
        return find(dateField).getAttribute("value");
    } private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day) {
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day) {
        return find(dayValue(day)).isDisplayed();
    }

    public void clickSelectDate() {
        click(dateField);
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthSelect, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearSelect, year);
    }

}
