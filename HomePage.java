public class HomePage {

    private final WebDriver driver;

    @FindBy(xpath = "//h2[contains(text(), 'Онлайн пополнение без комиссии')]")
    private WebElement replenishmentBlock;

    @FindBy(linkText = "Подробнее о сервисе")
    private WebElement moreInfoLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getBlockTitle() {
        return replenishmentBlock.getText();
    }

    public void openMoreInfo() {
        moreInfoLink.click();
    }

    public PaymentPage navigateToPaymentPage() {
        driver.get("https://www.mts.by/payments");
        return new PaymentPage(driver);
    }
}