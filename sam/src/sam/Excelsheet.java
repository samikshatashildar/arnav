package sam;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String path = "E:\\sam\\Book1.xlsx";
		InputStream file = new FileInputStream("D:\\Samiksha 0801\\Book1.xlsx");
				
				Workbook book = WorkbookFactory.create(file);
				
				Sheet sheet =book.getSheet("samiksha");
				
				int lastrow=sheet.getLastRowNum();
				
				Row x= sheet.getRow(4);
				
				int lastcellnum = x.getLastCellNum();
				System.out.println(lastcellnum);
				Cell cell=x.getCell(1);
				
				String data = cell.getStringCellValue();
				System.out.println(data);
				
				
				
			}

		}
	}

}
