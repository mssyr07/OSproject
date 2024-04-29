package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

    private static Actions actions;
    public static void wait(int second){
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void wait(double second){
        try {
            Thread.sleep((long) (second * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void scrollDown(){
        actions = new Actions(DriverManager.getWebDriver());
        actions.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN);
    }

    public static void scrollUp(){
        actions = new Actions(DriverManager.getWebDriver());
        actions.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP);
    }
}
