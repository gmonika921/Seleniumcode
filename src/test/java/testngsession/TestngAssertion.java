package testngsession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAssertion {
	
	
	
		//	BS -- Connect with DB
		//	BT -- CreateUser
		//	BC -- Launch the Browser
	
//	BM -- Login to the app
//	hp -- title test
//	AM -- user is logout
	
//	BM -- Login to the app
//	hp -- URL test
//	AM -- user is logout

//	BM -- Login to the app
//	login check
//	AM -- user is logout
	
		//	AC -- close the Browser
		//	AT -- DeleteUser
		//	AS -- disConnect with DB

	
	
	@BeforeSuite
	
	public void connectwithDB(){
		System.out.println("BS -- Connect with DB");
	}
	
	@BeforeTest
	
	public void CreateUser(){
		System.out.println("BT -- CreateUser");
	}
	
	@BeforeClass
	
	public void LaunchtheBrowser(){
		System.out.println("BC -- Launch the Browser");
	}
	
	@BeforeMethod
	
	public void loginToApp(){
		System.out.println("BM -- Login to the app");
	}
	
	@Test
	
	public void homepageTitleTest(){
		System.out.println("hp -- title test");
	}
	
	@Test
	
	public void homepageURLTest(){
		System.out.println("hp -- URL test");
	}
	
	@Test
	
	public void isUserLoggedIn(){
		System.out.println("login check");
	}
	
	@AfterMethod
	
	public void loginOut(){
		System.out.println("AM -- user is logout");
	}
	
	@AfterClass
	
	public void closeBrowser(){
		System.out.println("AC -- close the Browser");
	}
	
	@AfterTest
	
	public void deleteUser(){
		System.out.println("AT -- DeleteUser");
	}
	
	@AfterSuite
	
	public void disConnectwithDB(){
		System.out.println("AS -- disConnect with DB");
	}
	

}
