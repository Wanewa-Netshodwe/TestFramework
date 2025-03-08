package com.testframework.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class BaseClass {

    public WebDriver getChromeDriver() throws IOException {
        return WebDriverInstance.getDriver();
    }


    public void takeSnapshot(String name) throws IOException {
        File snapshot = ((TakesScreenshot) getChromeDriver()).getScreenshotAs(OutputType.FILE);
        File dest = new File(System.getProperty("user.dir")+"\\FailedTest\\"+name+" At "+getTimestamp()+".png");
        FileUtils.copyFile(snapshot,dest);
    }

    public String getTimestamp(){
        return  new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }




}
