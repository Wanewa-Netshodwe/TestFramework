package com.testframework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverInstance {
    private static ThreadLocal<WebDriver> driver  = new ThreadLocal<>();
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            System.out.println("The driver is null on thread: " + Thread.currentThread().getId());
            try {
                driver.set(createDriver());
                System.out.println("Created driver on thread: " + Thread.currentThread().getId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    private static  WebDriver createDriver() throws IOException {
        WebDriver driver  = null;
        String driver_path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driver_path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        return  driver;
    }
    public static  String getUrl() throws IOException {
        String file_path = System.getProperty("user.dir") + "\\config.properties";
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(file_path);
        prop.load(file);
        return  prop.getProperty("url");
    }
    public static  void tearDown(){
        driver.get().quit();
        driver.remove();
    }
}
