package alertdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngannotations {
	@AfterTest(enabled=false)
	public void annotation() {
		System.out.println("method1");
	}
	@BeforeTest(enabled=true)
	public void method2() {
		System.out.println("method2");
	}
	@Test(description="test1")
	public void method3() {
		System.out.println("method3");
	}
	@Test(priority=2)
	public void method4() {
		System.out.println("method4");

	}
	@Test(dependsOnMethods="method4")
	public void method5() {
		System.out.println("method5");
	}
}
