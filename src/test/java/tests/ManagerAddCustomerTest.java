package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.AddCustomerPage;
import pages.HomePage;
import pages.ManagerHomePage;

public class ManagerAddCustomerTest extends TestBase {


	HomePage homeObject ;
	ManagerHomePage managerhomeObject ;
	AddCustomerPage addcustomerObject ;

	SHAFT.TestData.JSON addcustomerData ;



	@Test (priority = 1)

	public void managerCanAddCustomer ()

	{
		homeObject = new HomePage(driver) ;
		homeObject.goToManagerHomePage();

		managerhomeObject = new ManagerHomePage(driver) ;
		managerhomeObject.goToAddCustomerPage();

		addcustomerData = new JSON("UserData.Json") ;

		addcustomerObject = new AddCustomerPage(driver) ;
		addcustomerObject.managerFillsCustomerData
		(addcustomerData.getTestData("customerfn"), addcustomerData.getTestData("customerln"), addcustomerData.getTestData("postalcode"));

	}


}
