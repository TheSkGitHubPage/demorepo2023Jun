package lesson23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlerts extends Base {

	@Test
	public void alertExample() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");
		WebElement alertBtn = driver.findElement(By.id("alertbtn"));
		alertBtn.click();
		Thread.sleep(2000);

		// Handling alert:
		driver.switchTo().alert().accept();
		WebElement enableBtn = driver.findElement(By.id("enabled-button"));
		enableBtn.click();
		Thread.sleep(1000);

		WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
		confirmBtn.click();
		Thread.sleep(1000);

		// Handle alert
		Alert confirmAlertPopUp = driver.switchTo().alert(); // Alert type of object
		String alertText = confirmAlertPopUp.getText();
		confirmAlertPopUp.dismiss();
		confirmAlertPopUp.sendKeys("Cert153154");

		// Asert/Verify/Test
		Assert.assertEquals(alertText, "Are you sure you want to confirm?", "Message for your reference");
		// System.out.println(alertText);
		Assert.assertTrue(5 < 3, "Boolean validation failed");

	}

}
