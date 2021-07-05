package com.iportman.automation.admin.windows;
import com.iportman.automation.baseDriver.AbstractDriver;
import com.iportman.automation.baseDriver.PageDriver;
import com.iportman.automation.utilties.windows.WindowsGenralActions;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AttachmentMasterPage extends AbstractDriver {
    //Object For Master Page
    public void checking(String url) throws InterruptedException {
        driver().navigate().to(url);
        Thread.sleep(7000);
        WindowsGenralActions windowsGenralActions = new WindowsGenralActions();
        By searchBox = By.xpath("//input[@title='Search123']");
        Assert.assertTrue(windowsGenralActions.doesElementExists(searchBox));
    }

    public void check(String url) throws InterruptedException {
        driver().navigate().to(url);
        Thread.sleep(7000);
    }


}
