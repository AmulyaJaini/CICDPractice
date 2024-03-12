package aday2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver= new ChromeDriver();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--headless");
				WebDriver driver= new ChromeDriver();
				driver.get("http://demo.nopcommerce.com");
				System.out.println("Title of the page:"+driver.getTitle());

	}

}
