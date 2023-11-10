package apiautomate.petswagger;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getpetid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res=RestAssured.given().contentType(ContentType.JSON).when().get("http://localhost:3000/logindata?username=praveena1234");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	//	Response reponse=RestAssured.given().contentType(ContentType.JSON).when().put("http://localhost:3000/logindata");
	//	System.out.println(reponse.getStatusCode());
		
		}

}
