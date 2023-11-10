package apiauto.petstore;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class getpetstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res=RestAssured.given().contentType(ContentType.JSON).when().get("http://localhost:3000/storedetails?id=11");
		System.out.println(res.getStatusCode());
		if(res.getStatusCode()>10) {
			System.out.println("exception");
		}
		System.out.println(res.asString());

	}
	

}
