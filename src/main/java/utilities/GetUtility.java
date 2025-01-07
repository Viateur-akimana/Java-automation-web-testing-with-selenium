package utilities;


import java.util.Set;

public class GetUtility extends Utility{
    public static String getWindowHandle() {
        return webDriver.getWindowHandle();
    }
    public static Set<String> getWindowHandles(){
        return webDriver.getWindowHandles();
    }
    public static String getUrl(){
        return webDriver.getCurrentUrl();
    }

}
