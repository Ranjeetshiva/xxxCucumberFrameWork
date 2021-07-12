package com.iportman.automation.general.utilties.windows;
import com.iportman.automation.baseDriver.PageDriver;
import com.iportman.automation.general.LoggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.NoSuchElementException;

public class WindowsGenralActions extends PageDriver {

    Logger logger = LoggerHelper.getLogger(WindowsGenralActions.class);
    WebDriverWait wait =null;

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
        wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
        logger.info("element is visible..");
    }

    public <T> boolean enterText(T element,String value){
        WebElement textBox = findElement(element);
        Assert.assertNotNull(textBox);
        textBox.clear();
        textBox.sendKeys(value);
        return true;
    }

    public <T> WebElement findElement(T element){
        if(element.getClass().toString().contains("By")){
            return driver.findElement((By) element);
        }else {
            return this.wait.until(ExpectedConditions.visibilityOf((WebElement) element));
        }

    }

    public <T> boolean clickElement(T element){
        WebElement button = findElement(element);
        Assert.assertNotNull(button);
        button.click();
        return true;
    }
}
