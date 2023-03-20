package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class YourNamePage {


	SHAFT.GUI.WebDriver driver ;


	public YourNamePage (SHAFT.GUI.WebDriver driver)

	{
		this.driver = driver ;
	}


	private final By loginBtn = By.cssSelector("button.btn.btn-default") ;
	private final By urNameLbl = By.xpath("/html/body/div/div/div[2]/div/form/div/label") ;

	private final By urNameList = By.xpath("//*[@id=\"userSelect\"]") ;



	public void customerCanLogin ()

	{
		driver.element().select(urNameList, "Harry Potter");
		driver.element().click(loginBtn) ;
	}


	public String urnamelbltxt ()

	{
		return driver.element().getText(urNameLbl) ;
	}

	public By urNameLblLocator ()

	{
		return urNameLbl ;
	}
}
