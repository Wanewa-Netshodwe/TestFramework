package com.test;

import com.testframework.base.BaseClass;
import com.testframework.base.Hooks;
import com.testframework.pageobjects.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(com.testframework.signals.TestListener.class)
public class CartTotalTest extends Hooks {
    PageObjects pageObjects;
    public CartTotalTest() throws IOException {
        pageObjects = new PageObjects();
    }
    @Test
    public void main() throws IOException, InterruptedException {
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

        //compare total price
        WebElement promo_price= pageObjects.cartTotalPara();
        Assert.assertEquals("$29.98",promo_price.getText());

    }



}
