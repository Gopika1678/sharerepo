package apipet.getname;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class petidget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res=RestAssured.given().contentType(ContentType.JSON).when().get("http://localhost:3000/petid?id=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	}

}
