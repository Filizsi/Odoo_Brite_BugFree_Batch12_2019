package com.Odoo.step_definitions;

import com.Odoo.Pages.EventsCategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EventsCategoriesStepDefinitions {
    EventsCategoriesPage eventsCategoriesPage = new EventsCategoriesPage();

    @Given("user logs in as events manager")
    public void user_logs_in_as_events_manager() {

    }
    @Then("user is on the Event Categories page")
    public void user_is_on_the_Event_Categories_page() {
        eventsCategoriesPage.eventCategories.click();
    }
    @Then("user clicks on {string}")
    public void user_clicks_on(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks on create button")
    public void user_clicks_on_create_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user creates an event called {string} under Event Category")
    public void user_creates_an_event_called_under_Event_Category(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user chooses Location as {string} under {string}")
    public void user_chooses_Location_as_under(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks on {string} under {string}")
    public void user_clicks_on_under(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user picks {string} under {string}")
    public void user_picks_under(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks {string} under {string}")
    public void user_clicks_under(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user verifies that event is created")
    public void user_verifies_that_event_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }



}