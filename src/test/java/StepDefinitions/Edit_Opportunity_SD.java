package StepDefinitions;

import Common.SelFunction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Edit_Opportunity_SD {
    SelFunction sf = new SelFunction();

    @Given("^TSR login to salesforce$")
    public void tsr_login_to_salesforce() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sf.openBrowser();
        sf.openSalesforce();
        sf.isSFloginsectionDisplayed();

    }

    @Given("^Open an opportunity from Unassigned Oppty listview$")
    public void open_an_opportunity_from_Unassigned_Oppty_listview() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^TSR assign an opportunity to himself$")
    public void tsr_assign_an_opportunity_to_himself() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^save the opportunity with closed won stage$")
    public void save_the_opportunity_with_closed_won_stage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Opportunity should get saved with closed won status$")
    public void opportunity_should_get_saved_with_closed_won_status() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        sf.teardown();
    }
}
