package seleniumdaythreepackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PracticeTest {
	WebDriver driver;
	WebDriverWait wait;
	String url="https://jqueryui.com/autocomplete/";
	PracticeAuto objAuto;
 
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to(url);
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	  driver.manage().window().maximize();
	  wait=new WebDriverWait(driver, 5);
  }
  
  @Test
  public void practiceTestAutoComplete() {
	 objAuto =new PracticeAuto(driver);
	 
	 Assert.assertTrue(objAuto.pageTitle().contains("Autocomplete | jQuery UI"));
	 objAuto.swithToFrame();
	 wait.equals(ExpectedConditions.visibilityOf(objAuto.textBox));
	 objAuto.textBoxEntry("a");
	 objAuto.selectOptionFromAutoComplete("basic");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
