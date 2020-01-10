package com.Odoo.step_definitions;

import com.Odoo.pages.CreateEventsPage;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class CreateAnEventStepDefinitions {
    CreateEventsPage createEventsPage = new CreateEventsPage();

    @Then("user logs in as events manager")
    public void userLogsInAsEventsManager() {
        String username = ConfigurationReader.getProperty("eventsusername");
        String password = ConfigurationReader.getProperty("eventspassword");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("user navigates to {string} module")
    public void userNavigatesToModule(String module) {
        BrowserUtils.waitForClickablility(createEventsPage.eventModule, 2);
        createEventsPage.eventModule.click();


    }

    @Then("user clicks on create button")
    public void userClicksOnCreateButton() {
        BrowserUtils.waitForClickablility(createEventsPage.createButton, 2);
        createEventsPage.createButton.click();
    }

    @And("user enters events name as{string}")
    public void userEntersEventsNameAs(String name) {
        BrowserUtils.waitForClickablility(createEventsPage.eventsName,2);
        createEventsPage.eventsName.sendKeys(name);

    }

    @Then("user click on Organize button then Create and Edit button")
    public void userClickOnOrganizeButtonThenCreateAndEditButton() {
        createEventsPage.organizer.click();
        BrowserUtils.waitForClickablility(createEventsPage.createAnOrganizerLink,2);
        createEventsPage.createAnOrganizerLink.click();
        BrowserUtils.wait(2);
    }

    @Then("user enters the organizer name as {string}then clicks save button")
    public void userEntersTheOrganizerNameAsThenClicksSaveButton(String organizerName) {
        BrowserUtils.waitForVisibility(createEventsPage.organizerName,3);
        createEventsPage.organizerName.sendKeys(organizerName);
        BrowserUtils.waitForClickablility(createEventsPage.organizerSaveButton,3);
        createEventsPage.organizerSaveButton.click();
    }

    @Then("user clicks on  location button then Create and Edit button")
    public void userClicksOnLocationButtonThenCreateAndEditButton() {
        createEventsPage.location.click();
        BrowserUtils.waitForClickablility(createEventsPage.CreateEditlocationName,2);
        createEventsPage.CreateEditlocationName.click();

    }

    @Then("user enters the location name{string} then click save button")
    public void userEntersTheLocationNameThenClickSaveButton(String location) {
        BrowserUtils.waitForVisibility(createEventsPage.locationName,2);
        createEventsPage.locationName.sendKeys(location);
        createEventsPage.saveCreatedLocationName.click();
    }


    @Then("user picks who is responsible")
    public void userPicksWhoIsResponsible() {
        createEventsPage.responsible.click();
        BrowserUtils.waitForClickablility(createEventsPage.chooseAdministrator, 2);
        createEventsPage.chooseAdministrator.click();
    }

    @And("user enters start date {string}")
    public void userEntersStartDate(String startDate) {
        createEventsPage.startDate.sendKeys(startDate);
    }

    @Then("user enters the end date {string}")
    public void userEntersTheEndDate(String endDate) {
        createEventsPage.endDate.sendKeys(endDate);
    }

    @And("user clicks the confirm event button")
    public void userClicksTheConfirmEventButton() {
        createEventsPage.confirmButton.click();
        BrowserUtils.wait(3);//demo
        createEventsPage.finishEvent.click();
        createEventsPage.saveKey.click();
        BrowserUtils.wait(3);//demo
    }


    @And("user verifies that event is created")
    public void userVerifiesThatEventIsCreated() {

        String title=createEventsPage.titleAfterCreate.getText();
        System.out.println(title);
        Assert.assertTrue(title.contains("Batch 12"));


    }
}










