package seleniumdayfourpackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	
	
	public TestBaseClass() {

	try {
		prop=new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/seleniumdayfourpackage/config.properties");
		prop.load(ip);
	} catch (Exception e) {e.printStackTrace();}
	
	}
	
	public static void initialisation(){
		if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			}
		driver.navigate().to(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,5);
		
	}
	
	

}
