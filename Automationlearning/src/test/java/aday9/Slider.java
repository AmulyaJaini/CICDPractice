package aday9;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(element, 100, 0).build().perform();
	}

}
