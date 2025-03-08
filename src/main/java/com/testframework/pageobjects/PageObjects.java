package com.testframework.pageobjects;

import com.testframework.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class PageObjects extends BaseClass {



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

    public PageObjects() throws IOException {

    }


    public WebElement getTestStoreLink() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(test_store_link_ref));
        return getChromeDriver().findElement(test_store_link_ref);
    }
    public WebElement hummingShirtDiv() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(humming_shirt_ref));
        return getChromeDriver().findElement(humming_shirt_ref);
    }
    public WebElement addToCartBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_to_cart_ref));
        return getChromeDriver().findElement(add_to_cart_ref);

    }
    public WebElement goToCheckOutBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(go_to_check_out_ref));
        return getChromeDriver().findElement(go_to_check_out_ref);

    }
    public WebElement addPromoCodeBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(have_promo_ref));
        return getChromeDriver().findElement(have_promo_ref);
    }
    public WebElement promoCodeInput() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(promo_code_ref));
        return getChromeDriver().findElement(promo_code_ref);

    }
    public WebElement addPromoBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_promo_code_ref));
        return getChromeDriver().findElement(add_promo_code_ref);

    }
    public WebElement cartTotalPara() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cart_total_ref));
        return getChromeDriver().findElement(cart_total_ref);

    }
    public WebElement proceedToCheckoutBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceed_to_checkout_ref));
        return getChromeDriver().findElement(proceed_to_checkout_ref);
    }

    public WebElement RadioBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(mr_ref));
        return getChromeDriver().findElement(mr_ref);
    }
    public WebElement firstNameInput() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(first_name_ref));
        return getChromeDriver().findElement(first_name_ref);
    }

    public WebElement lastNameInput() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(last_name_ref));
        return getChromeDriver().findElement(last_name_ref);
    }

    public WebElement emailInput() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(email_ref));
        return getChromeDriver().findElement(email_ref);
    }
    public WebElement continueBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(continue_ref));
        return getChromeDriver().findElement(continue_ref);
    }
    public WebElement checkBoxBtn() throws IOException {
        WebDriverWait wait;
        wait = new WebDriverWait(getChromeDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox_ref));
        return getChromeDriver().findElement(checkbox_ref);
    }

    



}
