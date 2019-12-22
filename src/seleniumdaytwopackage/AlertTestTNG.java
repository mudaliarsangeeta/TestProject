package seleniumdaytwopackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertTestTNG {
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
  }
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//button[contains(text(),\"Show Me Confirmation\")]")).click();
	  Alert A1 = driver.switchTo().alert();
	 String alert1= A1.getText();
	 System.out.println(alert1);
	 A1.accept();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@value=\"Show Me Alert\"]")).click();
	 A1 = driver.switchTo().alert();
	 alert1= A1.getText();
	 System.out.println(alert1);
	 Thread.sleep(300);
	 A1.accept();
	 Thread.sleep(300);
	 driver.findElement(By.xpath("//button[contains(text(),\"Show Me Prompt\")]")).click();
	 A1 = driver.switchTo().alert();
	 alert1= A1.getText();
	 System.out.println(alert1);
	 
	 A1.sendKeys("Sangeeta Mudaliar");
	 Thread.sleep(3000);
	 A1.accept();
	 
	 driver.findElement(By.xpath("//a[contains(@href,\"http://only-testing-blog.blogspot.in\")]")).click();
	 
	 
  }
  @AfterTest
  public void afterTest() {
  }

}
