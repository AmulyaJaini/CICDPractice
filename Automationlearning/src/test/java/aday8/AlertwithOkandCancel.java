package aday8;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertwithOkandCancel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		String actres1=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		String expres1="You pressed Ok";
		if (actres1.equals(expres1))
		{
			System.out.println("Test is passed");
		}
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		driver.switchTo().alert().dismiss();
		actres1=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		String expres2="You Pressed Cancel";
		if (actres1.equals(expres2))
		{
			System.out.println("Test is passed");
		}
	}

}
