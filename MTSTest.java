public class MTSTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
    }

    @AfterClass
    public static void tearDown() throws Exception {
        if(driver != null){
            driver.quit();
        }
    }

    @Test
    public void testBlockTitle() {
        driver.get("https://www.mts.by/");
        String titleText = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение без комиссии')]")).getText();
        assertEquals("Название блока неверное", "Онлайн пополнение без комиссии", titleText);
    }

    @Test
    public void testPaymentSystemLogos() {
        driver.get("https://www.mts.by/");
        int logoCount = driver.findElements(By.className("payment-system-logo")).size();
        assertTrue("Логотипы платежных систем отсутствуют", logoCount > 0);
    }

    @Test
    public void testLinkMoreDetails() {
        driver.get("https://www.mts.by/");
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue("Ссылка не сработала", currentUrl.contains("/more-details"));
    }

    @Test
    public void testFormSubmission() {
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("service-type-radio")).click();
        driver.findElement(By.name("phone-number-input")).sendKeys("297777777"); 
        driver.findElement(By.cssSelector(".continue-btn")).click(); 
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean isSuccessMessageDisplayed = driver.findElement(By.className("success-message")).isDisplayed();
        assertTrue("Форма не была отправлена успешно", isSuccessMessageDisplayed);
    }
}