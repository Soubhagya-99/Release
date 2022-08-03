package Pomclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.ExcelLibrary;

public class Login_Page {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement  keepLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement toPasswordRecoveryPageLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actiTIMEinc;
	
public Login_Page(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public void Login() throws IOException
{
	usernameTextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 0));
	passwordTextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 1 ));
	keepLoggedInCheckBox.click();
	loginButton.click();
}

public void forgotpassword() {
	toPasswordRecoveryPageLink.click();
}
public void Actitimeinc()
{
	actiTIMEinc.click();
}
}
