package demo2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Generic
{
	@Test
	public void test() {
		
	System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("htts://www.amazon.com");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone14");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//span[.='Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)']")).click();
	String p_id= driver.getWindowHandle();
	
	Set<String> all_id = driver.getWindowHandles();
	all_id.remove(p_id);
	for(String id:all_id)
	{
		driver.switchTo().window(id);
		
	}
	WebElement ele = driver.findElement(By.xpath("//span[.='$788.99']"));
	String text = ele.getText();
	System.out.println(text);
	String amt=text.replaceAll(",","");
	int value=Integer.parseInt(amt);
	System.out.println(value);
	}

}
