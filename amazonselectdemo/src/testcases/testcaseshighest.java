package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import amazonselectdemo.selecthighest;
public class testcaseshighest {
	@Test
	public void landpage() {
		selecthighest high=new selecthighest();
		boolean flag=high.landpage();
		Assert.assertTrue(flag);
		
	}
	@Test
	public void search() {
		System.out.println("success");
	}
	@Test
	public void select() {
		System.out.println("success");

	}
}
