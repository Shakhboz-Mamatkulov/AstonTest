package com.mts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Локаторы для полей ввода
    private By phoneNumberField = By.id("phone_number");
    private By amountField = By.id("amount");
    private By nextButton = By.id("next_button");
    private By cardRequisitesField = By.id("card_requisites");
    private By paymentSystemIcons = By.className("payment_system_icons");

    // Методы для проверки отображения данных
    public WebElement getPhoneNumberField() {
        return driver.findElement(phoneNumberField);
    }

    public WebElement getAmountField() {
        return driver.findElement(amountField);
    }

    public WebElement getNextButton() {
        return driver.findElement(nextButton);
    }

    public WebElement getCardRequisitesField() {
        return driver.findElement(cardRequisitesField);
    }

    public WebElement getPaymentSystemIcons() {
        return driver.findElement(paymentSystemIcons);
    }

    // Метод для проверки корректности отображения данных
    public void checkPaymentDetails() {
        assert getAmountField().getText().contains("Сумма");
        assert getPhoneNumberField().getText().matches("[0-9]{10}"); // Проверка на номер телефона
        assert getCardRequisitesField().getAttribute("placeholder").contains("Реквизиты карты");
        assert getPaymentSystemIcons().isDisplayed();
    }

    // Метод для продолжения
    public void clickNext() {
        getNextButton().click();
    }
}
