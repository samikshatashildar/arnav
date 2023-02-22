package sam;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "E:\\sam\\Book1.xlsx";
		InputStream file = new FileInputStream(path);
		
		Workbook book= WorkbookFactory.create(file);
		
		Sheet sheet= book.getSheet("arnav");
		
int rowcount =sheet.getLastRowNum()-sheet.getFirstRowNum();

for(int i=0;i<=rowcount;i++){

int cellcount=sheet.getRow(i).getLastCellNum();

 System.out.println("Row"+ i+" data is :");
     
for(int j=0;j<cellcount;j++){
	
System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");

}
System.out.println();

	}

	}
}
	}

}
