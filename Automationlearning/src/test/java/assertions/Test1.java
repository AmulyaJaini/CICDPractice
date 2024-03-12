package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	void demoTest()
	{
		Assert.assertTrue(true);//true
		Assert.assertEquals("welcome", "welcome");//true
		Assert.assertEquals("selenium", "selenium");//true
		System.out.println("Succesfully passed");
	}

}
