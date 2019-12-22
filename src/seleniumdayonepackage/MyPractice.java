package seleniumdayonepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bhiwandi:bhiwandi@117.240.212.156/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"/intranet\"]")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@class=\"dropdown\"]/a[text()='Network Live']"))).build().perform();
		//driver.findElement(By.xpath("//a[contains(text(),\"Network Live\")]"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"dropdown-content\"]//a[@href=\"/intranet/nw_summary.php\"]")).click();
		driver.manage().window().maximize();
		String winHandleBefore = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//font[contains(text(),'KALYAN')]/parent::td//following-sibling::td//a[@href=\"JavaScript:newPopup('site_fail_details.php?SSA=KALYAN&TECH=ALL');\"]")).click();
		
		Thread.sleep(3000);
		for(String win:driver.getWindowHandles())
		{
			driver.switchTo().window(win);
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\"fault_export.php?SSA=KALYAN&TECH=ALL\"]")).click();
		driver.close();
		driver.switchTo().window(winHandleBefore);
		
		

	}

}
