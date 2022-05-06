package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Commanclass {
	
	public void getm(String url)
	{
		Response res=RestAssured.given().with()
				.contentType("application/json")
				.get(url)
				.then().extract().response();
		res.prettyPrint();
	}
	
	public void postm(String url,String data)
	{
		Response res=RestAssured.given().with()
				.contentType("application/json")
				.body(data)
				.post(url)
				.then().extract().response();
		res.prettyPrint();
	}

	public void putm(String url,String data)
	{
		Response res=RestAssured.given().with()
				.contentType("application/json")
				.body(data)
				.put(url)
				.then().extract().response();
		res.prettyPrint();
		
	}public void deletem(String url)
	{
		Response res=RestAssured.given().with()
				.contentType("application/json")
				.delete(url)
				.then().extract().response();
		res.prettyPrint();
	}
}
