package aday9;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		Actions act=new Actions(driver);
		act.moveToElement(element).contextClick().build().perform();
		WebElement option=driver.findElement(By.xpath("/html/body/ul/li[1]"));
		act.moveToElement(option).click().build().perform();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
