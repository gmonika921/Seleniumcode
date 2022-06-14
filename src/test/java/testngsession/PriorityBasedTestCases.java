package testngsession;

import org.testng.annotations.Test;

public class PriorityBasedTestCases {
	
	
	@Test(priority = 1)
	
	public void aTest() {
		System.out.println("a test");
	}
	@Test(priority = 1)
	public void bTest() {
		System.out.println("b test");
	}
	@Test(priority = 1)
	public void cTest() {
		System.out.println("a test");
	}
	@Test(priority = 2)
	public void dTest() {
		System.out.println("d test");
	}
	@Test(priority = -11, enabled = true)
	public void eTest() {
		System.out.println("e test");
	}

}
