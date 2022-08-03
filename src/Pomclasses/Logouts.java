package Pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logouts {
	public WebDriver driver;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public Logouts(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public void Logout()
	{
		logoutLink.click();
	}
	
}

