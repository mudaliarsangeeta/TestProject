package seleniumdaytwopackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class PracticeNov4 {
	WebDriver driver;
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	  
  }
  @Test
  public void NovemberFourth() {
	
	  WebElement e=driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
	  Select option = new Select(e);
	  option.selectByVisibleText("Grape");
	  
	  option.selectByValue("apple");
	  
	  System.out.println("finish");
	  
	java.util.List<WebElement> fruitlist = option.getAllSelectedOptions();
	
	
	 System.out.println("selected Size is "+option.getAllSelectedOptions().size());
	 for(WebElement loop:fruitlist)
		 {String value= loop.getText();
		 //System.out.println(loop);
		 System.out.println(value);
		 }
	 
	 
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
