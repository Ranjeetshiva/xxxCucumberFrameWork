package com.iportman.automation.stepDefinitions;




import com.iportman.automation.baseDriver.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumberFramework.helper.LoggerHelper;


public class Hooks extends PageDriver {


   Logger logger = LoggerHelper.getLogger(Hooks.class);

   // protected static final Logger logger = Logger.getLogger(Hooks.class.getName());

//    public Hooks(){
//        pageDriver = new PageDriver();
//        pageDriver.selectBrowser(Browsers.CHROME.name());
//
//    }
    @Before("@JuneRelease")
    public void initializeTest() {
        System.out.println("initializeTest");
    }

    @After("@JuneRelease")
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                logger.info(scenario.getName() + " is Failed");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot , "image/png", "Bartholomew and the Bytes of the Oobleck");

                logger.trace("This is a Trace");
                logger.debug("This is a Debug");
                logger.info("This is an Info");
                logger.warn("This is a Warn");
                logger.error("This is an Error");
                logger.fatal("This is a Fatal");

            } catch (WebDriverException e) {
                e.printStackTrace();
            }

        }
    }

}
