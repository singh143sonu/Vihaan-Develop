package StepDefinitions;

import Common.SelFunction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sandeep on 7/12/2017.
 */
public class GitHubLoginSD {
    SelFunction sf = new SelFunction();

    @Given("^user is on github homepage$")
    public void user_is_on_github_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sf.openBrowser();
        sf.openGithub();
        sf.ishomepageDisplayed();
    }

    @When("^user clicks on Sign in button$")
    public void user_clicks_on_Sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sf.clickSigninLink();
    }

    @Then("^user is displayed login screen$")
    public void user_is_displayed_login_screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sf.isloginsectionDisplayed();
        sf.teardown();
    }
}
