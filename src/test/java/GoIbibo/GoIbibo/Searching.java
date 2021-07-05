package GoIbibo.GoIbibo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Searching extends goibibo {


		
		WebDriver driver;
		
	  @Test
	  public void testForGoibibo() throws Throwable  {
		  
	  driver.findElement(By.xpath(Xpath.trip)).click();
		  
	ExcelUtils.setPath();



	String start=ExcelUtils.cellvalue(0,0);
	System.out.println(start);

	String desti=ExcelUtils.cellvalue(0,1);
	System.out.println(desti);
		 
		  WebElement we1 = driver.findElement(By.xpath(Xpath.from));
		  we1.sendKeys(start);
		  Thread.sleep(4000);
		  we1.sendKeys(Keys.ARROW_DOWN);
		  we1.sendKeys(Keys.ENTER);	  
		  WebElement we2 = driver.findElement(By.xpath(Xpath.destination));
		  we2.sendKeys(desti);
		  Thread.sleep(4000);
		  we2.sendKeys(Keys.ARROW_DOWN);
		  we2.sendKeys(Keys.ENTER);
		  WebElement we3 = driver.findElement(By.xpath(Xpath.departure));
		  we3.click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("fare_20210714")).click();		  
		  WebElement we4 = driver.findElement(By.xpath(Xpath.ret));
		  we4.click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("fare_20210720")).click();	  
		  driver.findElement(By.xpath(Xpath.search)).click();
		  Thread.sleep(10000);
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		
		 // System.out.println("Booking details");
		  driver = getchromedriver();
	  }
	@AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

	


}


