package seleniumdaytwopackage;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		try {
			
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
		Select practiceFruits =new Select(e);
		practiceFruits.selectByVisibleText("Grape");
		Thread.sleep(300);
		practiceFruits.selectByValue("apple");
		Thread.sleep(300);
		practiceFruits.selectByIndex(7);
		} 
		
		catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		

	}

}
