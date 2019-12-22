package seleniumdayfourpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PracticeAjaxButtonTest extends TestBaseClass {
	PracticeAjax obj;
	PracticeAjaxButton objButtonPage;
	String actualDisplay;
	String expected="ASP.NET AJAX button examples | RadButton control by Telerik";
	public PracticeAjaxButtonTest() {
		super();
	}
	 @BeforeTest
	  public void setUp() {
		  initialisation();
		  obj=new PracticeAjax();
		  obj.navigateButtonClick();
		  wait.until(ExpectedConditions.titleContains(expected));
		  objButtonPage=new PracticeAjaxButton();
	 
	 }
	
	@Test
  public void buttonPageTitleTestCase() {
		
		
		Assert.assertEquals(expected,objButtonPage.getTitleButtonPage());
	   
  }
	@Test
	  public void primaryButtonTestCase() {
		actualDisplay =objButtonPage.clickOnPrimaryButton();
		System.out.println(actualDisplay+" was clicked");
		   
	  }
	@Test
	  public void stdButtonTestCase() {
		actualDisplay =objButtonPage.clickOnStdButton();
		System.out.println(actualDisplay+" was clicked");
		   
	  }
	
	@Test
	  public void stdButtonIconTestCase() {
		actualDisplay =objButtonPage.clickOnStdButtonIcon();
		System.out.println(actualDisplay+" was clicked");
		   
	  }
	@Test
	  public void stdButton2IconTestCase() {
		actualDisplay =objButtonPage.clickOnStdButton2Icon();
		System.out.println(actualDisplay+" was clicked");
		   
	  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
