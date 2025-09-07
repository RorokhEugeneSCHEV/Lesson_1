package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.PaymentPage;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MTSTests {

    private static WebDriver driver;
    private static HomePage homePage;
    private static PaymentPage paymentPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        paymentPage = homePage.navigateToPaymentPage();
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testEmptyFieldPlaceholders() {
        List<String> expectedPlaceholders = List.of("Номер телефона", "Адрес подключения", "ФИО клиента", "Код плательщика");

        paymentPage.selectServiceType("Услуги связи");
        assertEquals(expectedPlaceholders, paymentPage.getEmptyFieldPlaceholders());

        paymentPage.selectServiceType("Интернет");
        assertEquals(expectedPlaceholders, paymentPage.getEmptyFieldPlaceholders());

        paymentPage.selectServiceType("Рассрочка");
        assertEquals(expectedPlaceholders, paymentPage.getEmptyFieldPlaceholders());

        paymentPage.selectServiceType("Задолженность");
        assertEquals(expectedPlaceholders, paymentPage.getEmptyFieldPlaceholders());
    }

    @Test
    public void testPaymentFlowForCommunicationServices() {
        paymentPage.selectServiceType("Услуги связи");
        paymentPage.fillPhoneNumber("297777777");
        paymentPage.clickContinue();

        assertEquals("297777777", paymentPage.getPhoneNumberFromSummary());
        assertEquals("Сумма пополнения: 10 бел. рублей", paymentPage.getTotalAmountFromSummary());

        assertTrue(paymentPage.hasPaymentSystemLogos());

        List<String> expectedCardPlaceholders = List.of("Номер карты", "Срок действия", "CVV-код");
        assertEquals(expectedCardPlaceholders, paymentPage.getEmptyFieldPlaceholders());
    }
}