package seleniumdayonepackage;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mypractice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		String firstwin=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href=\"/windows\"]")).click();
		
		//driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
		for(String win:driver.getWindowHandles())
			driver.switchTo().window(win);
		
		//driver.findElement(By.xpath("//a[@href=\"http://elementalselenium.com/\"]")).click();
		
		driver.close();
		
		driver.switchTo().window(firstwin);
		driver.findElement(By.xpath("//a[@href=\"/frames\"]"));
		driver.findElement(By.xpath("href=\"/iframe\""));
		WebElement e = driver.findElement(By.xpath("//body[@id=\"tinymce\"]"));
		e.clear();
		e.sendKeys("This is a iframe automation test");
		
		

	}

}
