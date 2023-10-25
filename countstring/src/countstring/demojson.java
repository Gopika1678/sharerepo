package countstring;

import java.io.FileReader;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class demojson {
	public static WebDriver driver;
	static String pwd;
	@SuppressWarnings("unchecked")
	@Test
	public void jsondata() {
		JSONParser jp=new JSONParser();
		try {
			FileReader reader=new FileReader("C://Users//Hp//Downloads//fakeapi.json");
			Object obj=jp.parse(reader);
			JSONArray arr=(JSONArray)obj;
			System.out.println(arr);
			arr.forEach(emp->employerData((JSONObject) emp));
			
		}catch(Exception e) {
			
		}
		
	}

	public static void employerData(JSONObject employee) {
		// TODO Auto-generated method stub
		//return null;
		
		JSONObject emp=(JSONObject) employee.get("employee");
		String pwd=(String) emp.get("username");
		System.out.println(pwd);
	}
	

}
