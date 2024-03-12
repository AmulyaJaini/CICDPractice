package aday9;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.id("box1"));
		WebElement target=driver.findElement(By.id("box101"));
		WebElement source1=driver.findElement(By.id("box3"));
		WebElement target1=driver.findElement(By.id("box103"));
		Actions act= new Actions(driver);
		act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		Thread.sleep(5000);
		act.dragAndDrop(source1, target1).build().perform();
	}

}
