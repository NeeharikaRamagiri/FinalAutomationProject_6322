package boatLifeStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Boat_POM 
{
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver) 
	{
		driver.get("https://www.boat-lifestyle.com/account/login");
		  
	}
	public void userName(WebDriver driver,String usn)
	{
		 driver.findElement(By.xpath("//*[@id=\"customer_email\"]")).sendKeys(usn);
	}
	
	public void passWord(WebDriver driver,String pwd)
	{
		 driver.findElement(By.xpath("//*[@id=\"customer_password\"]")).sendKeys(pwd);
	}
	public void loginButton(WebDriver driver)
	{
		 driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}
	public void myAccount(WebDriver driver)
	{
		 driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[5]/div/div[2]/span[1]/img")).click();
	}
		
		//Logout
	public void logOut(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"customer_logout_link\"]")).click();
	}
	
	public void closeBrowser(WebDriver driver)
	{
		driver.close();
	}
	

}
