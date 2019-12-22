package seleniumdaythreepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAuto {
	WebDriver driver;
	WebDriverWait wait;
	
	public PracticeAuto(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//iframe[@class=\"demo-frame\"]")
	WebElement frameLocator;
	
	@FindBy(xpath="//input[@id=\"tags\"]")
	WebElement textBox;
	
	@FindBy(xpath="//ul[@id=\"ui-id-1\"]")
	WebElement autoOption;
	
	
	
	
	public String pageTitle(){
		return driver.getTitle();
		}
	
	public void swithToFrame()
	{
		driver.switchTo().frame(frameLocator);
		
	}
	public void textBoxEntry(String a){
		textBox.sendKeys(a);
	}
	
	
	
	public void selectOptionFromAutoComplete(String textToSelect){
		List<WebElement> optionsToSelect=
				autoOption.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));
		for(WebElement e:optionsToSelect ){
			if(e.getText().equalsIgnoreCase(textToSelect)){
				System.out.println("trying to select the option: "+textToSelect);
				e.click();
				break;
				
			}
			
		}
		
		
	}
	

}
