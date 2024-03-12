package aday4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegisterDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\Amulya Automation scripts\\SeleniumPractice\\Book.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(0).getLastCellNum();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			//Reading Data from Excel
			String FirstName=currentrow.getCell(0).toString();
			String lastName=currentrow.getCell(1).toString();
			String phone=currentrow.getCell(2).toString();
			String mail=currentrow.getCell(3).toString();
			String address=currentrow.getCell(4).toString();
			String city=currentrow.getCell(5).toString();
			String state=currentrow.getCell(6).toString();
			String postalcode=currentrow.getCell(7).toString();
			String country=currentrow.getCell(8).toString();
			String username=currentrow.getCell(9).toString();
			String password=currentrow.getCell(10).toString();
			String cnfrmpass=currentrow.getCell(11).toString();
			
			//loading the values into application
				driver.findElement(By.name("firstName")).sendKeys(FirstName);
				driver.findElement(By.name("lastName")).sendKeys(lastName);
				driver.findElement(By.name("phone")).sendKeys(phone);
				driver.findElement(By.id("userName")).sendKeys(mail);
				driver.findElement(By.name("address1")).sendKeys(address);
				driver.findElement(By.name("city")).sendKeys(city);
				driver.findElement(By.name("state")).sendKeys(state);
				driver.findElement(By.name("postalCode")).sendKeys(postalcode);
				//Dropdown
				WebElement e=driver.findElement(By.name("country"));
				Select s=new Select(e);
				s.selectByVisibleText(country);
				driver.findElement(By.name("email")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.name("confirmPassword")).sendKeys(cnfrmpass);
				driver.findElement(By.name("submit")).click();
				driver.findElement(By.linkText("REGISTER")).click();
			}


	}

}
