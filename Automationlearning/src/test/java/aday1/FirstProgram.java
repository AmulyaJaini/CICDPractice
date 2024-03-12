package aday1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("youtube",Keys.ENTER);
	}

}
