package aday6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropdownSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("country"));
		Select s=new Select(e);
		List originallist= new ArrayList();
		List <WebElement> options=s.getOptions();
		for(WebElement x: options)
		{
			originallist.add(x.getText());
		}
		System.out.println(originallist);
		List templist=new ArrayList();
		templist=originallist;//it changes the values in both lists.
		System.out.println("temp list before sorting"+ templist);
		Collections.sort(templist);
		System.out.println("temp list after sorting"+ templist);
		if(originallist==templist)
		{
			System.out.println("Dropdown is sorted");
		}
		else
			System.out.println("Dropdown is not sorted");

		driver.close();
		driver.quit();
	}

}
