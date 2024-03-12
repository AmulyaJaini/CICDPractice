package aday7;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchingBetweenWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@class='analystic'][1]")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-info'][1]")).click();
		//driver.getTitle();
		Set <String> s=driver.getWindowHandles();
		for(String x:s)
		{
			System.out.println(x);
			String t=driver.switchTo().window(x).getTitle();
			System.out.println(t);
			if(t.contains("Selenium"))
			{
				driver.close();
			}
		}
	}

}
