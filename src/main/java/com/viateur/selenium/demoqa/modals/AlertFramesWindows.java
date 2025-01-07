package com.viateur.selenium.demoqa.modals;

import com.viateur.selenium.demoqa.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class AlertFramesWindows extends HomePage {
      private By modal=By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");

      public ModalPage goToModalPage(){
          scrollToElements(modal);
          click(modal);
          return new ModalPage();
      }
}
