package com.Odoo.Pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage extends BasePage {

    public CreateProductPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[class='dropdown full']")
    public  WebElement Website;

    @FindBy(xpath = "//span[@class='oe_menu_text' and contains(text(),'Purchases')]" )
    public  WebElement Purchases;

    @FindBy(css = "[data-menu='516']")
    public WebElement Products;

    @FindBy(css = "[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement Create;

    @FindBy(css = "[placeholder='Product Name']")
    public WebElement ProductName;

    @FindBy(css = "[name='type']")
    public WebElement ProductType;


    public WebElement Category;

    @FindBy(xpath= "//div[@name='list_price']/input")
    public WebElement SalesPrice;

    @FindBy(xpath = "(//input[@class='o_input'])[2]")
    public WebElement Cost;

    @FindBy(css = "[accesskey='s']")
    public WebElement Save;

    public void navigateToPurchases(){
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForPageToLoad(5);
        Purchases.click();
    }

    public void navigateToProducts(){
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(Products,10);
        Products.click();
    }
}


