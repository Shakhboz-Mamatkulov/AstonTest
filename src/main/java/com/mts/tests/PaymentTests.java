package com.mts.tests;

import com.mts.pages.HomePage;
import com.mts.pages.PaymentPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentTests {

    private WebDriver driver;
    private HomePage homePage;
    private PaymentPage paymentPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mts.by"); // URL сайта

        homePage = new HomePage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @Test
    public void testCheckPlaceholders() {
        // Проверка надписей в незаполненных полях на главной странице
        homePage.checkPlaceholders();
    }

    @Test
    public void testPaymentDetails() {
        // Выбираем вариант "Услуги связи"
        homePage.getMobileServicesOption().click();

        // Переход к следующей странице и проверка данных
        paymentPage.checkPaymentDetails();
    }

    @Test
    public void testNextButton() {
        // Заполняем данные и нажимаем кнопку "Продолжить"
        homePage.getMobileServicesOption().click();
        paymentPage.clickNext();
        paymentPage.checkPaymentDetails();
    }

    @After
    public void tearDown() {
        // Закрытие браузера после тестов
        driver.quit();
    }
}
