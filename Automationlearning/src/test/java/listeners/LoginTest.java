package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	void loginByEmail()
	{
		System.out.println("Login by email");
		Assert.assertEquals("Amulya", "Amulya");//true
	}
	@Test
	void loginByfacebook()
	{
		System.out.println("Login by Facebook");
		Assert.assertEquals("Amulya", "jaini");//true
	}

}
