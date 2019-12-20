package com.Odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "",//path to feature
        glue="",//path to step_definitions
        dryRun = false,
        tags="",
        plugin={"html:target/default-cucumber-reports",
        "json:target/cucumber.json"
        }
)
public class CucumberRunner {


}
