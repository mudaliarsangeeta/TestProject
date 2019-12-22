package seleniumdaythreepackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AutoCompleteTest {
	WebDriver driver;
	WebDriverWait wait;
	String url="https://jqueryui.com/autocomplete/";
	private By frameLocator = By.xpath("//iframe[@class=\"demo-frame\"]");
	private By tagname = By.xpath("//input[@class=\"ui-autocomplete-input\"]");
	
  
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 5);
	  
  }
  @Test
  public void rightClickTest() {
	  WebElement frameElement = driver.findElement(frameLocator);
	  driver.switchTo().frame(frameElement);
	  wait.until(ExpectedConditions.presenceOfElementLocated(tagname));
	  WebElement tagElement =driver.findElement(tagname);
	  tagElement.sendKeys("a");
	  selectOptionWithText("java");
	  
	  
  }
  
  
  
  public void selectOptionWithText(String textToSelect) {
	try {
		WebElement autoOptions =driver.findElement(By.xpath("//ul[@id=\"ui-id-1\"]"));
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		java.util.List<WebElement> optionsToSelect=autoOptions.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));
		System.out.println("list size is "+optionsToSelect.size());
		for(WebElement option:optionsToSelect){
			if(option.getText().equalsIgnoreCase(textToSelect))
			{System.out.println("trying to select "+ textToSelect);
			option.click();
			break;
				
			}
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
@AfterTest
  public void afterTest() {
  }

}
