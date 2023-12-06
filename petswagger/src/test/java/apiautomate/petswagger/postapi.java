package apiautomate.petswagger;
import apiautomate.petswagger.postpetid;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class postapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postpetid petid=new postpetid();
		petid.setId("11");
		petid.setUsername("ronnie1990");
		petid.setFirstname("Ronnie");
		petid.setLastname("K");
		petid.setEmail("ronnie1987@gmail.com");
		petid.setPassword("ronnie89");
		petid.setPhone("7865434567");
		petid.setStatus("available");
		Response res=RestAssured.given().contentType(ContentType.JSON).body(petid).when().post("http://localhost:3000/logindata");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		}


}
