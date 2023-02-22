package sam;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class abc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet();
			
			sheet.createRow(0);
			sheet.getRow(0).createCell(0).setCellValue("Patil");
			sheet.getRow(0).createCell(1).setCellValue("Jayesh");
			
			sheet.createRow(1);
			sheet.getRow(1).createCell(0).setCellValue("Patil");
			sheet.getRow(1).createCell(1).setCellValue("Nikhil");
			
			sheet.createRow(2);
			sheet.getRow(2).createCell(0).setCellValue("Wadkar");
			sheet.getRow(2).createCell(1).setCellValue("Pranita");
			FileOutputStream file = new FileOutputStream("D:\\Samiksha 0801\\Book1.xlsx");
			
			workbook.write(file);
			
			workbook.close();
		}

	

	

}
