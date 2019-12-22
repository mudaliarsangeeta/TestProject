package seleniumdaytwopackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNGDemo {
	WebDriver driver;
 
  @BeforeTest
  public void setUp() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://openwritings.net/sites/default/files/selenium-test-pages/radio_checkbox.html");
		Thread.sleep(3000);
	  
  }
  @Test
  public void radioButton() {
	  driver.findElement(By.xpath("//input[@value=\"Mon\"]")).click();
	  
	  driver.findElement(By.xpath("//input[@name=\"apple\"]")).click();
	  
	  driver.findElement(By.xpath("//input[@name=\"orange\"]")).click();
	  
	  
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
