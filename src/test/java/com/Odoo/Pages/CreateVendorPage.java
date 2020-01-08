package com.Odoo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateVendorPage {

    @FindBy(xpath = "//span[@class='oe_menu_text' and contains(text(),'Purchases')]")

   public WebElement purchaseButton;

    @FindBy(xpath = "//span[@class='oe_menu_text' and contains(text(),'Vendors')]")
    public WebElement vendorsButton;

    @FindBy(xpath= "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default' and contains(text(),'Create')]")
   public WebElement createButton;

    @FindBy(xpath= "//*[starts-with(@class,'o_field_char o_field_widget o_input')]")
    public WebElement nameBox;

    @FindBy (xpath="//input[@class='o_field_char o_field_widget o_input o_address_street']")
   public WebElement streetBox;

    @FindBy(xpath = "//*[contains(@class,'o_field_widget o_input o_address_city')]")
   public  WebElement cityButton;

    @FindBy (xpath= "//*[contains(@placeholder,'S\uFEFFt\uFEFFa\uFEFFt\uFEFFe')]")
   public  WebElement stateButton;

    @FindBy( xpath = "//input[contains(@name,'zip')]")
   public  WebElement zipButton;

    @FindBy( xpath = "//input[@name='mobile']")
   public WebElement mobileButton;

    @FindBy(xpath = "//*[@class='o_field_email o_field_widget o_input']")
   public WebElement emailButton;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new' and contains(text(),'Create')]")
    public WebElement lastCreateButton;









}
