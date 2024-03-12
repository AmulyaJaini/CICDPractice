package aday2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("email")).sendKeys("jaini95amulya@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pinkypinkyponky");
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();
	}

}
