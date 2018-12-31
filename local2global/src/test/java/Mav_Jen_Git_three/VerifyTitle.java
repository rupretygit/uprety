package Mav_Jen_Git_three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyTitle {

	WebDriver driver;
	
	@Test
	void firstJen() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raju\\Desktop\\Mukesh\\dr\\chromedriver.exe");  		
	driver = new ChromeDriver();
	
	driver.get("http://www.learn-automation.com");
	Assert.assertTrue(driver.getTitle().contains("Selenium"));
	driver.quit();
	}
	
}
