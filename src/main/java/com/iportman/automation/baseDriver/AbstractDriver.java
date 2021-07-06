package com.iportman.automation.baseDriver;

import com.iportman.automation.enums.Browsers;
import com.iportman.automation.utilties.LoggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public abstract class AbstractDriver {
    Logger logger = LoggerHelper.getLogger(AbstractDriver.class);

    public WebDriver driver(){
        PageDriver pageDriver = new PageDriver();
        logger.info("***** Web Driver Started Successfully ***** ");
        return pageDriver.selectBrowserDriver(Browsers.CHROME.name());
    }
}
