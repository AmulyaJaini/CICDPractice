package aday3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class QuitandClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();

	}

}
