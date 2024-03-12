package aday8;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchingMultipleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		WebElement outerframe= driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);
		WebElement innerframe= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Amulya");
		driver.switchTo().parentFrame();
	}

}
