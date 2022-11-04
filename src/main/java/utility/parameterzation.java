package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterzation {
	public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream file = new FileInputStream("\"C:\\Users\\lenovo\\eclipse-workspace\\Saucelabs\\src\\test\\resources\\shubhangi.xlsx\"");
		String value = WorkbookFactory.create(file).getSheet(sheet).getRow(0).getCell(0).getStringCellValue();
		return value;
}

}
