package sam;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
	 Thread.sleep(1000);
		
	 List<WebElement> x =driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
	 
	 int a= x.size(); 
	 System.out.println(a);
	 
	 for(int i=0; i<a ; i++) {
		 
		 WebElement b= x.get(i);
		String t = b.getText();
		
		 System.out.println(t);
		 String y=t;
		 
		 if(t.equals(y)) {
			 System.out.println("pass: "+y);
		 }else {
			 System.out.println("failed :" +y);
		 }

	 }
	}
	}

}
