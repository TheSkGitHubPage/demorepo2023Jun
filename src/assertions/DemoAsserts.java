package assertions;

import org.openqa.selenium.Architecture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import lesson23.Base;

public class DemoAsserts extends Base {

	// Assert class means hard assertion - if it fails it will stop the test and
	// will not move to the next step.
	// @Test
	public void hardAssertExample() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");

		String test1 = "abc";
		String test2 = "abc";
		String test3 = new String("abc");

		// Equality check:
		Assert.assertEquals("abc", "cde", "Some message that will be printed in the log if it fails");
		Assert.assertNotEquals("abcx", "abc", "Should not be equal");

		// Expecting the condition to be false:
		Assert.assertFalse(5 > 5, "Not false");

		// Expecting the condition to be true:
		Assert.assertTrue(5 > 4, "Expecting true");

		// Null check
		Assert.assertNull(driver);
		Assert.assertNotNull(driver);

		Assert.assertNotSame(driver, driver);
	}

	@Test
	public void classChallenge() {
		driver.get("https://www.letskodeit.com/practice");
		String text = driver.findElement(By.cssSelector("h1[data-uniqid=\"1621702280245\"]")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "practice page", "Page title s incorrect");
	}
	
	@Test
	public void softAssertExample() {
		driver.get("https://www.letskodeit.com/practice");
		
		SoftAssert softAssert = new SoftAssert();
		
		
	}
}
