package seleniumdaythreepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pract2AmazonHomePage {
	WebDriver driver;
	
	public Pract2AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	/*@FindBy(xpath="")
	WebElement ;
	
	@FindBy(xpath="")
	WebElement ;
	
	@FindBy(xpath="")
	WebElement ;
	
	@FindBy(xpath="")
	WebElement ;
	
	@FindBy(xpath="")
	WebElement ;*
	*/
}
