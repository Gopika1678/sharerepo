package testng_sauce;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataprovider.saucedemo;
public class saucedemotestcases {
	@Test
	public void positive_testcase() {
		saucedemo sauces=new saucedemo();
		sauces.sampletest("valid", "standard_user", "secret_sauce");
		Assert.assertTrue(true);
	}
	@Test
	public void negative_testcase() {
		saucedemo sauces=new saucedemo();
		sauces.sampletest("invalid", "hcdjf", "hfdhskdjw");
		Assert.assertTrue(false);
	}
}
