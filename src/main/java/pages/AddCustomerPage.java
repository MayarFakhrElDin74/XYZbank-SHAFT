package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class AddCustomerPage {

	private SHAFT.GUI.WebDriver driver ;


	public AddCustomerPage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By customerFNTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input") ;
	private final By customerLNTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input") ;
	private final By postalCodeTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input") ;
	private final By confirmAddCustomerBtn = By.cssSelector("button.btn.btn-default") ;


	public void managerFillsCustomerData (String customerfn , String customerln , String postalcode ) 

	{
		driver.element().click(customerFNTxtBox) ;
		driver.element().type(customerFNTxtBox, customerfn) ;

		driver.element().click(customerLNTxtBox) ;
		driver.element().type(customerLNTxtBox, customerln) ;

		driver.element().click(postalCodeTxtBox) ;
		driver.element().type(postalCodeTxtBox, postalcode) ;	

		driver.element().click(confirmAddCustomerBtn) ;

		driver.element().performAlertAction().getAlertText() ;
		driver.element().performAlertAction().acceptAlert() ;

	}

}
