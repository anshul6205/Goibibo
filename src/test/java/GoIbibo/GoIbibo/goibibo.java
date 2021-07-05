package GoIbibo.GoIbibo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibo {

		
		WebDriver driver;
		public WebDriver getchromedriver() {
	System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://goibibo.com");
    return driver;
		}
}
			