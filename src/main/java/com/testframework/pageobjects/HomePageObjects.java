package com.testframework.pageobjects;

import com.testframework.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class HomePageObjects extends BaseClass {
    WebDriver driver;
    WebDriverWait wait;



    By first_name_ref = By.xpath(" //input[@id='field-firstname']");
    By checkbox_ref = By.xpath(" //div[8]//div[1]//span[1]//label[1]");
    By last_name_ref = By.xpath("//input[@id='field-lastname']");
    By email_ref = By.xpath("//form[@id='customer-form']//input[@id='field-email']");
    By continue_ref = By.xpath("//button[@data-link-action='register-new-customer']");
    By mr_ref = By.xpath(" //label[normalize-space()='Mr.']");
    By add_promo_code_ref = By.xpath(" //span[normalize-space()='Add']");

    By proceed_to_checkout_ref = By.xpath("  //a[normalize-space()='Proceed to checkout']");

    By test_store_link_ref = By.cssSelector("a[href='https://teststore.automationtesting.co.uk/']");
    By humming_shirt_ref = By.xpath("//div[@class='products row']//img[@alt='Brown bear printed sweater']");
    By add_to_cart_ref = By.cssSelector(".btn.btn-primary.add-to-cart");
    By go_to_check_out_ref = By.xpath("//div[@class='cart-content-btn']//a[@class='btn btn-primary']");
    By have_promo_ref = By.xpath("//a[normalize-space()='Have a promo code?']");
    By promo_code_ref = By.xpath("//input[@placeholder='Promo code']");
    By cart_total_ref = By.xpath("//div[@class='cart-summary-line cart-total']//span[@class='value'][normalize-space()='$29.98']");

    public HomePageObjects(WebDriver driver) throws IOException {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public WebElement getTestStoreLink(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(test_store_link_ref));
        return driver.findElement(test_store_link_ref);
    }
    public WebElement hummingShirtDiv(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(humming_shirt_ref));
        return driver.findElement(humming_shirt_ref);
    }
    public WebElement addToCartBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_to_cart_ref));
        return driver.findElement(add_to_cart_ref);

    }
    public WebElement goToCheckOutBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(go_to_check_out_ref));
        return driver.findElement(go_to_check_out_ref);

    }
    public WebElement addPromoCodeBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(have_promo_ref));
        return driver.findElement(have_promo_ref);
    }
    public WebElement promoCodeInput(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(promo_code_ref));
        return driver.findElement(promo_code_ref);

    }
    public WebElement addPromoBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_promo_code_ref));
        return driver.findElement(add_promo_code_ref);

    }
    public WebElement cartTotalPara(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cart_total_ref));
        return driver.findElement(cart_total_ref);

    }
    public WebElement proceedToCheckoutBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceed_to_checkout_ref));
        return driver.findElement(proceed_to_checkout_ref);
    }

    public WebElement RadioBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mr_ref));
        return driver.findElement(mr_ref);
    }
    public WebElement firstNameInput(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(first_name_ref));
        return driver.findElement(first_name_ref);
    }

    public WebElement lastNameInput(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(last_name_ref));
        return driver.findElement(last_name_ref);
    }

    public WebElement emailInput(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email_ref));
        return driver.findElement(email_ref);
    }
    public WebElement continueBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continue_ref));
        return driver.findElement(continue_ref);
    }
    public WebElement checkBoxBtn(WebDriver driver) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox_ref));
        return driver.findElement(checkbox_ref);
    }



}
