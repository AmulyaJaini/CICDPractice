package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
public class TestCase1 {
	@Test
	void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement uname=driver.findElement(By.name("userName"));
		WebElement pwd=driver.findElement(By.name("password"));
		
		Assert.assertTrue(uname.isDisplayed());
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Assert.assertTrue(pwd.isDisplayed());
		driver.findElement(By.name("password")).sendKeys("mercury");
		/*Assert.assertFalse(uname.isDisplayed());
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Assert.assertFalse(pwd.isDisplayed());
		driver.findElement(By.name("password")).sendKeys("mercury");*/
		driver.findElement(By.name("submit")).click();
		String acttitle=driver.getTitle();
		String Exptitle="Login: Mercury Tours";
		Assert.assertEquals(acttitle, Exptitle);
		System.out.println("Test passed");
	}

}
