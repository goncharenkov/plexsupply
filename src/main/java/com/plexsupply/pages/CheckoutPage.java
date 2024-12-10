package com.plexsupply.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    private By nameField = By.id("name");
    private By addressField = By.id("address");
    private By creditCardField = By.id("creditCard");
    private By submitButton = By.cssSelector(".submit-order");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        // This will be handled by navigation from HomePage
    }

    public void fillOutForm(String name, String address, String creditCard) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(creditCardField).sendKeys(creditCard);
    }

    public void submitOrder() {
        driver.findElement(submitButton).click();
    }
}
