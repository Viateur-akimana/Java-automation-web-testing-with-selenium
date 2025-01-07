package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicWaitUtility extends Utility{
    public static void explicitWait(int seconds, By locator){
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void fluentWait(int seconds,By locator){
        FluentWait wait = new FluentWait(webDriver)
                .withTimeout(Duration.ofSeconds(seconds))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class,
                        StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
