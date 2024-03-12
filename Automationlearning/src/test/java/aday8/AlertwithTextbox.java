package aday8;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertwithTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		driver.switchTo().alert().sendKeys("Amulya");
		driver.switchTo().alert().accept();
		String x=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		String y="Hello Amulya How are you today";
		if (x.equals(y))
		{
			System.out.println("Test passed");
		}
	}

}
