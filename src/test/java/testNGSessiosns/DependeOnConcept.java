package testNGSessiosns;

import org.testng.annotations.Test;

public class DependeOnConcept {
	
	
	@Test()
	public void loginTest() {
		System.out.println("Login test");
		int i =9/0;
			}

	@Test(dependsOnMethods = "loginTest")
	public void asearchTest() {
		System.out.println("aSearch test");
			}
	
	@Test(dependsOnMethods = "asearchTest")
	public void orderTest() {
		System.out.println("order test");
			}
}
