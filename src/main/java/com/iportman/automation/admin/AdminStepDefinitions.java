package com.iportman.automation.admin;

import com.iportman.automation.admin.AdminInterface;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class AdminStepDefinitions implements AdminInterface {


    @Given("^the Maker has started a game with the work \"([^\"]*)\"$")
    public void the_maker_has_started_a_game_with_the_work_something(String strArg1){
        System.out.println("the Maker has started a game with the work");
    }


    @When("the Breaker joins the maker's game")
    public void theBreakerJoinsTheMakerSGame() {

        System.out.println("the Breaker joins the maker's game");
    }
}
