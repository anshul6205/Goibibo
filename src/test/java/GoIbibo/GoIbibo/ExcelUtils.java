package GoIbibo.GoIbibo;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet xfsheet;

	public static void  setPath() throws Exception 
	{
		FileInputStream fi=new FileInputStream("G:\\search.xlsx");
		workbook=new XSSFWorkbook(fi);
		xfsheet=workbook.getSheet("Sheet1");
		}

	public static String cellvalue(int row,int col)
	{
		try {
			String data1=xfsheet.getRow(row).getCell(col).getStringCellValue();
			return data1;
		} catch (Exception e) {
		
			e.printStackTrace();
			return null;
		}
	}
	}

