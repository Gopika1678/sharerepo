package bookingdemo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class multipleparameters {
	@DataProvider(name="data-provider") 
	public Object[][] dpmethod() {
		return new Object[][] {{2,3,5},{5,7,9}};
	}
	@Test(dataProvider="data-provider") 
		public void methods(int a,int b,int result) {
		int sum=a+b;
		Assert.assertEquals(result, sum);
	}
	
}
