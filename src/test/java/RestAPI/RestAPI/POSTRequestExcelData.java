package RestAPI.RestAPI;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestUtil.TestUtil;

public class POSTRequestExcelData {
	public static String path="C:\\Users\\jainacha\\eclipse-workspace\\REST_API\\TestData\\TestData.xlsx";
	public static FileInputStream file;
	public static DataFormatter format = new DataFormatter();
	TestUtil util= new TestUtil();

			@DataProvider
			public Object[] getExcelDatahere() throws IOException {
		file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row= sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object[] data=new Object[rowCount-1];
		for(int r=0;r<rowCount-1;r++)
		{
			row=sheet.getRow(r+1);
			for(int c=0;c<colCount;c++)
			{
				XSSFCell cell=row.getCell(c);
				data[r]=format.formatCellValue(cell);
				System.out.println(data[r]);
			}
		}
		return data;
	}

	@Test(dataProvider = "getExcelDatahere")
	public void POSTRequestExcelData(String uid) {
		Map<String,Object> map= new HashMap<String, Object>();
		map.put("id", uid);
		System.out.println(map);
		JSONObject request= new JSONObject(map); 
		given().
		body(request.toJSONString()).when(). 
		post("https://reqres.in/api"+uid).
		then().
		statusCode(201).log().all();
	}

}
