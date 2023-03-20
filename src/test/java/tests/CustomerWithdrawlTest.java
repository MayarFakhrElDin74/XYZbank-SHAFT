package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.LoggedinCustomerHomePage;
import pages.YourNamePage;

public class CustomerWithdrawlTest extends TestBase {


	HomePage homeObject ;
	YourNamePage yournameObject ;
	LoggedinCustomerHomePage loggedincustomerObject ;

	SHAFT.TestData.JSON depositData ;
	SHAFT.TestData.JSON withdrawlData ;


	@Test (priority = 1)

	public void customerCanLogin () 

	{

		homeObject = new HomePage(driver);
		homeObject.goToCustomerLoginPage();

		yournameObject = new YourNamePage(driver) ;
		yournameObject.customerCanLogin();

		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		driver.assertThat().element(loggedincustomerObject.welcomeLblLocator()).text().contains("Welcome").perform();
		
	}

	

	@Test (priority = 2)

	public void customerCanDeposit ()

	{
		depositData = new JSON("UserData.json");

		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		loggedincustomerObject.customerCanDeposit(depositData.getTestData("depositamount")) ;

		driver.assertThat().element
		(loggedincustomerObject.successfulDepositMsgLocator()).text().contains("Deposit Successful").perform();

	}



	@Test (priority = 3)

	public void customerCanWithdrawl () 

	{
		withdrawlData = new JSON("UserData.json");

		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		loggedincustomerObject.customerCanWithdrawl(withdrawlData.getTestData("withdrawlamount"));

		driver.assertThat().element
		(loggedincustomerObject.successfulWithdrawlMsgLocator()).text().contains("Transaction successful") ;

	}


}
