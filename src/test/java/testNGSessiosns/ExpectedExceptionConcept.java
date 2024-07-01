package testNGSessiosns;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	WebDriver driver;
	String name ;

//	@Test( expectedExceptions=Exception.class )
//	or
	@Test( expectedExceptions= {ArithmeticException.class,NullPointerException.class} )
	
	
	public void loginPageUrlTest() {
		System.out.println("test 1");
		int i =5/2;
		System.out.println("Hello");
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);
		
	}
}

