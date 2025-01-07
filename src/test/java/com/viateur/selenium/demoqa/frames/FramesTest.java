package com.viateur.selenium.demoqa.frames;

import com.viateur.selenium.demoqa.BaseTest;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FramesTest extends BaseTest {

    @Test
    public void testLargeFrameText() {
        var framePage = homePage.goToFramesPage().clickToFramePage();

        // Verify text inside the large frame
        String actualLargeFrameText = framePage.getTextFromLargeFrame();
        String expectedLargeFrameText = "This is a sample page";
        Assert.assertEquals(actualLargeFrameText, expectedLargeFrameText,
                "\nMismatch: The text in the large frame does not match the expected value.\n");

        // Verify the header text of the Frames page
        String actualPageHeaderText = framePage.getPageHeaderText();
        String expectedPageHeaderText = "Frames";
        Assert.assertEquals(actualPageHeaderText, expectedPageHeaderText,
                "\nMismatch: The header text on the Frames page does not match the expected value.\n");
    }

    @Test
    public void testSmallFrameText() {
        var framesPage = homePage.goToFramesPage().clickToFramePage();

        // Verify text inside the small frame
        String actualSmallFrameText = framesPage.getTextFromSmallFrame();
        String expectedSmallFrameText = "This is a sample page";
        Assert.assertEquals(actualSmallFrameText, expectedSmallFrameText,
                "\nMismatch: The text in the small frame does not match the expected value.\n");

        // Verify the header text of the Frames page
        String actualPageHeaderText = framesPage.getPageHeaderText();
        String expectedPageHeaderText = "Frames";
        Assert.assertEquals(actualPageHeaderText, expectedPageHeaderText,
                "\nMismatch: The header text on the Frames page does not match the expected value.\n");
    }

}
