package com.testframework.signals;


import com.testframework.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener  extends BaseClass implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        try {
            takeSnapshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
