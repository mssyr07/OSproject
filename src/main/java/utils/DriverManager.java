package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Locale;

public class DriverManager {

    private final static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    private DriverManager(){
        throw new UnsupportedOperationException();
    }

    public synchronized static WebDriver getWebDriver(){
        String browserType = ConfigManager.getProperty("browser").toLowerCase(Locale.ROOT);

        WebDriver driver;

        if(drivers.get() == null){
            switch (browserType){
                case "edge" -> {
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    driver = new EdgeDriver(edgeOptions);
                }

                case "firefox" -> {
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--width-1920");
                    firefoxOptions.addArguments("--height-1080");
                    driver = new FirefoxDriver(firefoxOptions);
                }

                default -> {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    driver = new ChromeDriver(chromeOptions);
                }
            }

            drivers.set(driver);
        }

        return drivers.get();
    }

    public static void closeDriver(){
        WebDriver driver = getWebDriver();
        if(driver != null){
            driver.quit();
            drivers.remove();
        }
    }
}
