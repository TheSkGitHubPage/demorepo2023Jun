package lesson23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class HandleFrameNameOrId extends Base {

	@Test
	public void frameTest() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("benzradio")).click();

		// Scroll:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1500)");

		// Switch to iFrame
//		driver.switchTo().frame(0);
//		driver.switchTo().frame(nameOrId);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe']")));

		//driver.switchTo().frame("courses-iframe");
		//driver.switchTo().frame("//legend[text()='iFrame Example']");
		driver.findElement(By.xpath("//a[@href=\"/courses/javascript-for-beginners\"]")).click();

	}
}
