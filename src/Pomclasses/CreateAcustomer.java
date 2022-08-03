package Pomclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.ExcelLibrary;

public class CreateAcustomer {
public WebDriver driver;
	@FindBy(xpath = "//div[@id='container_tasks']")
	private  WebElement task;
	
	@FindBy(xpath = "//div[@class='addNewButton']")
	private  WebElement Addnew;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private  WebElement AddnewCustomer;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//input[@placeholder='Enter Customer Name']")
	private  WebElement entername;
	
	@FindBy(xpath = "//span[@id='ext-gen1_titlePlaceholder']/../../../../../..//textarea[@placeholder='Enter Customer Description']")
	private  WebElement button;
	public CreateAcustomer(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public void CREATEacustomer() throws IOException, InterruptedException
	{
		task.click();
		Addnew.click();
		Thread.sleep(2000);
		AddnewCustomer.click();
		entername.sendKeys(ExcelLibrary.getcellvalue("Logindata", 1, 1));
		button.click();
		
	}
}
