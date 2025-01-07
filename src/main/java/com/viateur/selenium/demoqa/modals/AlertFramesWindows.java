package com.viateur.selenium.demoqa.modals;

import com.viateur.selenium.BasePage;
import com.viateur.selenium.demoqa.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElements;

public class AlertFramesWindows extends HomePage {
      private By modal=By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
      private By frames = By.xpath("//li[@id='item-2']/span[text()='Frames']");
      private By alerts = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
      private By windows = By.xpath("//li[@id=\"item-0\"]//span[text()=\"Browser Windows\"]");

      public ModalPage goToModalPage(){
          scrollToElements(modal);
          click(modal);
          return new ModalPage();
      }

      public FramesPage clickToFramePage(){
          scrollToElements(frames);
          click(frames);
          return new FramesPage();
      }
      public AlertsPage goToAlertsPage(){
       scrollToElements(alerts);
       click(alerts);
       return new AlertsPage();
      }
      public WindowsPage scrollToWindows(){
          scrollToElements(windows);
          click(windows);
          return new WindowsPage();
      }
}
