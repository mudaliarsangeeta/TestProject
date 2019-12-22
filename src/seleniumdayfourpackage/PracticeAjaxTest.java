package seleniumdayfourpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;
import java.awt.Scrollbar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class PracticeAjaxTest extends TestBaseClass {
	
	PracticeAjax obj;
	PracticeAjaxButton objButtonPage;
	
	public PracticeAjaxTest() {
		super();	}
	
	
	@BeforeTest
	  public void setUp() {
		  	initialisation();
			obj=new PracticeAjax();
			
		}
	
  @Test(priority=1)
  public void checkTitleTest() {
	  String expectedTitle="Examples and tutorials for ASP.NET | AJAX Controls Demos";
	  String actualTitle=obj.getTitlePage().trim();
	  Assert.assertEquals(actualTitle,expectedTitle);
  }
  
  @Test(priority=2)
  public void checkClickButtonTest(){
	 
	  
	  objButtonPage=obj.navigateButtonClick();
	  
	  
  }
  
  

  @AfterTest(alwaysRun=true)
  public void afterMethod() {
  driver.quit();
  }

}
