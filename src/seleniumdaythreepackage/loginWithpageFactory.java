package seleniumdaythreepackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class loginWithpageFactory {
	WebDriver driver;
	PageFactoryLogin objlogin;
	PageFactoryHomepage objhomepage;
	

  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://accounts.google.com/servicelogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	  
  }
  
  
  @Test
  public void test_Home_Page_Appear_Correct() throws InterruptedException {
	  objlogin=new PageFactoryLogin(driver);
	  String loginPageTitle = objlogin.getLoginTitle();
	  Assert.assertTrue(loginPageTitle.contains("Sign in – Google accounts"));
	  objlogin.logintoGmail("mudaliarindra", "123dfsghs");
	  objhomepage=new PageFactoryHomepage(driver);
	  Assert.assertTrue(objhomepage.homeDashBoard().contains("Wrong password. Try again or click Forgot password to reset it."));
	  
	  
	  
	  
  }

  
  
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
