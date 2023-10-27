package evenorodd;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoeven {
	@Test
	@Parameters({"c"})
public void even(int n) {
		
	if(n%2==0) {
		System.out.println("even");
	}
}
}
