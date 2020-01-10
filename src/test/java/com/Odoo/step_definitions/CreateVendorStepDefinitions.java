package com.Odoo.step_definitions;

import com.Odoo.Pages.BasePage;
import com.Odoo.Pages.CreateVendorPage;
import com.Odoo.Pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateVendorStepDefinitions extends BasePage {

    CreateVendorPage newVendor = new CreateVendorPage();
    LoginPage login = new LoginPage();

    @Given("User is on the log in page")
    public void user_is_on_the_log_in_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User logs in….")
    public void user_logs_in() {
        System.out.println("Login as  posmanager");
        String userName = ConfigurationReader.getProperty("username");
        BrowserUtils.wait(5);
        String password = ConfigurationReader.getProperty("password");
        login.login(userName, password);
        BrowserUtils.wait(5);
    }

    @Then("User navigates to “Purchases” then to “vendors”")
    public void user_navigates_to_Purchases_then_to_vendors() {
       //Driver.get(newVendor.purchaseButton).click();
        BrowserUtils.wait(6);
        newVendor.vendorsButton.click();
        BrowserUtils.wait(6);

    }

    @Then("User clicks on create button")
    public void user_clicks_on_create_button() {
        newVendor.createButton.click();
        BrowserUtils.wait(6);
    }

    @Then("User adds new vendor  information")
    public void user_adds_new_vendor_information() {

        newVendor.nameBox.sendKeys("Sophie Kayla");
        BrowserUtils.wait(6);
        newVendor.streetBox.sendKeys("263 Pony dr.");
        BrowserUtils.wait(6);
        newVendor.cityButton.sendKeys("Dallas");
        BrowserUtils.wait(6);
        newVendor.stateButton.sendKeys("Texas");
        BrowserUtils.wait(6);
        newVendor.zipButton.sendKeys("75002");
        BrowserUtils.wait(6);
        newVendor.mobileButton.sendKeys("469 645 8354");
        BrowserUtils.wait(6);
        newVendor.emailButton.sendKeys("jdjbnc26@gmail.com");
        BrowserUtils.wait(6);

    }

    @Then("User clicks create button")
    public void user_clicks_create_button() {

        newVendor.lastCreateButton.click();
        BrowserUtils.wait(6);
        System.out.println("New Vendor is created");
    }


}
