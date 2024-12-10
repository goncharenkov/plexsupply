package com.plexsupply.ui;

import com.plexsupply.BaseTest;
import com.plexsupply.pages.HomePage;
import com.plexsupply.pages.ProductPage;
import com.plexsupply.pages.CheckoutPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UiTests extends BaseTest {

    @Test
    public void testSuccessfulCheckout() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.selectProduct();

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart();

        homePage.goToCart();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillOutForm("John Doe", "123 Main St", "4111111111111111");
        checkoutPage.submitOrder();

        assertTrue(driver.getPageSource().contains("Thank you for your order!"));
    }
}
