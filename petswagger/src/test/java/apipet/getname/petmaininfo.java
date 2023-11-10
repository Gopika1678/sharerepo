package apipet.getname;
import apipet.getname.petbasicinfo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class petmaininfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postreqpet req=new postreqpet();
		postreqtags tag=new postreqtags();
		req.setPetId("95");
		req.setPetName("tony");
		tag.setTagId("78");
		tag.setTagName("tag5");
		//req.setHno("1");
		//req.setStreet("tony");
		//req.setZipCode("695006");
		petbasicinfo basic=new petbasicinfo();
		basic.setId("100");
		basic.setName("Tony");
		basic.setPhotoUrl("photourl");
		basic.setStatus("available");
		basic.setCategory(req);
		basic.setTags(tag);
		Response res=RestAssured.given().contentType(ContentType.JSON).body(basic).when().post("http://localhost:3000/petid");
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		
	}

}
