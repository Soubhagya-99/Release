package Generics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pomclasses.Login_Page;
import Pomclasses.Logouts;

public class BaseTest implements Autoconstant {
   public WebDriver driver;
   
   @BeforeClass
   public void beforeclass()
   {
	   System.setProperty(chrome_key, chrome_value);
	   driver =new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
   }
   @BeforeMethod
   public void beforemethod() throws IOException
   {
	   Login_Page log=new Login_Page(driver);
	   log.Login();
	   
   }
   @AfterMethod
   public void aftermethod()
   {
	   Logouts l=new Logouts(driver);
	   l.Logout();
   }
}
