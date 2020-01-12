package com.Odoo.step_definitions;

import com.Odoo.Pages.CreateProductPage;
import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;
import java.util.Map;

public class CreateProductStepDefinitions {

    CreateProductPage createProductPage = new CreateProductPage();

    @Then("user navigates to Purchases then to Products")
    public void user_navigates_to_Purchases_then_to_Products() {
        createProductPage.navigateToPurchases();
        createProductPage.navigateToProducts();
    }

    @Then("user clicks on Create button")
    public void user_clicks_on_Create_button() {
        BrowserUtils.waitForClickablility(createProductPage.Create,10);
        BrowserUtils.clickWithWait(createProductPage.Create);

    }

    @Then("user adds new product information")
    public void user_adds_new_product_information(List<Map<String, String >> dataTable) {
        createProductPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForPageToLoad(5);

        int row = 1;
        for(Map<String, String> map: dataTable) {
            createProductPage.ProductName.sendKeys(map.get("Product Name"));
            createProductPage.ProductType.sendKeys(map.get("Product Type"));
            createProductPage.SalesPrice.clear();
            createProductPage.SalesPrice.sendKeys(map.get("Sales Price"));
           // createProductPage.Cost.sendKeys(map.get("Cost"));
        }
            row++;
        createProductPage.Save.click();
        }

    @Then("verify that product created")
    public void verify_that_product_created() {

        String expectedTitle = "Laptop - Odoo";
        BrowserUtils.waitForPageTitle(expectedTitle);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Title is incorrect",expectedTitle,actualTitle);
        System.out.println("Product has been created");

    }



}



