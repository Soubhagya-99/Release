package Pomclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BasePage;
import Generics.ExcelLibrary;

public class CreateArchivedwork extends BasePage
{
	public WebDriver driver;
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private  WebElement Menuicon;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private  WebElement typesofwork;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private  WebElement createtypesofwork;
	
	@FindBy(id="name")
	private  WebElement Inputname;
	
	@FindBy(xpath = "//select[@name='active']")
	private WebElement List;
	
	public CreateArchivedwork(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void Archivework() throws IOException, InterruptedException
	{
		Menuicon.click();
		Thread.sleep(2000);
		typesofwork.click();
		Thread.sleep(2000);
		createtypesofwork.click();
		Thread.sleep(2000);
		Inputname.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 1));
		selectbyvisibletext(List, "archived");
	}
	
}
