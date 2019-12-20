package com.Odoo.pages;


import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id="login")
    public WebElement emailBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(css="[type='submit']")
    public WebElement loginButton;

    public void login(String userName, String password){
        emailBox.sendKeys(userName);
        passwordBox.sendKeys(password);
        loginButton.click();

    }
}
