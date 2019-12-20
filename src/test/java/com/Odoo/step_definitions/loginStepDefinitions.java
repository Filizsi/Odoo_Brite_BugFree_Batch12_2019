package com.Odoo.step_definitions;

import com.Odoo.pages.LoginPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.*;

public class loginStepDefinitions {
    LoginPage loginpage=new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as posmanager")
    public void user_logs_in_as_posmanager() {
        String userName= ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");
       loginpage.login(userName,password);


    }


}
