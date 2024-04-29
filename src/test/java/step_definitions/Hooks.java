package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.ConfigManager;
import utils.DriverManager;

public class Hooks {

    public static final Logger LOGGER = LogManager.getLogger(Hooks.class);

    public static Scenario scenario;

    /**
     * This method is executed before each scenario. It sets up the test environment,
     * initializes the browser, and maximizes the window.
     * @param scenario the Cucumber scenario object
     */
    @Before
    public void setup(Scenario scenario) {
        LOGGER.info("---------------Test Automation has started------------");
        LOGGER.info("Test Scenario : " + scenario.getName());
        LOGGER.info("Browser type ----> " + ConfigManager.getProperty("browser"));
        DriverManager.getWebDriver();

    }

    /**
     * This method is executed after each scenario. It performs necessary actions based on
     * the scenario result, such as taking a screenshot on failure, logging the failure
     * details, and handling test retries for failed scenarios.
     * @param scenario the Cucumber scenario object
     */
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

            LOGGER.error("Test scenario ->>> ->>>>> Failed " + scenario.getName());
        }
        else {
            LOGGER.info("Test scenario -->>> ->>>> Passed");
        }
        DriverManager.closeDriver();
    }

}
