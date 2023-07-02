package lesson23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLFrameElement;

public class HandleFrames extends Base {

	@Test
	public void frameTest() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("benzradio")).click();

		// Scroll:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1500)");

		// Switch to iFrame
		driver.switchTo().frame(0);
//		driver.switchTo().frame(nameOrId);
//		driver.switchTo().frame(frameElement);

		Thread.sleep(1000);
//		driver.findElement(By.id("search")).click();
//		driver.findElement(By.id("search")).sendKeys("Test123");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		
		
		// Switch back to the main page:
		driver.switchTo().defaultContent();
		// Click on BMW checkbox
		driver.findElement(By.id("bmwcheck")).click();
	}

}
