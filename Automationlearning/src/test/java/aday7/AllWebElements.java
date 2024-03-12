package aday7;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AllWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Amulya");
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Jaini");
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Hanamkonda");
		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("jaini95amulya@gmail.com");
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("789456123");
		driver.findElement(By.xpath("//*[@value='FeMale']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		WebElement e= driver.findElement(By.id("msdd"));
		Select s= new Select(e);
		s.selectByVisibleText("English");
		s.selectByVisibleText("Hindi");
		System.out.println(s.getOptions().size());
		Select s1= new Select(driver.findElement(By.id("Skills")));
		s1.selectByVisibleText("Android");
		s1.selectByVisibleText("APIs");
	}

}
