package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 
{
	SoftAssert softAssert= new SoftAssert();
	@Test
	void demoTest()
	{
		softAssert.assertTrue(true);//true
		softAssert.assertEquals("welcome", "Welcome");//False
		softAssert.assertEquals("selenium", "selenium");//true
		System.out.println("Succesfully passed");//if one statement is false also it executes all the lines
		softAssert.assertAll();
	}
}
