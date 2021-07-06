package com.iportman.automation.utilties.windows;

import com.iportman.automation.baseDriver.PageDriver;
import com.iportman.automation.utilties.LoggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;

public class WindowsGenralActions extends PageDriver {

    Logger logger = LoggerHelper.getLogger(WindowsGenralActions.class);

    public boolean doesElementExists(By element){
        try{
            driver.findElement((By) element);
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }

    public void WaitForElement(WebElement element, long timeOutInSeconds){
        logger.info("waiting for element visibilityOf..");
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        logger.info("element is visible..");

    }

}
