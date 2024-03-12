package aday8;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Amulya");
		driver.switchTo().defaultContent();
	}

}
