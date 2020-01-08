package com.Odoo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateVendorPage {

    @FindBy(xpath = "//span[@class='oe_menu_text' and contains(text(),'Purchases')]")

    WebElement purchaseButton;

    @FindBy(xpath = "//span[@class='oe_menu_text' and contains(text(),'Vendors')]")
    WebElement vendorsButton;

    @FindBy(xpath= "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default' and contains(text(),'Create')]")
    WebElement createButton;

    @FindBy(id= "o_field_input_1811")
    WebElement nameBox;

    @FindBy (xpath="//input[@class='o_field_char o_field_widget o_input o_address_street']")
    WebElement streetBox;

    @FindBy(id= "o_field_input_2061")
    WebElement cityButton;

    @FindBy (id= "o_field_input_2062")
    WebElement stateButton;

    @FindBy( id = "o_field_input_2063")
    WebElement zipButton;

    @FindBy( xpath = "//input[@name='mobile']")
    WebElement mobileButton;

    @FindBy(xpath = "//*[@class='o_field_email o_field_widget o_input']")
    WebElement emailButton;

    @FindBy(xpath="//input[@id='o_field_input_2073']")
    WebElement titledropDown;













}
