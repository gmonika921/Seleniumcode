package testngsession;

import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

public class ExpectedExceptionConcept {
	
	String name = "monika";
	
	@Test(expectedExceptions = {ArithmeticException.class , NullPointerException.class} , priority = 1, enabled = true)
	
	
	public void ExceptionTest() {
		System.out.println("macbook");
		int a = 9/0;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name);
		
	}
	
	
	@Test(expectedExceptions = {Exception.class , NullPointerException.class})
	public void ExceptionTest1() {
		System.out.println("macbook");
		int a = 9/0;
		
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj = null;
		System.out.println(obj.name);
		
	}

}
