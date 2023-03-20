package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoggedinCustomerHomePage;
import pages.YourNamePage;

public class CustomerLoginAndLogoutTest extends TestBase {


	HomePage homeObject ;
	YourNamePage yournameObject ;
	LoggedinCustomerHomePage loggedincustomerObject ;



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


	public void CustomerCanLogout ()

	{
		loggedincustomerObject = new LoggedinCustomerHomePage(driver) ;
		loggedincustomerObject.customerCanLogout();

		yournameObject = new YourNamePage(driver) ;
		driver.assertThat().element(yournameObject.urNameLblLocator()).text().isEqualTo("Your Name :") ;

	}

}
