package aday9;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement element= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(element).dragAndDropBy(element, 130, 150).build().perform();
	}

}
