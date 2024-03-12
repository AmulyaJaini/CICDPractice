package aday2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DemoRegister {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Amulya");
		driver.findElement(By.name("lastName")).sendKeys("Jaini");
		driver.findElement(By.name("phone")).sendKeys("9999999999");
		driver.findElement(By.id("userName")).sendKeys("Amulya@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Hanamkonda");
		driver.findElement(By.name("city")).sendKeys("hanamkonda");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("506001");
		//Dropdown
		WebElement e=driver.findElement(By.name("country"));
		Select s= new Select(e);
		s.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("Amulya@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Amulya@");
		driver.findElement(By.name("confirmPassword")).sendKeys("Amulya@");
		driver.findElement(By.name("submit")).click();

	}

}
