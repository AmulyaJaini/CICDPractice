package aday5;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file= new FileOutputStream("E:\\Amulya Automation scripts\\SeleniumPractice\\Test1.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Data");
        for(int i=0;i<5;i++)
        {
        	XSSFRow row=sheet.createRow(i);
        	for(int j=0;j<3;j++)
        	{
        		XSSFCell cell=row.createCell(j);
        		cell.setCellValue("abc");
        	}
        }
        workbook.write(file);
        file.close();
        System.out.println("written data into excel");
	}

}
