package com.iportman.automation.stepDefinitions.adminStepDef;


import com.iportman.automation.admin.windows.AttachmentMasterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinitions{
    @When("the Breaker joins the maker's game")
    public void the_Breaker_joins_the_maker_s_game() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the Breaker joins the maker's game");
    }

    @Then("the breaker must guess")
    public void theBreakerMustGuess() {
        System.out.println("the breaker must guess");
    }

    @Given("^the Maker has started a game with the work \"([^\"]*)\"$")
    public void theMakerHasStartedAGameWithTheWork(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the Maker has started a game with the work" +arg0);
    }

    @Given("application url {string}")
    public void applicationUrl(String url) throws InterruptedException {
        AttachmentMasterPage attachmentMasterPage = new AttachmentMasterPage();
        attachmentMasterPage.checking(url);
    }

    @Given("application Fb url {string}")
    public void applicationFbUrl(String url) throws InterruptedException {
        AttachmentMasterPage attachmentMasterPage = new AttachmentMasterPage();
        attachmentMasterPage.check(url);
    }
}
