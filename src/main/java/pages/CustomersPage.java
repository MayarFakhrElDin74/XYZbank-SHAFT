package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class CustomersPage {

	private SHAFT.GUI.WebDriver driver ;


	public CustomersPage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By deleteBtn = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button") ;



	public void managerCanDeleteCustomer ()

	{

		driver.element().click(deleteBtn) ;
	}

}
