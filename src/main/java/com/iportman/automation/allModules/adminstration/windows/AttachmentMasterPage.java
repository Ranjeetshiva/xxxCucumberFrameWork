package com.iportman.automation.allModules.adminstration.windows;
import com.iportman.automation.baseDriver.AbstractDriver;
import com.iportman.automation.general.utilties.windows.WindowsGenralActions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AttachmentMasterPage extends AbstractDriver {
    By searchBox = By.xpath("//input[@title='Search']");
    WindowsGenralActions windowsGenralActions = new WindowsGenralActions();

    public void check(String url) throws InterruptedException {
        driver().navigate().to(url);
        Thread.sleep(7000);
    }

    public void verifySearchBox(){
        Assert.assertTrue(windowsGenralActions.doesElementExists(searchBox));
        logger.info("Verified Search box");

    }

}
