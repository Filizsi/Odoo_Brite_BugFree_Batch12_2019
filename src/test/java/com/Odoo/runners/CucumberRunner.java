package com.Odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",//path to feature
        glue="com/Odoo/step_definitions",//path to step_definitions
        dryRun = false,
        tags="@create_product",
        plugin={"html:target/default-cucumber-reports",
        "json:target/cucumber.json"
        }
)
public class CucumberRunner {


}
