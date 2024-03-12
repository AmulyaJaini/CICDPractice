package aday3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
