package seleniumdayfivepackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class CalcThroughConfigProperties {
	WebDriver driver;
	WebDriverWait wait;
	String url="http://only-testing-blog.blogspot.com/2014/04/calc.html";
	Properties prop;
	FileInputStream fileIO;
	 @BeforeTest(alwaysRun=true)
	 	 @Parameters("browser")
	  public void setUp(String browser) throws IOException {
		 if(browser.equalsIgnoreCase("chrome")){
		    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();}
			
			
			prop=new Properties();
			fileIO=new FileInputStream(System.getProperty("user.dir")+"/src/seleniumdayfivepackage/configcalc.properties");
			prop.load(fileIO);
			
			driver.get(prop.getProperty("url"));
			//driver.navigate().to(url);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 5);
			
						
		  }
  @Test
  public void calc() {
	  driver.findElement(By.xpath(prop.getProperty("one"))).click();
	  driver.findElement(By.xpath(prop.getProperty("plus"))).click();
	  driver.findElement(By.xpath(prop.getProperty("five"))).click();
	  driver.findElement(By.xpath(prop.getProperty("equals"))).click();
	  String result= driver.findElement(By.xpath(prop.getProperty("result"))).getAttribute("value");
	  System.out.println(result);

	  
  }
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
