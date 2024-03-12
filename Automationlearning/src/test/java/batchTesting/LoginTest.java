package batchTesting;

import org.testng.annotations.Test;

public class LoginTest {
	@Test
	void loginByEmail()
	{
		System.out.println("logged in using email");
	}
	@Test
	void loginByFacebook()
	{
		System.out.println("logged in using facebook");
	}
	@Test
	void loginByTwitter()
	{
		System.out.println("logged in using twitter");
	}

}
