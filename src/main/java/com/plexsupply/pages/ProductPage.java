package com.plexsupply.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    private By addToCartButton = By.cssSelector(".product-add-to-cart");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        // This will be handled by navigation from HomePage
    }

    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
    }
}
