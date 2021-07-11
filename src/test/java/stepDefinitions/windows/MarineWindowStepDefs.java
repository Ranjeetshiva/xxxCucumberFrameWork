package stepDefinitions.windows;

import com.iportman.automation.baseDriver.PageDriver;
import com.iportman.automation.general.LoggerHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class MarineWindowStepDefs {

    Logger logger= LoggerHelper.getLogger(MarineWindowStepDefs.class);

    @When("user enters {string} in global search")
    public void userEntersInGlobalSearch(String arg0) {
        logger.info("userEntersInGlobalSearch");
    }

    @Then("user should be able to see {string} Form")
    public void userShouldBeAbleToSeeForm(String arg0) {
        logger.info("userShouldBeAbleToSeeForm");
    }

    @When("user clicks on Side Menu")
    public void userClicksOnSideMenu() {
        logger.info("userClicksOnSideMenu");
    }
}
