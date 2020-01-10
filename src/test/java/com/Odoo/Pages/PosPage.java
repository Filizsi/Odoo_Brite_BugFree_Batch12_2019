package com.Odoo.Pages;

import com.Odoo.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PosPage extends BasePage{

    @FindBy(xpath = "//a[@data-menu=\"484\"]")
    public WebElement PosModule;
    @FindBy(xpath = "//span[@class=\"o_pager_limit\"]")
    public WebElement PageLimit;

    @FindBy(xpath = "//input[@placeholder=\"Search...\"]")
    public WebElement SearchInput;



    //*******************Viktoria******************
    public void navigateToPosModule(){
        BrowserUtils.wait(2);
        PosModule.click();
        BrowserUtils.wait(2);
       // SearchInput.sendKeys("ipone", Keys.ENTER);
    }
    public void PageLimit(String expectedResult) {
        BrowserUtils.wait(2);
        String actualResult = PageLimit.getText();
        BrowserUtils.wait(1);
        Assert.assertEquals(expectedResult, actualResult);
        //Assert.assertTrue(PageLimit.isDisplayed());
    }
        //*******************Viktoria*********************


}
