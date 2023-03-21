package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonPages.BasePage;
import CommonPages.BorrowPage;
import CommonPages.ConfigFileReader;

public class BorrowCalculatorTest extends BasePage {

	@Test
	public void test1() throws IOException, InterruptedException {
		implicitWait();
		BorrowPage bpage = new BorrowPage(driver);
		configReader = new ConfigFileReader();
		driver.get(configReader.getPropertyValue("url"));
		System.out.println("Borrow Calculator Application launched succesfully");
		
		bpage.sendKeys(bpage.getanualIncomeTextFiled(), "$80,000");
		bpage.sendKeys(bpage.getotherAnualIncomeTextFiled(), "$10,000");
		bpage.sendKeys(bpage.getMonthlyLivingExpensesTextFiled(), "$500");
		bpage.sendKeys(bpage.getotherLoanTextFiled(), "$100");
		bpage.sendKeys(bpage.gettotalCreditCardLimitsTextFiled(), "$10,000");
		System.out.println("Entered all the earnings and Expenses details");
		bpage.clickOnElement(bpage.getworkOutHowMuchICouldBorrwButton());

		//Validating total estimate you could borrow
		System.out.print("total estimate is : "+bpage.getText(bpage.getborrowResult()));
		String expectedEstimate = "$415,000";
		Assert.assertEquals(bpage.getborrowResult().getText(), expectedEstimate);
		
		
		bpage.clickUsingJavaScript(bpage.getStartOverButton());
		//bpage.refreshPage();
		//Validating fields are cleared after clicking on start over
		System.out.print("fields are cleared " + bpage.getText(bpage.getborrowResult()));
		String expectedAmount = "$0";
		String ActualAmount = bpage.getborrowResult().getText();
		Assert.assertEquals(ActualAmount, expectedAmount);
	}

}
