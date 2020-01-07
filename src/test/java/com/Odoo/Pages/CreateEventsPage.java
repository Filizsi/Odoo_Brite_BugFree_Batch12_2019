package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateEventsPage {

    public CreateEventsPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(css="[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(css="[name='name']")
    public WebElement eventsName;

    @FindBy(css = "[id*='o_field_input_45']")
    public WebElement organizer;

    @FindBy(xpath = "//*[@class='ui-menu-item'][1]")
    public WebElement organizerName;

    @FindBy(css ="[id='o_field_input_23']")
    public WebElement location;

    @FindBy(xpath = "//body/ul[2]/li[1]/a")
    public WebElement locationName;

    @FindBy(css = "[id='o_field_input_25']")
    public WebElement responsible;

    @FindBy(xpath = "//*[@id='ui-id-129']/a")
    public WebElement chooseAdministrator;

    @FindBy(css = "[id='o_field_input_26']")
    public WebElement category;

    @FindBy(css = "[id='o_field_input_29']")
    public WebElement startDate;

    @FindBy(css = "[id='o_field_input_30']")
    public WebElement endDate;

    @FindBy(css = "button[class='btn btn-sm btn-default oe_highlight']")
    public WebElement confirmButton;

    @FindBy(linkText = "Events")
    public WebElement eventModule;






}
