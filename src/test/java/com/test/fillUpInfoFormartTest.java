package com.test;

import com.testframework.base.BaseClass;
import com.testframework.base.Hooks;
import com.testframework.base.WebDriverInstance;
import com.testframework.pageobjects.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class fillUpInfoFormartTest  extends Hooks {
    PageObjects pageObjects;
    public fillUpInfoFormartTest() throws IOException {
        pageObjects = new PageObjects();
    }
    @Test
    public void main() throws IOException {

        WebElement store_link= pageObjects.getTestStoreLink();
        scrollTo(store_link);
        store_link.click();
        //click on the shirt
        WebElement shirt= pageObjects.hummingShirtDiv();
        scrollTo(shirt);
        shirt.click();

        //click add to cart
        WebElement add_to_cart= pageObjects.addToCartBtn();
        add_to_cart.click();

        //go to checkout
        WebElement go_to_checkout= pageObjects.goToCheckOutBtn();
        go_to_checkout.click();

        //click have promo
        WebElement have_promo= pageObjects.addPromoCodeBtn();
        have_promo.click();

        //click insert promo code
        WebElement promo_input= pageObjects.promoCodeInput();
        promo_input.sendKeys("20OFF");

        //click add btn
        WebElement add_btn= pageObjects.addPromoBtn();
        add_btn.click();

        //click continueBtn
        WebElement proceedToCheckoutBtn= pageObjects.proceedToCheckoutBtn();
        proceedToCheckoutBtn.click();

        //click radioBtn
        WebElement radioBtn= pageObjects.RadioBtn();
        radioBtn.click();

        //fill in  firstname
        WebElement firstname= pageObjects.firstNameInput();
        firstname.sendKeys("Test");

        //fill in  lastname
        WebElement lastname= pageObjects.lastNameInput();
        lastname.sendKeys("User");

        //fill in  email
        WebElement email= pageObjects.emailInput();
        email.sendKeys("User@gmail.com");
        //click continue
        WebElement checkBoxBtn= pageObjects.checkBoxBtn();
        checkBoxBtn.click();

        //click continue
        WebElement continueBtn= pageObjects.continueBtn();
        continueBtn.click();
        System.out.println("finished first test");
    }

}
