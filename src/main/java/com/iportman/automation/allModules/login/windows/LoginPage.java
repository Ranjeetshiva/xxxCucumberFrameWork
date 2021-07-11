package com.iportman.automation.allModules.login.windows;


import com.iportman.automation.baseDriver.AbstractDriver;
import com.iportman.automation.baseDriver.PageDriver;
import com.iportman.automation.general.LoggerHelper;
import com.iportman.automation.general.utilties.Utilties;
import com.iportman.automation.general.utilties.windows.WindowsGenralActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends AbstractDriver {

    Logger logger = LoggerHelper.getLogger(LoginPage.class);

    By userNameBy = By.xpath("//input[@id='email']");
    By passWordBy = By.xpath("//input[@id='password']");
    By loginButtonBy = By.xpath("//button[text()='Login']");
    WindowsGenralActions windowsGenralActions = new WindowsGenralActions();

    /**
     *
     * @param posUser
     * @param userId
     */
    public void loginToAPP(String posUser, String userId){
        invokeApp(posUser);
        windowsGenralActions.enterText(userNameBy,userId);
        windowsGenralActions.enterText(passWordBy, Utilties.getConfigProperty("password"));
        windowsGenralActions.clickElement(loginButtonBy);
        logger.info("Application Login Successful");
    }
}
