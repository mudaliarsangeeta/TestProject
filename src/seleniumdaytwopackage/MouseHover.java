package seleniumdaytwopackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class MouseHover {
	
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/p/mouse-hover.html");
	}

  public void mouseHoverMethod(String xpath2) {
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),\"Search Engine\")]"))).moveToElement(driver.findElement(By.xpath(xpath2))).click().perform();
  
	  
  }
  @Test
  public void actionPerform(){
	  //String mainWindow = driver.getWindowHandle();
	  mouseHoverMethod("//a[@href=\"http://www.google.com/\"]");
	  WebDriverWait wait = new WebDriverWait(driver, 25);
	  
	  wait.until(ExpectedConditions.titleContains("Google"));
	  
	  
	  driver.navigate().back();
	  
	  mouseHoverMethod("//a[@href=\"http://www.yahoo.com/\"]");
	  wait = new WebDriverWait(driver, 25);
	  
	  wait.until(ExpectedConditions.titleContains("Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment"));
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
