package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import utils.Pages;

public class OsmLoginPageSteps extends BaseStep{
    @When("the user enters the valid username")
    public void theUserEntersTheValidUsername() {
        PAGES.getLoginPage().enterUserName();
    }

    @And("the user enters the valid password")
    public void theUserEntersTheValidPassword() {
        PAGES.getLoginPage().enterPassword();
    }

    @And("the user clicks on Login button")
    public void theUserClicksOnLoginButton() {
        PAGES.getLoginPage().clickOnLoginButton();
    }
}
