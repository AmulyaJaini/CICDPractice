package aday4;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("E:\\Amulya Automation scripts\\SeleniumPractice\\EmployeeDetails.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");//sheet name
		//XSSFSheet sheet=workbook.getSheetAt(0);//sheet index
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for (int j=0;j<cellcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print("   "+value);
			}
			System.out.println();
		}

	}

}
