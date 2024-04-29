package step_definitions;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import utils.Pages;

public abstract class BaseStep {

    protected final WebDriver DRIVER;

    protected final Pages PAGES;

    public BaseStep() {
        DRIVER = DriverManager.getWebDriver();

        PAGES = new Pages();
    }
}
