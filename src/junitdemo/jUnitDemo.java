package junitdemo;


import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class jUnitDemo {
	
	@org.testng.annotations.BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void before1() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void after() {
		System.out.println("Before method");
	}
	
	@Test
	public void test1() {
		System.out.println("Running test 1");
		Assert.fail();
	}
	
	@Test
	public void test2() {
		System.out.println("Running test 2");
	}

}
