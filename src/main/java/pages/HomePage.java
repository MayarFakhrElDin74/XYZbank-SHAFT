package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HomePage {


	private SHAFT.GUI.WebDriver driver ;


	public HomePage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}



	private final By customerLoginBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button") ;

	private final By managerLoginBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button") ;




	public void goToCustomerLoginPage ()

	{
		driver.element().click(customerLoginBtn) ;
	}



	public void goToManagerHomePage ()

	{
		driver.element().click(managerLoginBtn) ;
	}



}
