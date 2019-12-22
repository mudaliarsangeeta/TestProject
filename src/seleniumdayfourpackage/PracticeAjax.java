package seleniumdayfourpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAjax extends TestBaseClass{
	
	public PracticeAjax() {
		
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//a[contains(@href,'button/examples/overview/defaultcs.aspx')]")
	WebElement navigateButton;
	
	
	
	public String getTitlePage()
	{
		return driver.getTitle().trim();		
	}
	
	
	public PracticeAjaxButton navigateButtonClick(){ 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,650)");
		wait.until(ExpectedConditions.visibilityOf(navigateButton));
		navigateButton.click();
		return new PracticeAjaxButton();
		
		}
	
	
	
	
	
	
}
