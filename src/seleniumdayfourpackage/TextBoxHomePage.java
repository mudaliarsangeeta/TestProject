package seleniumdayfourpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxHomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	
	public TextBoxHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,10);
		

	}
	
	@FindBy(name="fname")
	WebElement firstname;
	
	@FindBy(name="lname")
	WebElement lastname;
	
	@FindBy(id="text3")
	WebElement hiddentext;
	
	@FindBy(name="img")
	WebElement imagebtn;
	
	public void firstNameEnter(String firstnameText){
		
		boolean hiddenflag=firstname.isEnabled();
		if(hiddenflag==true){
			firstname.sendKeys(firstnameText);
		} else{
			wait.until(ExpectedConditions.visibilityOf(firstname));
		}
	
	}
	
public void lastNameEnter(String lastnameText){
		
		boolean hiddenflag=lastname.isEnabled();
		if(hiddenflag==true){
			lastname.sendKeys(lastnameText);
		} else{
			wait.until(ExpectedConditions.visibilityOf(lastname));
		}
	
	}
	
	public void clickOnImageBtn(){
		
		imagebtn.click();
		
	}
	
	
	

}
