package com.iportman.automation.utilties.windows;

import com.iportman.automation.baseDriver.PageDriver;
import org.openqa.selenium.By;


import java.util.NoSuchElementException;

public class WindowsGenralActions extends PageDriver {

    public boolean doesElementExists(By element){
        try{
            driver.findElement((By) element);
            return true;
        }catch(NoSuchElementException e){
            return false;
        }
    }

}
