package com.Odoo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsCategoriesPage extends BasePage {

    @FindBy(xpath = "//span[@class='oe_menu_text']")
    public WebElement event;

    @FindBy(xpath = "//span[@class='oe_secondary_menu_section']")
    public WebElement eventCategories;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement seminar;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement bbbaaa;


}
