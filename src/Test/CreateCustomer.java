package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generics.BaseTest;
import Pomclasses.CreateAcustomer;

public class CreateCustomer extends BaseTest {
public WebDriver driver;
	@Test
	public void Customer() throws IOException, InterruptedException
	{
		CreateAcustomer create=new CreateAcustomer(driver);
		create.CREATEacustomer();
	}
	}