package testNGSessiosns;

import org.testng.annotations.Test;

public class InvocationConcept {

	@Test(invocationCount =10)
	public void addUser() {
		System.out.println("addUserTest");
	}
}
