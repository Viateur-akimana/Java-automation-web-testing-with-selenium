package com.viateur.selenium.demoqa.modals;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertFramesWindows{

    private final By headingTextInFrame = By.id("sampleHeading");
    private final String largeFrameIdentifier = "frame1";
    private final By pageHeaderFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private final By smallFrameLocator = By.xpath("//div[@id='frame2Wrapper']/iframe");

    public String getPageHeaderText() {
        return find(pageHeaderFramesText).getText();
    }

    private void switchToLargeFrame() {
        switchToFrameString(largeFrameIdentifier);
    }

    private void switchToSmallFrame() {
        switchToFrameElement(find(smallFrameLocator));
    }
    public String getTextFromLargeFrame() {
        switchToLargeFrame();
        String largeFrameText = find(headingTextInFrame).getText();
        System.out.println("Large Frame Text: " + largeFrameText);
        switchToDefaultContent();
        return largeFrameText;
    }

    public String getTextFromSmallFrame() {
        switchToSmallFrame();
        String smallFrameText = find(headingTextInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
