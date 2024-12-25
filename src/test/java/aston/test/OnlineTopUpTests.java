package aston.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OnlineTopUpTests extends BaseTest {

    @Test
    public void testBlockTitle() {
        driver.get("https://www.mts.by/");
        WebElement blockTitle = driver.findElement(By.xpath("//h2[text()='Онлайн пополнение без комиссии']"));
        assertEquals("Онлайн пополнение без комиссии", blockTitle.getText(), "Название блока неверное");
    }

    @Test
    public void testPaymentLogos() {
        driver.get("https://www.mts.by/");
        WebElement visaLogo = driver.findElement(By.xpath("//img[contains(@src, 'visa-logo')]"));
        WebElement mastercardLogo = driver.findElement(By.xpath("//img[contains(@src, 'mastercard-logo')]"));
        assertTrue(visaLogo.isDisplayed(), "Логотип Visa отсутствует");
        assertTrue(mastercardLogo.isDisplayed(), "Логотип Mastercard отсутствует");
    }

    @Test
    public void testLinkMoreAboutService() {
        driver.get("https://www.mts.by/");
        WebElement moreLink = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        moreLink.click();
        assertTrue(driver.getCurrentUrl().contains("about-service"), "Ссылка 'Подробнее о сервисе' не работает");
    }

    @Test
    public void testFormFillingAndButtonContinue() {
        driver.get("https://www.mts.by/");
        WebElement serviceField = driver.findElement(By.id("serviceField")); // нужен id
        WebElement numberField = driver.findElement(By.id("numberField")); // нужен id
        WebElement continueButton = driver.findElement(By.xpath("//button[text()='Продолжить']")); // нужен путь

        serviceField.sendKeys("Услуги связи");
        numberField.sendKeys("297777777");
        continueButton.click();

        assertTrue(driver.getPageSource().contains("Успешно"), "Кнопка 'Продолжить' не работает корректно");
    }
}
