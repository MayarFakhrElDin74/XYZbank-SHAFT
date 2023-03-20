package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ManagerHomePage {


	private SHAFT.GUI.WebDriver driver ;


	public ManagerHomePage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By addCustomerBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]") ;
	private final By openAccountBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]") ;
	private final By customersBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]") ;



	public void goToAddCustomerPage ()

	{
		driver.element().click(addCustomerBtn) ;
	}

	public void goToOpenAccountPage ()

	{
		driver.element().click(openAccountBtn) ;
	}


	public void goToCustomersPage ()

	{
		driver.element().click(customersBtn) ;
	}

}
