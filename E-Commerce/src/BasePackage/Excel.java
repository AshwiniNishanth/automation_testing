package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public String getExcelData(String sheetname, int rowNum, int cellNum) {
		String retVal=null ;
		try {
			FileInputStream fil=new FileInputStream("C:\\Users\\Ashwini\\Desktop\\New folder (2)\\data.xlsx");
			Workbook wb=  WorkbookFactory.create(fil);
			Sheet    s=	wb.getSheet(sheetname);
			Row      r= s.getRow(rowNum);
			Cell     c= r.getCell(cellNum);
			retVal    = c.getStringCellValue();


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;

	}




	public int getLastRowNumber(String sheetname) {
		int retVal=0 ;
		try {
			FileInputStream fil=new FileInputStream("C:\\Users\\Ashwini\\Desktop\\New folder (2)\\data.xlsx");
			Workbook wb=  WorkbookFactory.create(fil);
			Sheet    s=	  wb.getSheet(sheetname);;
			retVal    =   s.getLastRowNum();


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;

	}

}

