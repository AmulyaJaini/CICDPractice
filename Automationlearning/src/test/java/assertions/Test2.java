package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	void demoTest()
	{
		Assert.assertTrue(true);//true
		Assert.assertEquals("welcome", "Welcome");//False
		Assert.assertEquals("selenium", "selenium");//true
		System.out.println("Succesfully passed");//totatl test case is failed and will not execute next lines.
	}
}
