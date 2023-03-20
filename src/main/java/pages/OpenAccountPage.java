package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class OpenAccountPage {


	private SHAFT.GUI.WebDriver driver ;


	public OpenAccountPage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}



	private final By processBtn = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button") ;



	public void managerOpenAccount ()

	{	
		By customerNameList = By.xpath("//*[@id=\"userSelect\"]") ;
		driver.element().select(customerNameList, "Harry Potter") ;	

		By currencyList = By.xpath("//*[@id=\"currency\"]") ;
		driver.element().select(currencyList, "Dollar") ;

		driver.element().click(processBtn) ;

		driver.element().performAlertAction().getAlertText() ;
		driver.element().performAlertAction().acceptAlert() ;

	}

}
