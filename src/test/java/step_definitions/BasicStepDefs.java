package step_definitions;

import io.cucumber.java.en.Given;
import utils.ConfigManager;

public class BasicStepDefs extends BaseStep{
    @Given("The user is on homepage")
    public void theUserIsOnHomepage() {
        DRIVER.get(ConfigManager.getProperty("baseUrl"));
    }
}
