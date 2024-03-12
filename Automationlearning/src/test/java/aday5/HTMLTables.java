package aday5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class HTMLTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		int r=driver.findElements(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr")).size();
		System.out.println("No.of rows in a table:" +r);
		int c=driver.findElements(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th")).size();
		System.out.println("No.of columns in a table:" +c);
		//read the values:
		for(int i=2;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				String s=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				//String s=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[1]")).getText();
				System.out.print(s);
			}
			System.out.println(" ");
		}
		driver.close();
		driver.quit();
	}

}
