package countstring;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test
	@DataProvider(name="data-provider") 
	public Object[][] dpmethod() {
		return new Object[][] {{"firstname"},{"second name"}};
	}
	@Test(dataProvider="data-provider")
	public void method(String val) {
		System.out.println(val);
	}
}
