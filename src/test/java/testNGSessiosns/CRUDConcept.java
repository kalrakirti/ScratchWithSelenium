package testNGSessiosns;

import org.testng.annotations.Test;

public class CRUDConcept {

	public int addUser() {
		return 123;
	}

	public String getUser(int uid) {
		String userInfo ="Hi this is a test user";
		return userInfo;
	}

	public String updateUser(int uid) {
		return "user info for Update user" +uid;
	}

	public void deleteUser(int uid) {
		System.out.println("delete the user"+uid);
	}
	//AAA
	@Test()
	public void addUserTest() {
		addUser();
	}
	
	@Test()
	public void getUserTest() {
		int uid = addUser();
		String uInfo = getUser(uid);
		System.out.println(uInfo);
	}

	@Test()
	public void updateUserTest() {
		int userId = addUser();
		updateUser(userId);
		getUser(userId);
	}
	
	@Test()
	public void deleteUSerTest() {
		int uid = addUser();
		deleteUser(uid);
		getUser(uid);
	}
	
}
