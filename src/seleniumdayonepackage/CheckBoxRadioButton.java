package seleniumdayonepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver oWebDriver= new ChromeDriver();
		oWebDriver.get("https://openwritings.net/sites/default/files/selenium-test-pages/radio_checkbox.html");
		Thread.sleep(3000);
		//selecting Monday
		
		oWebDriver.findElement(By.xpath("//input[@value=\"Mon\"]")).click();
		
		// Unchecking Apple
		WebElement apple= oWebDriver.findElement(By.xpath("//input[@name=\"apple\"]"));
		apple.click();
		
		//checking orange
		oWebDriver.findElement(By.xpath("//input[@name=\"orange\"]")).click();
		
		Thread.sleep(3000);
		oWebDriver.close();
		
		

	}

}
