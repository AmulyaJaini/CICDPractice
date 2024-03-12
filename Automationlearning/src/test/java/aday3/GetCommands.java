package aday3;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		System.out.println(driver.getTitle());//returns title of the page
		System.out.println(driver.getCurrentUrl());//returns URL of the page
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText());
		driver.close();

	}

}
