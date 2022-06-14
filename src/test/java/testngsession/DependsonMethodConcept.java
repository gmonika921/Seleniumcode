package testngsession;

import org.testng.annotations.Test;

public class DependsonMethodConcept {
	
	@Test
	
	public void homePageTest() {
		System.out.println("home page test");
		
	}
	
	@Test(dependsOnMethods  = "homePageTest" )
	
	public void searchTest() {
		System.out.println("search test");
	}
	
	
	@Test(dependsOnMethods = "homePageTest")
	
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

}
