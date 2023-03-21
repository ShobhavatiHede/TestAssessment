package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonPages.BasePage;
import CommonPages.BorrowPage;
import CommonPages.ConfigFileReader;

public class BorrowCalculatorNagativeTest extends BasePage {

	@Test
	public void testErrorMessage() throws IOException, InterruptedException {
		configReader = new ConfigFileReader();
		driver.get(configReader.getPropertyValue("url"));
		System.out.println("Borrow Calculator Application launched succesfully");

		BorrowPage bpage = new BorrowPage(driver);
		bpage.sendKeys(bpage.getMonthlyLivingExpensesTextFiled(), "$1");
		System.out.println("Entered living expenses as $1 leaving other fields with $0");

		bpage.clickOnElement(bpage.getworkOutHowMuchICouldBorrwButton());
		System.out.println("Clicked on How much could I borrow button");

		// Validating error message
		String expectedErrorMessage = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
		String ActualErrorMessage = bpage.getborrowErrorText().getText();
		Assert.assertEquals(expectedErrorMessage, ActualErrorMessage);
		System.out.println("Test case passed");
	}

}
