package com.testframework.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;



public class Hooks extends WebDriverInstance{
    @BeforeTest
    public  void setup() throws IOException {
        getDriver().get(getUrl());
    }
    public void  scrollTo(WebElement element){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    @AfterTest
    public void cleanup() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverInstance.tearDown();
    }

}
