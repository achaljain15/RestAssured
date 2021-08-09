package RestAPI.RestAPI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstRestAss
{
	
	@Test//(enabled = false)
	public static void getResponseBody(){
		   //given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log().all();
		Response response= RestAssured.get("https://reqres.in/api/users?name=achal");
		//System.out.println("\n"+response.asString());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
		System.out.println(response.getHeader("content-type"));
		Assert.assertEquals(response.getStatusCode(), 201);
		//Assert.assertEquals(, 1);
		System.out.println(response.getBody().path("id"));
	}
	@Test(enabled=false)
	public void validateResponse() {
		given().get("https://reqres.in/api/users?id=6").
		then().
		statusCode(200).body("data.first_name", equalTo("Tracey"));
	}
	@Test
	public void logResponse() {
		given().get("https://reqres.in/api/users?page=1").
		then().body("data.id[5]", equalTo(6));
		
		given().get("https://reqres.in/api/users?page=1").then().
		statusCode(200).body("data.first_name",hasItems("Eve","Charles","Emma"));
	}

	@Test
	public void getAResponse() {
		String first_name=	given().get("https://reqres.in/api/users?id=6").
		then().
		statusCode(200).extract().path("data.first_name");
		System.out.println(first_name);
		Response resp;
		resp=given().get("https://reqres.in/api/users");
		 List<String> jsonResponse = resp.jsonPath().getList("data");
		 Iterator it= jsonResponse.iterator();
		 while(it.hasNext())
			 System.out.print(jsonResponse);
	}
	}
