
public class PaymentPage {

    private final WebDriver driver;

    @FindBy(xpath = "//label[@for='communication']")
    private WebElement communicationServiceLabel;

    @FindBy(xpath = "//label[@for='internet']")
    private WebElement internetServiceLabel;

    @FindBy(xpath = "//label[@for='installment']")
    private WebElement installmentServiceLabel;

    @FindBy(xpath = "//label[@for='arrears']")
    private WebElement arrearsServiceLabel;

    @FindBy(name = "phone-number-input")
    private WebElement phoneNumberInput;

    @FindBy(id = "continue-btn")
    private WebElement continueButton;

    @FindBy(className = "payment-system-logos")
    private List<WebElement> paymentSystemLogos;

    @FindBy(className = "empty-field-holder")
    private List<WebElement> emptyFieldHolders;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectServiceType(String type) {
        switch (type) {
            case "Услуги связи":
                communicationServiceLabel.click();
                break;
            case "Интернет":
                internetServiceLabel.click();
                break;
            case "Рассрочка":
                installmentServiceLabel.click();
                break;
            case "Задолженность":
                arrearsServiceLabel.click();
                break;
            default:
                throw new IllegalStateException("Тип услуги не найден");
        }
    }

    public void fillPhoneNumber(String number) {
        phoneNumberInput.sendKeys(number);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public List<String> getEmptyFieldPlaceholders() {
        return emptyFieldHolders.stream().map(WebElement::getText).toList();
    }

    public boolean hasPaymentSystemLogos() {
        return !paymentSystemLogos.isEmpty();
    }

    public String getPhoneNumberFromSummary() {
        return driver.findElementByClassName("phone-number-summary").getText();
    }

    public String getTotalAmountFromSummary() {
        return driver.findElementByClassName("total-amount-summary").getText();
    }
}