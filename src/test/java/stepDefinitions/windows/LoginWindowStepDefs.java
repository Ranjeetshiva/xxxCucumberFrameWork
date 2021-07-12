package stepDefinitions.windows;

import com.iportman.automation.allModules.login.windows.LoginPage;
import io.cucumber.java.en.Given;

public class LoginWindowStepDefs {

    @Given("the {string} user {string} is logged into iportman application")
    public void theUserIsLoggedIntoIportmanApplication(String posUser, String userId) {
        LoginPage loginPage= new LoginPage();
        loginPage.loginToAPP(posUser,userId);
    }
}
