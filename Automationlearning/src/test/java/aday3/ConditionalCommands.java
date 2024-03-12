package aday3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.name("email")).isEnabled());
		System.out.println(driver.findElement(By.name("pass")).isEnabled());
		/*if(driver.findElement(By.name("email")).isEnabled()&&driver.findElement(By.name("pass")).isEnabled())
		{
			driver.findElement(By.name("email")).sendKeys("jaini95amulya@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("pinkypinkyponky");
			
		}*/
		driver.findElement(By.xpath("[@id='u_0_0_qT']")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@class='_58mt']")).isSelected());

	}

}
