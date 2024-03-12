package aday5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker1")).click();
		
		for( int i=10;i>0;i--)
		{
			driver.findElement(By.xpath("/html/body/div[1]/div/a[2]/span")).click();
			//String s1=driver.findElement(By.xpath("/html/body/div[1]/div/div/span[2]")).getText();
			
			String s=driver.findElement(By.xpath("/html/body/div[1]/div/div/span[1]")).getText();
			if(s.equals("July"))
			{
				driver.findElement(By.linkText("22")).click();
				break;
			}
		
	}
	}
}
