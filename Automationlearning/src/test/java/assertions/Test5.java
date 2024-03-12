package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test5 {
	SoftAssert softAssert= new SoftAssert();
	SoftAssert softAssert1= new SoftAssert();
	@Test
	void demoTest()
	{
		softAssert.assertEquals("welcome", "Welcome");//fail
		softAssert.assertAll();
	
	}
	@Test
	void demoTest2()
	{
		softAssert1.assertEquals("welcome", "welcome");
		softAssert1.assertAll();
	}
}
