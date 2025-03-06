package com.testframework.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    WebDriver driver;
    public WebDriver getChromeDriver() throws IOException {
        String driver_path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driver_path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        return  driver;
    }
    public void  scrollTo(WebDriver driver, WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public String getUrl() throws IOException {
        String file_path = System.getProperty("user.dir") + "\\config.properties";
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(file_path);
        prop.load(file);
        return  prop.getProperty("url");
    }



}
