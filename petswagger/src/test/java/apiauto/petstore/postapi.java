package apiauto.petstore;
import apiauto.petstore.postpetstore;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class postapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postpetstore postpet=new postpetstore();
		postpet.setId("6");
		postpet.setPetid("6789");
		postpet.setQuantity("9");
		postpet.setShipdate("06-07-2023");
		postpet.setStatus("passed");
		postpet.setComplete("true");
		Response res=RestAssured.given().contentType(ContentType.JSON).body(postpet).when().post("http://localhost:3000/storedetails");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		
	}

}
