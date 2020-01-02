package com.Odoo.step_definitions;

import com.Odoo.Pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {
  LoginPage loginPage=new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as posmanager")
    public void user_logs_in_as_posmanager() {
        System.out.println("Login as  posmanager");

        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
       loginPage.login(userName, password);
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        System.out.println(string);
       loginPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(5);
       Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }



}
