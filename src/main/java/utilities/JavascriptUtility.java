package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptUtility extends Utility {


    public static void scrollToElements(By Locator){
        WebElement element = webDriver.findElement(Locator);
        JavascriptExecutor  js = (JavascriptExecutor) webDriver;
        String scripts="arguments[0].scrollIntoView();";
        js.executeScript(scripts,element);
    }
    public static void clickButton(By Locator){
        WebElement element = webDriver.findElement(Locator);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        String scripts ="arguments[0].click();";
        js.executeScript(scripts,element);
    }

}
