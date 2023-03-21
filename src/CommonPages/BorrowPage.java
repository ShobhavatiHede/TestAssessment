package CommonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BorrowPage extends BasePage {

	WebDriver driver;

	public BorrowPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='expenses']")
	private WebElement monthlyLivingExpensesTextFiled;

	@FindBy(xpath = "//input[@aria-labelledby='q2q1']")
	private WebElement anualIncomeTextFiled;

	@FindBy(xpath = "//*[@id='homeloans']")
	private WebElement homeLoanTextFiled;

	@FindBy(xpath = "//*[@id=\"otherloans\"]\r\n" + "	")
	private WebElement otherLoanTextFiled;

	@FindBy(xpath = "//input[@aria-describedby=\"q3q4i1 q3q4i2\"]")
	private WebElement otherMonthlyIncomeTextFiled;

	@FindBy(xpath = "//input[@aria-labelledby=\"q2q2\"]")
	private WebElement otherAnualIncomeTextFiled;

	@FindBy(xpath = "//*[@id=\"credit\"]")
	private WebElement totalCreditCardLimitsTextFiled;

	@FindBy(xpath = "//button[contains(text(),'Start over')]")
	private WebElement startOverButton;
	//// button[@class='start-over']/parent::div[@class='result__restart']

	@FindBy(xpath = "//button[@id=\"btnBorrowCalculater\"]")
	private WebElement workOutHowMuchICouldBorrwButton;

	@FindBy(xpath = "//span[@id='borrowResultTextAmount']")
	private WebElement borrowResult;

	@FindBy(xpath = "//div[@class=\"borrow__error__text\"]")
	private WebElement borrowErrorText;

	public WebElement getMonthlyLivingExpensesTextFiled() {
		return monthlyLivingExpensesTextFiled;
	}

	public WebElement getanualIncomeTextFiled() {
		return anualIncomeTextFiled;
	}

	public WebElement gethomeLoanTextFiled() {
		return homeLoanTextFiled;
	}

	public WebElement getotherLoanTextFiled() {
		return otherLoanTextFiled;
	}

	public WebElement getotherMonthlyIncomeTextFiled() {
		return otherMonthlyIncomeTextFiled;
	}

	public WebElement gettotalCreditCardLimitsTextFiled() {
		return totalCreditCardLimitsTextFiled;
	}

	public WebElement getStartOverButton() {
		return startOverButton;
	}

	public WebElement getworkOutHowMuchICouldBorrwButton() {
		return workOutHowMuchICouldBorrwButton;
	}

	public WebElement getotherAnualIncomeTextFiled() {
		return otherAnualIncomeTextFiled;
	}

	public WebElement getborrowResult() {
		return borrowResult;
	}

	public WebElement getborrowErrorText() {
		return borrowErrorText;
	}

	public void sendKeys(WebElement element, String input) {
		element.sendKeys(input);
	}

	public void clickOnElement(WebElement element) {
		element.click();
	}

	public String getText(WebElement element) {
		return element.getText();
	}
}