package seleniumdaysixpakage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class loggingClass {
  @Test(priority=0)
  public void successMethod() {
	  System.out.println("s" );
  }
  @Test(priority = 1)
  public void failureMethod() {
	  System.out.println("f");
	  int i=1/0;
  }
  @Test(dependsOnMethods={"failureMethod"})
  public void skipMethod() {
	  System.out.println("skip");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
