package step_definitions;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import utils.ConfigManager;

public class ClubPageSteps extends BaseStep{

    @Then("the user should see the user name on clubs page")
    public void theUserShouldSeeTheUserNameOnClubsPage() {
        Assertions.assertThat(PAGES.getClubsPage().getNameText()).isEqualTo(ConfigManager.getProperty("username"));
    }
}
