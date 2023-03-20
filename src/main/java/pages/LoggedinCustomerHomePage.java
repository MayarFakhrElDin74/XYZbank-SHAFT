package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class LoggedinCustomerHomePage {


	SHAFT.GUI.WebDriver driver ;


	public LoggedinCustomerHomePage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By logoutBtn = By.xpath("/html/body/div/div/div[1]/button[2]") ;
	private final By welcomeLbl = By.xpath("/html/body/div/div/div[2]/div/div[1]/strong") ;

	private final By depositBtn = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
	private final By depositAmountTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input") ;
	private final By confirmDepositBtn = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button") ;

	private final By successfulDepositMsg = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/span") ;

	private final By withdrawlBtn = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]") ;
	private final By withdrawlAmountTxtBox = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input") ;
	private final By confirmWithdrawlBtn = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button") ;

	private final By successfulWithdrawlMsg = By.cssSelector("span.error.ng-binding") ;

	private final By transacctionsBtn = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]") ;




	public String welcomelbltxt ()

	{
		return driver.element().getText(welcomeLbl) ;

	}


	public By welcomeLblLocator ()

	{
		return welcomeLbl ;
	}


	public void customerCanLogout ()

	{
		driver.element().click(logoutBtn) ;
	}


	public void customerCanDeposit (String depositamount)

	{
		driver.element().click(depositBtn) ;
		driver.element().type(depositAmountTxtBox, depositamount) ;
		driver.element().click(confirmDepositBtn) ;	

	}


	public String successfuldepositmsgtxt ()
	{
		return driver.element().getText(successfulDepositMsg);
	}


	public By successfulDepositMsgLocator ()

	{
		return successfulDepositMsg ;
	}


	public void customerCanWithdrawl (String withdrawlamount)

	{
		driver.element().click(withdrawlBtn) ;
		driver.element().type(withdrawlAmountTxtBox, withdrawlamount) ;
		driver.element().click(confirmWithdrawlBtn) ;	
	}


	public String withdrawlsuccessfulmsgtxt ()

	{
		return driver.element().getText(successfulWithdrawlMsg) ;
	}


	public By successfulWithdrawlMsgLocator ()

	{
		return successfulWithdrawlMsg ;
	}


	public void goToTransacctionsPage ()

	{
		driver.element().click(transacctionsBtn) ;
	}

}
