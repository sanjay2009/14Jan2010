package gitTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_projects\\GitTest\\driver1\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
	}
	
	@Test
	public void login() 
	{
		driver.findElement(By.id("identifierId")).sendKeys("selenium.test1908@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Hitha@2009");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
				
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
	