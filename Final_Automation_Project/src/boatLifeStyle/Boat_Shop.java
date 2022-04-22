package boatLifeStyle;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Boat_Shop {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\samee\\OneDrive\\Documents\\Automation testing\\Browser Extension\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		// driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void boat_Login() throws Exception 
	{
		driver.get("https://www.boat-lifestyle.com/account/login");
		Thread.sleep(2000);

		// Login Page
		driver.findElement(By.xpath("//*[@id=\"customer_email\"]")).sendKeys("neeha@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"customer_password\"]")).sendKeys("sri@123");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		Thread.sleep(2000);

	}
	
		@Test(priority = 2)
		public void boat_smokeTesting() throws InterruptedException 
		{
		//Create object of action class
			Actions a=new Actions(driver);
			
			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li"));		
			
			int listsize=ls.size();
			System.out.println("No. of Modules:"+listsize);
			
			//for loop
			for(int i=1;i<=listsize;i++)
			{
				//wait
				Thread.sleep(2000);
				
				//Display modulename
				
				System.out.println(driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li["+i+"]")).getText());
				
				//perform MouseHover
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li["+i+"]"))).click().perform();
				
				Thread.sleep(2000);
			}
		}

	
	
	  @Test(priority=3) public void boat_Shop() throws Exception 
	 	{ 
	  //Shop Module
	  driver.findElement(By.className("has-children")).click();
	  System.out.println("Title of the Page:"+driver.getTitle());
	   driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[1]/ul/li[2]/a/img")).click();
	   Thread.sleep(2000);
	  
	  //Ear Phones Add to Cart 
	   driver.findElement(By.xpath("//*[@id=\"product_form_4360485437538\"]/div[2]/div/input")).click(); 
	   Thread.sleep(2000);

	   driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[5]/div/div[3]/a/img")).click();
	   driver.findElement(By.xpath("//*[@id=\"my\"]/button/span/span[1]")).click();
	   Thread.sleep(2000);
	   
	   }
	 
	 
	 // Daily Deals it was passed previously now the module has been removed from the website because of some upgradation so I kept in comment
	 
	// @Test
	// public void boat_DailyDeals() throws Exception
	// {

	// driver.findElement(By.linkText("Daily Deals")).click();
	// System.out.println("Title of the Page:"+driver.getTitle());
	// Thread.sleep(2000);

	// Item Add to cart
	// driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[6]/div[1]/div[1]/div/div/form/div[2]/div/input")).click();
	// Thread.sleep(2000);

	// }

	  //As it is a live website so some of the modules xpath is changing frequently i tested all are passed again next it is changing
		@Test(priority = 4)
	  public void boat_Sailwithboat() throws Exception 
	  {
		driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[2]")).click();
		System.out.println("Title of the Page:" + driver.getTitle());
		Thread.sleep(2000);
		
		//Add item to cart
		driver.findElement(By.xpath("//*[@id=\"product_form_6598370656354\"]/div[2]/div/input")).click();
		Thread.sleep(2000);
		}
	
	  @Test(priority=5) public void boat_Gifting() throws Exception 
	  {
		  //More
	  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/a")).click();
	  System.out.println("Title of the Page:"+driver.getTitle());
	  Thread.sleep(2000);
	  //Gifting
	  driver.findElement(By.xpath("//span[@class='menu-item']")).click();
	  System.out.println("Title of the Page:"+driver.getTitle());
	  Thread.sleep(2000);
	  
	  //Airdopes Add to Cart 
	  driver.findElement(By.xpath("//*[@id=\"product_form_4460669370466\"]/div[2]/div/input")).click();
	  Thread.sleep(2000);
	    }
	  
	  
	 @Test(priority=6) 
	  public void boat_OfferZone() throws Exception 
	 {
	  //More->Offer Zone
	  
		 driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/a")).click();
		  
		  Thread.sleep(2000);
	  
	  //Offer Zone 
		  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/ul/li[2]/a/span")).click();
		  System.out.println("Title of the Page:"+driver.getTitle());
		  
		  driver.findElement(By.xpath("//*[@id=\"shopify-section-collection-offers\"]/div[1]/div[4]/div[2]/div/div/div/div[1]/div/div[2]/div[3]/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"rewards\"]/div/div/div[1]/button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"product_form_4460669370466\"]/div[2]/div/input")).click();
		  Thread.sleep(2000);
	 	}
	  
	  
	  @Test(priority=7) public void boat_WhatfloatsYourBoat() throws Exception 
	  {
	  
		//More->What floats Your Boat 
		  
		  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/a")).click();
		  Thread.sleep(2000);
		//What floats Your Boat 
	  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/ul/li[3]/a/span")).click();
	  System.out.println("Title of the Page:"+driver.getTitle());
	  Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div[1]/a/img")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/div[1]/div[4]/div[3]/div/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"shopify-section-1614762908ddf4a2a2\"]/div/div/div[2]/div/div/div/div[1]/div/a/div[2]/div/div/div[6]/p[1]")).click();
	  Thread.sleep(2000);
	   }
	  
		
		  @Test(priority=8) public void boat_MeettheBoatHeads() throws Exception 
		  {
		  //Meet the BoatHeads
		  
		  //More 
		  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/ul/li[4]/a/span")).click();
		  System.out.println("Title of the Page:"+driver.getTitle());
		  driver.findElement(By.xpath( "//*[@id=\"content\"]/div/div/div[2]/div/a[1]/img")).click();
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//*[@id=\"product_form_2159091417186\"]/div[2]/div/input")).click();
		  Thread.sleep(2000);
		  }  
		 
		  @Test(priority=9) public void boat_Earn100() throws Exception 
		  { 
			//Earn Rs.100
		  //more 
			  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/a")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[2]/ul/li[3]/ul/li[5]/a/span")).click();
			  System.out.println("Title of the Page:"+driver.getTitle());
			  Thread.sleep(2000);
		  		}
		 
		 @Test(priority=10) public void boat_Searchbox() throws Exception
		    { 
			  //Search Box
		  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[3]/input")).sendKeys("Wireless Earphones");
		  
		 driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[3]/input")).sendKeys(Keys.ENTER);
		  System.out.println("Title of the Page:"+driver.getTitle());
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"searchModal\"]/div/div[1]/div[2]/div/div[2]/div[3]/div[1]/div/div[1]/div/div/div/a/img[1]")).click(); Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"31798262038626\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"sticky_add_to_cart\"]")).click();
		   }
		 
		  @Test(priority=11) public void boat_GiftCard() throws Exception
		    {
		  
		  //Gift Card
		 driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[5]/div/div[1]/a/img")).click();
		  System.out.println("Parent Window Title"+driver.getTitle());
		  driver.findElement(By.xpath("//*[@id=\"32019880444002\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"BIS_trigger\"]")).click();
		  System.out.println("Title of the Page:"+driver.getTitle());
		  Thread.sleep(2000);
		  
		// It will return the parent window name as a String
		  String parent=driver.getWindowHandle();

		  Set<String>s=driver.getWindowHandles();
		  
		// Now iterate using Iterator
		  Iterator<String> I1= s.iterator();

		 while(I1.hasNext())
		 {

		  String child_window=I1.next();


		  if(!parent.equals(child_window))
		  {
			  driver.switchTo().window(child_window);

			  System.out.println(driver.switchTo().window(child_window).getTitle());

			  driver.close();
		  	}
		  	//switch to the parent window
		  	driver.switchTo().window(parent);
		 	}
		  }
		
		@Test(priority=12) public void boat_ManageYourOrder() throws Exception
		  { 
			 //MyAccount->Manage your Order 
			  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[5]/div/div[2]/span[1]/img")).click();
			  Thread.sleep(2000);
		  driver.findElement(By.linkText("Manage Your Order")).click();
		  System.out.println("Title of the Page:"+driver.getTitle());
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a")).click();
		  Thread.sleep(2000);
		  }
		  
		 @Test(priority=13) public void boat_MyAccount() throws Exception 
		 { 
			 //Your Account 
			 driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[5]/div/div[2]/span[1]/img")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.linkText("Your Account")).click();
			 System.out.println("Title of the Page:"+driver.getTitle());
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"return_to_store\"]/a")).click();
			 Thread.sleep(2000);
			  }
	
			@Test(priority=14)
			public void boat_ServiceCenter() throws InterruptedException
			{
		   driver.findElement(By.xpath("//*[@id=\"menu-tier-2\"]/ul/li[4]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div[1]/div/div[5]/p")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div[1]/div/div[5]/div/a[2]")).click();
			Thread.sleep(2000);

			}
		   @Test(priority=15)
		   public void boat_Waranty() throws InterruptedException
		   {
			  
			 //How to scroll
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//Scroll To Bottom
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/div[1]/div[4]/div[3]/div/span")).click();
			  //	 Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/div[1]/div[2]/div[1]/div[2]/div[2]/div/div/ul/li/ul/li[2]/a")).click();
				Thread.sleep(2000);
		   }
		   
		   @Test(priority=16)
		   public void boat_ReturnPolicy() throws InterruptedException
		   {
			   driver.findElement(By.xpath("//*[@id=\"menu-tier-2\"]/ul/li[3]")).click();
				Thread.sleep(2000);

		   }	  
			
		  @Test(priority=17) 
		  public void boat_Logout() throws Exception 
		  {
		  //logout 
			  driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[2]/div[5]/div/div[2]/span[1]/img")).click(); 
		  System.out.println("Title of the Page:"+driver.getTitle()); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"customer_logout_link\"]")).click();
		  Thread.sleep(2000);
		 }
		
		  @AfterTest public void afterTest() 
		  { 
		  driver.close(); 
		  }
		 		 
}
		    
		  
