package Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generics.BaseTest;
import Pomclasses.CreateAleavetype;

public class CreateLeavetype extends BaseTest {
	public WebDriver driver;
@Test
public void leave() throws IOException
{
	CreateAleavetype leave=new CreateAleavetype(driver);
	leave.leavetype();
	
}
}
