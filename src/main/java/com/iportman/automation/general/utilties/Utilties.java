package com.iportman.automation.general.utilties;
import com.iportman.automation.general.LoggerHelper;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilties {
    static Logger logger = LoggerHelper.getLogger(Utilties.class);
    public static String getConfigProperty(String key){
        Properties prop = new Properties();
        String configFile =  "src" + File.separator + "test" + File.separator + "resources" + File.separator +"config.properties";

        logger.info("Config File Location "+configFile);
        try{
            FileInputStream fis = new FileInputStream(configFile);
             prop.load(fis);
            }
        catch (IOException e){
        e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
