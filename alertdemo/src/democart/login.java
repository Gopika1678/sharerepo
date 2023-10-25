package democart;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login {
	@DataProvider(name="json-parser") 
	public String[] datamethod() throws IOException, ParseException {
		JSONParser parser=new JSONParser();
		FileReader reader=new FileReader("C:\\Users\\Hp\\Downloads\\logincred.json");
		Object obj=parser.parse(reader);
		JSONObject jsonobject=(JSONObject)obj;
		JSONArray arr=(JSONArray)jsonobject.get("userlogins");	
		String array[]=new String[arr.size()];
		
		for(int i=0;i<arr.size();i++) {
			JSONObject users=(JSONObject)arr.get(i);
			String user=(String) users.get("username");
			String password=(String) users.get("password");
			array[i]=user +"," +password;
		}
		return array;
		}
	@Test(dataProvider="json-parser")
	public void logindata(String data) {
		System.out.println("success");
		String user[]=data.split(",");
		System.out.println(user[0]);
		System.out.println(user[1]);
	}
	}
