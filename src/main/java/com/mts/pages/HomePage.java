package com.mts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Локаторы для вариантов оплаты
    private By mobileServicesOption = By.id("mobile_services");
    private By internetServicesOption = By.id("internet_services");
    private By installmentServicesOption = By.id("installment_services");
    private By debtOption = By.id("debt");

    public WebElement getMobileServicesOption() {
        return driver.findElement(mobileServicesOption);
    }

    public WebElement getInternetServicesOption() {
        return driver.findElement(internetServicesOption);
    }

    public WebElement getInstallmentServicesOption() {
        return driver.findElement(installmentServicesOption);
    }

    public WebElement getDebtOption() {
        return driver.findElement(debtOption);
    }

    // Метод для проверки надписей в незаполненных полях
    public void checkPlaceholders() {
        assert getMobileServicesOption().getAttribute("placeholder").equals("Услуги связи");
        assert getInternetServicesOption().getAttribute("placeholder").equals("Домашний интернет");
        assert getInstallmentServicesOption().getAttribute("placeholder").equals("Рассрочка");
        assert getDebtOption().getAttribute("placeholder").equals("Задолженность");
    }
}
