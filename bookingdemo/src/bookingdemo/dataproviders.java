package bookingdemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviders {
	
	@DataProvider(name="data-provider")
public Object[][] dpmethod() {
	return new Object[][] {{"First name"},{"Second name"}};
}
	@Test(dataProvider="data-provider")
public void method(String val) {
	System.out.println(val);
}
	
}
