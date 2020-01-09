package com.Odoo.Pages;

import com.Odoo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PosPage extends BasePage{

    @FindBy(xpath = "//a[@data-menu=\"484\"]")
    public WebElement PosModule;

    @FindBy(xpath = "//span[@class=\"o_pager_limit\"]")
    public WebElement PageLimit;

    public void navigateToPosModule(){
        BrowserUtils.wait(2);
        PosModule.click();
        BrowserUtils.wait(2);
    }


    public void PageLimit() {

        BrowserUtils.wait(2);
        String pagelimit = PageLimit.getText();
        BrowserUtils.wait(1);
        Integer actualresult = Integer.parseInt(pagelimit);
        Integer expectedresult = 32;

        if(actualresult== expectedresult){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}