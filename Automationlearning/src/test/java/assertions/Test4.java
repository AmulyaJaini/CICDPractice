package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {
	SoftAssert softAssert= new SoftAssert();
	@Test
	void demoTest()
	{
		softAssert.assertEquals("welcome", "Welcome");//fail
		softAssert.assertAll();
	
	}
	@Test
	void demoTest2()
	{
		softAssert.assertEquals("welcome", "welcome");
		softAssert.assertAll();
	}
	//If one method is failed the 2nd will also fail as it it is using same object
}
