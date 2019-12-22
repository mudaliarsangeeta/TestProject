package seleniumdaythreepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactoryLogin {

	WebDriver driver;
	
		
	@FindBy(xpath="//div[contains(text(),\"Use another account\")]")
	WebElement anotheraccount;
	
	@FindBy(xpath="//input[@type=\"email\"]")
	WebElement username;
	
	/*@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;*/
	
	@FindBy(xpath="//div[@class=\"Xb9hP\"]//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy()
	WebElement titletext;
	
	@FindBy(xpath="//span[contains(text(),\"Next\")]")
	WebElement next;
	
	@FindBy(xpath="//div[@class=\"xgOPLd\"]/div[@jsname=\"B34EJ\"]")
	WebElement Errormsg1;
	
	public PageFactoryLogin(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	public void useAnotherAccount(){
		anotheraccount.click();
	}
	public void setUsername(String strusername){
		username.clear();
		username.sendKeys(strusername);
	}
	
	public void setPassword(String strpassword){
		password.sendKeys(strpassword);
	}
	
	public void clickNext(){
		next.click();
	}
	
	public String getLoginTitle(){
		return driver.getTitle();
	}
	
	public void logintoGmail(String username, String password) throws InterruptedException{
		this.setUsername(username);
		this.clickNext();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
		this.setPassword(password);
		this.clickNext();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(Errormsg1));
		//Thread.sleep(3000);
		
	}
	
}
