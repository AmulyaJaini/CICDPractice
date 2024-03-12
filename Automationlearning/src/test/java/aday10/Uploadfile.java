package aday10;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class Uploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("imagesrc")).click();
	}

}
