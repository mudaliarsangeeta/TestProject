package seleniumdayonepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		//WebElement e = driver.findElement(By.id("searchInput"));
		WebElement e = driver.findElement(By.xpath("//input[@type=\"search\"]")); //  //input[@type="search"]
		e.clear();
		e.sendKeys("India");
		
		//driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();//   //input[@type='submit']
		//driver.quit();
	}

}
