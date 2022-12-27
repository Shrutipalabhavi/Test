package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic{
	WebDriver driver;
	@BeforeMethod
	public void test1()
	{
	
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	driver=new FirefoxDriver();
	}
@AfterMethod
public void test2()
{
driver.close();
}


}
