package com.test;

import com.testframework.base.BaseClass;
import com.testframework.pageobjects.HomePageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExampleTest extends BaseClass {
    WebDriver driver = getChromeDriver();
    HomePageObjects homePageObjects ;
    public ExampleTest() throws IOException {
        driver.get(getUrl());
        homePageObjects = new HomePageObjects(driver);
    }

    @Test
    public void cartTotalTest() throws IOException, InterruptedException {
       WebElement store_link= homePageObjects.getTestStoreLink(driver);
       scrollTo(driver,store_link);
       store_link.click();
       //click on the shirt
        WebElement shirt= homePageObjects.hummingShirtDiv(driver);
        scrollTo(driver,shirt);
        shirt.click();

        //click add to cart
        WebElement add_to_cart= homePageObjects.addToCartBtn(driver);
        add_to_cart.click();

        //go to checkout
        WebElement go_to_checkout= homePageObjects.goToCheckOutBtn(driver);
        go_to_checkout.click();

        //click have promo
        WebElement have_promo= homePageObjects.addPromoCodeBtn(driver);
        have_promo.click();

        //click insert promo code
        WebElement promo_input= homePageObjects.promoCodeInput(driver);
        promo_input.sendKeys("20OFF");

        //click add btn
        WebElement add_btn= homePageObjects.addPromoBtn(driver);
        add_btn.click();

        //compare total price
        WebElement promo_price= homePageObjects.cartTotalPara(driver);
        Assert.assertEquals("$29.98",promo_price.getText());

    }

    @Test
    public void fillUpInfoFormartTest() throws IOException {
        //click continueBtn
        WebElement proceedToCheckoutBtn= homePageObjects.proceedToCheckoutBtn(driver);
        proceedToCheckoutBtn.click();

        //click radioBtn
        WebElement radioBtn= homePageObjects.RadioBtn(driver);
        radioBtn.click();

        //fill in  firstname
        WebElement firstname= homePageObjects.firstNameInput(driver);
        firstname.sendKeys("Test");

        //fill in  lastname
        WebElement lastname= homePageObjects.lastNameInput(driver);
        lastname.sendKeys("User");

        //fill in  email
        WebElement email= homePageObjects.emailInput(driver);
        email.sendKeys("User@gmail.com");
        //click continue
        WebElement checkBoxBtn= homePageObjects.checkBoxBtn(driver);
        checkBoxBtn.click();

        //click continue
        WebElement continueBtn= homePageObjects.continueBtn(driver);
        continueBtn.click();

    }

}
