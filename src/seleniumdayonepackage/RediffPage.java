package seleniumdayonepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffPage {
	
	public static void selectValueFromDropdown(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		try {
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name^=\"name\"]")).sendKeys("Sangeeta Mudaliar");
			driver.findElement(By.cssSelector("input[name^=\"login\"]")).sendKeys("sangeeta");
			driver.findElement(By.cssSelector("input[name^=\"btnchkavail\"]")).click();
			Thread.sleep(5000);
			String check=driver.findElement(By.xpath("//div[@id=\"check_availability\"]//b")).getText();
			System.out.println(check);
			
			
			if(check.equalsIgnoreCase("Sorry, the ID that you are looking for is taken."))
			{
				driver.findElement(By.cssSelector("input[name^=\"login\"]")).clear();
				driver.findElement(By.cssSelector("input[name^=\"login\"]")).sendKeys("sangeetamudaliar10");
				driver.findElement(By.cssSelector("input[name^=\"btnchkavail\"]")).click();
			}
			
			
			driver.findElement(By.cssSelector("input[name^=\"passwd\"]")).sendKeys("Sangeeta$123");
			driver.findElement(By.cssSelector("input[name^=\"confirm_passwd\"]")).sendKeys("Sangeeta$123");
			driver.findElement(By.cssSelector("input[name^=\"altemail\"]")).sendKeys("mudliarsangeeta10@gmail.com");
			driver.findElement(By.cssSelector("input[name^=\"mobno\"]")).sendKeys("9503889453");
			WebElement e= driver.findElement(By.xpath("//select[contains(@name,\"DOB_Day\")]"));
			selectValueFromDropdown(e, "10");
			
			e= driver.findElement(By.xpath("//select[contains(@name,\"DOB_Month\")]"));
			selectValueFromDropdown(e, "OCT");
			
			e= driver.findElement(By.xpath("//select[contains(@name,\"DOB_Year\")]"));
			selectValueFromDropdown(e, "1990");
			
			driver.findElement(By.xpath("//input[@value='f']")).click();
			e=driver.findElement(By.xpath("//select[contains(@name,\"country\")]"));
			selectValueFromDropdown(e,"India");
			e=driver.findElement(By.xpath("//select[contains(@name,\"city\")]"));
			selectValueFromDropdown(e,"Mumbai");
			
			
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**
		
		
		
		
		
		*/

		
		
		
		
		
		

	}

}
