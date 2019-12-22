package seleniumdaythreepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryHomepage {
	
	WebDriver driver;
	/*@FindBy(xpath="//div[@aria-live=\"assertive\"]/div[@jsname=\"B34EJ\"]")
	WebElement Errormsg;*/
	
	@FindBy(xpath="//div[@class=\"xgOPLd\"]/div[@jsname=\"B34EJ\"]")
	WebElement Errormsg;
	
	
	public PageFactoryHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String homeDashBoard(){
		return Errormsg.getText();
		
	}
	
	

}
