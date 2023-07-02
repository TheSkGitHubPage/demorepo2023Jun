package lesson25;

import org.testng.annotations.Test;

import lesson23.Base;

public class GitHubProject extends Base {
	
	// Make until purchase page using at least 3 assertion.
	// Buy outfit
	@Test
	public void test1() {
		driver.get("https://www.hugoboss.com/us/men/");
		
	}
	
	// Buy Phone, iPad, iWatch
	@Test
	public void test2() {
		driver.get("https://www.apple.com/");
		
	}
	
	// Buy for your parents and him&her
	@Test
	public void test3() {
		driver.get("https://www.rolex.com/en-us");
		
	}
	
	// Buy house in Hamptons
	@Test 
	public void test4() {
		driver.get("https://www.elliman.com/");
	}
	
	// Buy a family car, for yourself and wife, parents.
	@Test
	public void test5() {
		driver.get("https://www.mbusa.com/en/home");
		
	}
	
	// Buy a parfume
	@Test
	public void test6() {
		driver.get("https://www.tomford.com/");
		
	}

	// Make a donation
	@Test
	public void test7() {
		driver.get("https://www.thegoodfightgroup.com/");
		
	}
	
	// Book a trip to Europe
	@Test
	public void test8() {
		driver.get(null);
	}
	
	// 
}
