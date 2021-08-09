package RestAPI.RestAPI;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadJson {
	
	JSONParser parser= new JSONParser();
	@Test
	public void test() {
	try {
		
		Object obj= parser.parse(new FileReader("C:\\Users\\jainacha\\Desktop\\Emaple.json"));

		JSONObject jsonObject=(JSONObject) obj;
		JSONArray companyList=(JSONArray) jsonObject.get("Company List");
		
		Iterator<JSONObject> iterator= companyList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Finally block");
	}
	}

}
