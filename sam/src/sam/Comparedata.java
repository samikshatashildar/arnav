package sam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comparedata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		//Thread.sleep(5000);
		String path ="D:\\\\Samiksha 0801\\\\Book1.xlsx";
		InputStream file = new FileInputStream(path);
		
		Workbook book= WorkbookFactory.create(file);
		
		Sheet sheet= book.getSheet("samiksha");
		
		int lastRow = sheet.getLastRowNum();
		System.out.println(lastRow);
		
		for(int i=2 ; i<=lastRow+1 ; i++) {
			
			int lastcellnumber=sheet.getRow(i-1).getLastCellNum();
			System.out.println(lastcellnumber);
		
			for(int j=0; j<=lastcellnumber-1 ;j++) {
				
				List<WebElement> x =driver.findElements(By.xpath("//table[@id='customers']//tr["+ i+"]//td"));
				String t = x.get(j).getText();
				String d=sheet.getRow(i-1).getCell(j).getStringCellValue();
				
				if(t.equals(d)) {
					System.out.println("data is pass=" +t);
				}
				else {
					System.out.println("data is fail=" +t);
				}
				
	}
}
			
		
		
	 
		

	}


	}


