package sam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		String path = "E:\\sam\\Book1.xlsx";
		InputStream file = new FileInputStream(path);
		String data = WorkbookFactory.create(file).getSheet("samik").getRow(2).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
	}


	}


