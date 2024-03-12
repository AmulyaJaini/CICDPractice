package batchTesting;

import org.testng.annotations.Test;

public class SignupTest {
	@Test
	void SignupByEmail()
	{
		System.out.println("signed up using email");
	}
	@Test
	void SignupByFacebook()
	{
		System.out.println("signed up using facebook");
	}
	@Test
	void SignupByTwitter()
	{
		System.out.println("signed up using twitter");
	}

}
