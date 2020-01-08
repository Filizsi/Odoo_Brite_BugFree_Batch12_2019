package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class CreateEventsPage {

    public CreateEventsPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(css="[class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(css="[name='name']")
    public WebElement eventsName;

    @FindBy(xpath = "//table[1][@class='o_group o_inner_group o_group_col_6']//tbody//tr[1]//td[2]//div//input")
    public WebElement organizer;

    @FindBy(xpath = "//*[@class='ui-menu-item'][1]")
    public WebElement organizerName;

    @FindBy(xpath = "//table[1][@class='o_group o_inner_group o_group_col_6']//tbody//tr[2]//td[2]//div//div//input")
    public WebElement location;

    @FindBy(xpath = "//body/ul[2]/li[1]/a")
    public WebElement locationName;

    @FindBy(xpath = "//table[1][@class='o_group o_inner_group o_group_col_6']//tbody//tr[4]//td[2]//div//div//input")
    public WebElement responsible;

    @FindBy(xpath = "//body/ul[4]//li[1]//a")
    public WebElement chooseAdministrator;

    @FindBy(xpath = "//table[2][@class='o_group o_inner_group o_group_col_6']//tbody//tr[1]//td[2]//div//div//input")
    public WebElement category;

    @FindBy(xpath = "//table[3][@class='o_group o_inner_group o_group_col_6']//tbody//tr[1]//td[2]//div//input")
    public WebElement startDate;

    @FindBy(xpath = "//table[3][@class='o_group o_inner_group o_group_col_6']//tbody//tr[2]//td[2]//div//input")
    public WebElement endDate;

    @FindBy(css = "button[class='btn btn-sm btn-default oe_highlight']")
    public WebElement confirmButton;

    @FindBy(linkText = "Events")
    public WebElement eventModule;

    @FindBy(xpath = "//*[text()='Finish Event']")
    public WebElement finishEvent;

    @FindBy(linkText = "Events")
    public WebElement eventsLink;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveKey;

    @FindBy(xpath = "//table//tbody//tr")
    public List<WebElement> events;



    public  List <String> eventsList(){
       return  BrowserUtils.getListOfStrings(events);

    }




}
