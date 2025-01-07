package com.viateur.selenium.demoqa.modals;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.GetUtility.getWindowHandle;
import static utilities.GetUtility.getWindowHandles;
import static utilities.SwitchToUtility.switchToWindow;

public class WindowsPage extends AlertFramesWindows{
    private By windows= By.id("windowButton");

    public void clickNewWindow(){
        click(windows);
    }
    public void switchToNewWindow(){
        //Get the current main window handle
        //Get all the window handles
        //Switch to the new window
               //1
        String currentWindow = getWindowHandle();
               //2
        Set<String> windowHandles=getWindowHandles();
        for (String handle:windowHandles){
            if (currentWindow.equals(handle)){
                System.out.println("Window"+handle);
            }else {
                switchToWindow(handle);
            }
        }
    }
}
