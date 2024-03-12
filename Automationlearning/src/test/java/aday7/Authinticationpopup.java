package aday7;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Authinticationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String s= driver.findElement(By.cssSelector("p")).getText();
		System.out.println(s);
	}

}
