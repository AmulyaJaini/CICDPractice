package aday2;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Browser name:");
		Scanner sc= new Scanner(System.in);
		String x=sc.nextLine();
		if(x.equals("chrome"))
		{
			WebDriver driver= new ChromeDriver();
		}
		else if(x.equals("firefox"))
		{
			WebDriver driver= new FirefoxDriver();
		}
		else if(x.equals("edge"))
		{
			WebDriver driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser name");
		System.exit(0);
		}


	}

}
