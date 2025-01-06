package com.viateur.selenium.demoqa.dropdownselect;

import com.viateur.selenium.demoqa.BaseTest;
import org.testng.annotations.Test;

public class DropDownSelectOptions extends BaseTest {

    @Test
    public void testSelectingTheOptions(){
        var selectMenuPage = homePage.goToWidgets().goToSelectMenu();
        selectMenuPage.selectMultiOptions("Volvo");
        selectMenuPage.selectMultiOptions(1);
    }
}
