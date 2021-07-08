package RestAPI.RestAPI;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
        
public class FirstRestAss 
{
	@Test(enabled = false)
	public static void getResponseBody(){
		   //given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().all();
		Response response= RestAssured.get("https://reqres.in/api/users?id=1");
		//System.out.println("\n"+response.asString());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		System.out.println(response.getHeader("content-type"));
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test
	public void validateResponse() {
		given().get("https://reqres.in/api/users?id=6").
		then().
		statusCode(200).body("first_name", equalTo("Tracey"));
		
	}
	}
