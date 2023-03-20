package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.LoggedinCustomerHomePage;
import pages.YourNamePage;

public class CustomerDepositTest extends TestBase {


	HomePage homeObject ;
	YourNamePage yournameObject ;
	LoggedinCustomerHomePage loggedincustomerObject ;

	SHAFT.TestData.JSON depositData ;



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
		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;

		depositData = new JSON("UserData.json");
		loggedincustomerObject.customerCanDeposit(depositData.getTestData("depositamount"));

		driver.assertThat().element(loggedincustomerObject.successfulDepositMsgLocator()).text().contains("Deposit Successful") ;

	}


}
