package seleniumdayfourpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TextBoxTest {
	WebDriver driver;
	WebDriverWait wait;
	String url="https://only-testing-blog.blogspot.com/2014/01/textbox.html";
	TextBoxHomePage homepage;

 
  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  	wait=new WebDriverWait(driver, 5);
  	homepage=new TextBoxHomePage(driver);
  }
  @Test(groups="regression1")
  public void testCaseOne_Test_One(){
	  homepage.firstNameEnter("Sangeeta");
	  //homepage.lastNameEnter("Mudaliar");
	  
	   }
  
  @Test(priority=2)
  public void testCaseTwo_Test_One() throws IOException {
	 
	 // homepage.clickOnImageBtn();
	  //Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\autoitexe\\"+"img1upload.exe");
	  
	  
	  
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
