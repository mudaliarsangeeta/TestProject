package seleniumdayfivepackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TakeAScreenShot {
	WebDriver driver;
	WebDriverWait wait;
	String url="https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx";
	Date date;
	Timestamp t;
	 @BeforeTest(alwaysRun=true)
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			wait=new WebDriverWait(driver, 5);
			date = new Date();
			t=new Timestamp(date.getTime());
			
			
		  }

  @Test
  public void screenShot() {
	  String datenow=t.toString().replace(":","_");
	  System.out.println(t);
	  System.out.println(datenow);
	  
	 File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 try {
		FileUtils.copyFile(scrfile, new File("./ScreenShots/"+datenow+".png"));
		//FileUtils.copyFile(scrfile, new File(datenow+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
