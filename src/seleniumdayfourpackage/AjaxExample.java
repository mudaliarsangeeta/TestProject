package seleniumdayfourpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AjaxExample {
	WebDriver driver;
	WebDriverWait wait;
	String url="https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx";

	 @BeforeTest(alwaysRun=true)
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 5);
		  }
  @Test(groups="regression2")
  public void ajaxExampleTest() {
	
	  
	  By container= By.xpath("//div[@class='demo-container size-narrow']");
	  wait.until(ExpectedConditions.presenceOfElementLocated(container));
	  String textBeforeAjaxCall=driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceholder1_ctl00_ContentPlaceholder1_Label1Panel']")).getText().trim();
	  System.out.println(textBeforeAjaxCall);
	  
	  driver.findElement(By.xpath("//a[contains(text(),'27')]")).click();
	  By loader = By.xpath("//div[@class='raDiv']");
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	 WebElement selectedDates= driver.findElement(By.xpath("//span[@id='ctl00_ContentPlaceholder1_Label1']"));
	 wait.until(ExpectedConditions.visibilityOf(selectedDates));
	 String testAfterAjaxCall = selectedDates.getText();
	 String expectedTextAfterAjaxCall="Wednesday, November 27, 2019";
	 
	 Assert.assertNotEquals(textBeforeAjaxCall, testAfterAjaxCall);
	 Assert.assertEquals(testAfterAjaxCall, expectedTextAfterAjaxCall);
	 
	  }
  
  public void selectDateFromCalender(){
	  driver.findElement(By.xpath("//div[@class='optanon-alert-box-wrapper  ']")).click();
	  
	  
  }
  
  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.quit();
  }

}
