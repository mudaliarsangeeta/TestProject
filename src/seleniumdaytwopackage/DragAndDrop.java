package seleniumdaytwopackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragAndDrop {
	WebDriver driver;
  @BeforeTest
  public void beforeTest() {System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
}

  @Test
  public void start1() {
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/droppable/default.html\"]")));
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebElement source = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	  WebElement target = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	  (new Actions(driver)).dragAndDrop(source, target).perform();
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
