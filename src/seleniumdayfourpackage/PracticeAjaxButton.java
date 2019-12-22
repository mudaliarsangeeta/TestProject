package seleniumdayfourpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAjaxButton extends TestBaseClass {
	
	
	
	public PracticeAjaxButton() {
		
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(xpath="//span[contains(text(),'Primary Button')]")
WebElement primaryButton;

@FindBy(xpath="//span[contains(text(),'Standard Button')]")
WebElement stdButton;

@FindBy(xpath="//span[contains(text(),'Standard Button With Icon')]")
WebElement stdButtonIcon;

@FindBy(xpath="//span[contains(text(),'Standard Button With Two Icons')]")
WebElement stdButton2Icon;

@FindBy(xpath="//span[@id='ctl00_ContentPlaceholder1_lblButtonClickMessage']//strong")
WebElement displayText;

@FindBy(xpath="//div[@class='raDiv']")
WebElement ajaxLoader;


public String getTitleButtonPage()
{
	return driver.getTitle().trim();		
}


public String clickOnPrimaryButton(){
	primaryButton.click();
	wait.until(ExpectedConditions.invisibilityOf(ajaxLoader));
	return displayText.getText();
	}

public String clickOnStdButton(){
	stdButton.click();
	wait.until(ExpectedConditions.invisibilityOf(ajaxLoader));
	return displayText.getText();
	}

public String clickOnStdButtonIcon(){
	stdButtonIcon.click();
	wait.until(ExpectedConditions.invisibilityOf(ajaxLoader));
	return displayText.getText();
	}
public String clickOnStdButton2Icon(){
	stdButton2Icon.click();
	wait.until(ExpectedConditions.invisibilityOf(ajaxLoader));
	return displayText.getText();
	}
	
}
