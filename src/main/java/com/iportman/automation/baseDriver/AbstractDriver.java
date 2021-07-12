package com.iportman.automation.baseDriver;

import com.iportman.automation.general.enums.Browsers;
import com.iportman.automation.general.LoggerHelper;
import com.iportman.automation.general.utilties.Utilties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public abstract class AbstractDriver {
    public Logger logger = LoggerHelper.getLogger(AbstractDriver.class);
    PageDriver pageDriver =null;

    public WebDriver driver(){
        pageDriver = new PageDriver();
        logger.info("***** Web Driver Started Successfully ***** ");
        return pageDriver.selectBrowserDriver(Browsers.CHROME.name());
    }

    public void invokeApp(String appName){
        if(appName.equals("POS")){
            driver().navigate().to(Utilties.getConfigProperty("posUrl"));
            logger.info("Application Launched "+ Utilties.getConfigProperty("posUrl"));
        }
    }
}
