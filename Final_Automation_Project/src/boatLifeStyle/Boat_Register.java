package boatLifeStyle;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Boat_Register {
 
  WebDriver driver;
  
	
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\samee\\OneDrive\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
	  	ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
	  //driver=new ChromeDriver();  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }
  
  @Test
  public void boat_Register() throws Exception
  {
	  driver.get("https://www.boat-lifestyle.com/account/login");
	  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[5]/div/div[2]/span[1]/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"customer_login_link\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"customer_register_link\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("srivalli");
	  driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("pusapati");
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("srivallipusapti@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sri@123");
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
	  Thread.sleep(2000);
	  
	  
  }
 

  @AfterTest
  public void afterTest() 
  {
	  //driver.close();
  }

}
