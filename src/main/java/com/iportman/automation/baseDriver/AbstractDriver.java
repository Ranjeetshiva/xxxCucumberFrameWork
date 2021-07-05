package com.iportman.automation.baseDriver;

import cucumberFramework.enums.Browsers;
import org.openqa.selenium.WebDriver;

public abstract class AbstractDriver {

    public WebDriver driver(){
        PageDriver pageDriver = new PageDriver();
        return pageDriver.selectBrowser(Browsers.CHROME.name());
    }
}
