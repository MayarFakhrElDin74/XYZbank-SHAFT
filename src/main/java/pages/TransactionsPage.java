package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class TransactionsPage {


	private SHAFT.GUI.WebDriver driver ;


	public TransactionsPage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By depositAmount = By.xpath("//*[@id=\"anchor0\"]/td[2]") ;
	private final By withdrawlAmount = By.xpath("//*[@id=\"anchor1\"]/td[2]") ;

	private final By backBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]") ;
	private final By resetBtn = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]") ;


	public String depositAmountTxt ()

	{
		return driver.element().getText(depositAmount) ;
	}


	public By depositAmountLocator ()

	{
		return depositAmount ;
	}


	public String withdrawlAmountTxt ()

	{
		return driver.element().getText(withdrawlAmount) ;
	}


	public By withdrawlAmountLocator ()

	{
		return withdrawlAmount ;
	}


	public void customerMustGoBackTocheckHisTransacctions ()

	{
		driver.element().click(backBtn) ;
	}


	public void customerCanResetHisTransacctions ()

	{
		driver.element().click(resetBtn) ;
	}

}
