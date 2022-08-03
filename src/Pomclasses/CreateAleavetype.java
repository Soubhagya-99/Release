package Pomclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.ExcelLibrary;

public class CreateAleavetype {
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private  WebElement Menuicon;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	private  WebElement leavetype;
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private  WebElement createaleavetype;
	
	@FindBy(xpath = "//input[@id='leaveTypeLightBox_nameField']")
	private  WebElement namefield;
	
  public CreateAleavetype(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
  public void leavetype() throws IOException
  {
	 Menuicon.click();
	 leavetype.click();
	 createaleavetype.click();
	 namefield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 1));
  }
}
