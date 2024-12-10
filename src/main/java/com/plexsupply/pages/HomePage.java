package com.plexsupply.pages;

import com.plexsupply.utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By productLink = By.cssSelector(".product-link");
    private By cartButton = By.cssSelector(".cart-button");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(Config.getBaseUrl());
    }

    public void selectProduct() {
        driver.findElement(productLink).click();
    }

    public void goToCart() {
        driver.findElement(cartButton).click();
    }
}
