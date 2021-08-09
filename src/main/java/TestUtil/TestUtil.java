package TestUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static FileInputStream file;
	static XSSFRow row;
	static DataFormatter format = new DataFormatter();
	String path = "C:\\Users\\jainacha\\eclipse-workspace\\REST_API\\TestData\\TestData.xlsx";

	public TestUtil() {
		}
}