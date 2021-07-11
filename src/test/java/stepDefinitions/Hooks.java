package stepDefinitions;

import com.iportman.automation.baseDriver.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.iportman.automation.general.LoggerHelper;

public class Hooks extends PageDriver {

    Logger logger = LoggerHelper.getLogger(Hooks.class);

    @Before
    public void initializeTest() {
        System.out.println("initializeTest");
    }

    @After
    public void endTest(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                logger.info(scenario.getName() + " is Failed");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot , "image/png", "Bartholomew and the Bytes of the Oobleck");
                logger.info("This is an Info");
            } catch (WebDriverException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
