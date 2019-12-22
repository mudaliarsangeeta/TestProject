package seleniumdaysixpakage;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter {
	
	public void onTestStart(ITestResult tr){
		log("Test Started ......");
		
		
	}
	

	public void onTestSuccess(ITestResult tr){
		log("Test "+ tr.getName()+"... SUCCESS");
		
		log(tr.getTestClass());
		log("Priority of the class is "+ tr.getMethod().getPriority()+ " ");
		System.out.println("--------------------------");
				
	}
	
	
	public void onTestFailure(ITestResult tr){
		log("Test"+ tr.getName()+ " ...FAILED");
		log(tr.getStatus());
		System.out.println("--------------");
		}
	
	
	private void log(int status) {
	System.out.println(status);
		
	}


	private void log(String string) {
		System.out.println(string);
		
	}


	private void log(IClass iClass) {
		System.out.println(iClass);
		
	}
	

}
