package com.Odoo.step_definitions;

import com.Odoo.pages.CreateEventsPage;
import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateAnEventStepDefinitions {
    CreateEventsPage createEventsPage=new CreateEventsPage();

    @Then("user logs in as events manager")
    public void userLogsInAsEventsManager() {
        String username= ConfigurationReader.getProperty("eventsusername");
        String password=ConfigurationReader.getProperty("eventspassword");
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @Then("user navigates to {string} module")
    public void userNavigatesToModule(String module) {
       BrowserUtils.waitForClickablility(createEventsPage.eventModule,2);
        createEventsPage.eventModule.click();


    }

    @Then("user clicks on create button")
    public void userClicksOnCreateButton() {
        BrowserUtils.waitForClickablility(createEventsPage.createButton,2);
        createEventsPage.createButton.click();
    }


    @Then("user enters {string} in events name box")
    public void userEntersInEventsNameBox(String name) {
       BrowserUtils.waitForClickablility(createEventsPage.eventsName,2);
        createEventsPage.eventsName.sendKeys(name);
    }

    @Then("user enters organizer name")
    public void userEntersOrganizerName() {
        BrowserUtils.waitForClickablility(createEventsPage.organizer,3);
        createEventsPage.organizer.click();
        BrowserUtils.waitForClickablility(createEventsPage.organizerName,2);
        createEventsPage.organizerName.click();
        BrowserUtils.waitForClickablility(createEventsPage.organizer,2);


    }
    @Then("user picks location")
    public void userPicksLocation() {
//        BrowserUtils.wait(3);
////        createEventsPage.location.click();
//        BrowserUtils.waitForClickablility(createEventsPage.locationName,2);
//        createEventsPage.locationName.click();


    }




    @Then("user picks who is responsible")
    public void userPicksWhoIsResponsible() {
        createEventsPage.responsible.click();
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
    }


}
