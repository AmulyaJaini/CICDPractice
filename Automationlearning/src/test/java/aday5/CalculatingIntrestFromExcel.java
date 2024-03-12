package aday5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CalculatingIntrestFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\Amulya Automation scripts\\SeleniumPractice\\Intrestcalculation.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(0).getLastCellNum();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow  currentrow=sheet.getRow(i);
			int Principal=(int)currentrow.getCell(0).getNumericCellValue();
			int ROI=(int)currentrow.getCell(1).getNumericCellValue();
			int period=(int)currentrow.getCell(2).getNumericCellValue();
			String Frequency=currentrow.getCell(3).getStringCellValue();
			int exp_maturity=(int)currentrow.getCell(4).getNumericCellValue();
			
			driver.findElement(By.name("principal")).sendKeys(String.valueOf(Principal));
			driver.findElement(By.name("interest")).sendKeys(String.valueOf(ROI));
			driver.findElement(By.name("tenure")).sendKeys(String.valueOf(period));
			WebElement e= driver.findElement(By.name("tenurePeriod"));
			Select s=new Select(e);
			s.selectByVisibleText("year(s)");
			WebElement e1= driver.findElement(By.name("frequency"));
			Select s1=new Select(e1);
			s1.selectByVisibleText(Frequency);
			driver.findElement(By.xpath("./html/body/div[10]/div[2]/div/div[5]/div/div[1]/div[3]/form/div[2]/a[1]/img")).click();
			//driver.findElement(By.xpath("./html/body/div[10]/div[2]/div/div[5]/div/div[1]/div[3]/form/div[2]/a[1]/img")).click();
			String act_maturity=driver.findElement(By.xpath("./html/body/div[10]/div[2]/div/div[5]/div/div[1]/div[4]/div/div[2]/span[2]/strong")).getText();
			if ((Double.parseDouble(act_maturity))==exp_maturity)
			{
				System.out.println("Test Passed");
			}
			else 
			{
				System.out.println("Test Failed");
			}
			driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[5]/div/div[1]/div[3]/form/div[2]/a[2]/img")).click();
					
		}
		driver.close();
		driver.quit();

	}

}
