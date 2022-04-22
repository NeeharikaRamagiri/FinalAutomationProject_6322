package boatLifeStyle;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Shop_DataDriven 
{
	WebDriver driver;
		  
			@BeforeTest
			public void beforeTest() throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\samee\\OneDrive\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
				ChromeOptions options= new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver=new ChromeDriver(options);
				 Thread.sleep(2000);
				 driver.manage().window().maximize();
			}
			
			@Test(dataProvider = "dp1")
			public void shop_DDT(String username, String password) throws Exception 
			{
				
				Boat_POM o=new Boat_POM();
				
				o.url(driver);
				o.userName(driver, username);
				o.passWord(driver, password);
				o.loginButton(driver);
				Thread.sleep(2000);
				o.myAccount(driver);
				Thread.sleep(2000);
				o.logOut(driver);
			}
			
			@DataProvider
			public Object[][] dp1() {
			return new Object[][] {
			new Object[] { "neeha@gmail.com", "sri@123" },
			new Object[] { "srivallipusapati@gmail.com", "Sri@123" },
			new Object[] { "ramagirineeharika@gmail.com", "sairam@123" },
			};
			}
 

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
