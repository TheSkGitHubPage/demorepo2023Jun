package lesson22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bsh.commands.dir;

public class CheapOairTest {

	WebDriver driver = null;
	private String url = "https://www.cheapoair.com/";

	@BeforeMethod
	public void setUp() {

		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\webdriver\\geckodriver-v0.33.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();

		}

	}

	//@AfterMethod

	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

	@Test
	public void testFlightOrder() throws InterruptedException {
		driver.get(url);
		WebElement fromBox = driver.findElement(By.id("from0"));
		fromBox.click();
		Thread.sleep(1000);
		fromBox.sendKeys(Keys.CONTROL + "A");
		fromBox.sendKeys(Keys.DELETE);
		fromBox.sendKeys("New");
		Thread.sleep(500);
		for(int i=0; i<3; i++) {
			fromBox.sendKeys(Keys.ARROW_DOWN);
		}
		fromBox.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		WebElement toBox = driver.findElement(By.id("to0"));
		//fromBox.click();
		//fromBox.sendKeys(Keys.CONTROL + "A");
		//fromBox.sendKeys(Keys.DELETE);
		toBox.sendKeys("Miami");
		Thread.sleep(500);
		toBox.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		// Calendar
		// Current date
		//WebElement fromDate = driver.findElement(By.xpath("//a[@class=\" month-date is--today\"]"));
		WebElement fromDate = driver.findElement(By.xpath("(//a[@class=\" month-date\"])[3]"));
		fromDate.click();
		Thread.sleep(500);
		// Next date
		WebElement toDate = driver.findElement(By.xpath("(//a[@class=\" month-date\"])[6]"));
		toDate.click();
		
		// Traveler button
		WebElement traveler = driver.findElement(By.id("travellerButton"));
		traveler.click();
		Thread.sleep(500);
		// add 2 adults
		for(int i=0; i<2; i++) {
			driver.findElement(By.id("addadults")).click();
		}
		// add 1 seniour 
		driver.findElement(By.id("addseniors")).click();
		// add 1 child 
		driver.findElement(By.id("addchild")).click();
		
		// choose child age from static dropdown
		Select childAgeDropDown = new Select(driver.findElement(By.name("ChildrenAge")));
		//childAgeDropDown.selectByIndex(1);
		//childAgeDropDown.selectByValue("5");
		childAgeDropDown.selectByVisibleText("12");
		//childAgeDropDown.deselectAll();
		//childAgeDropDown.isMultiple();
		
		// add 1 seat infant
		driver.findElement(By.id("addinfant")).click();
		// add 1 lap infant 
		driver.findElement(By.id("addlapinfant")).click();
		// Close the page
		driver.findElement(By.id("closeDialog")).click();
		
		// Choose direct flights 
		driver.findElement(By.name("directFlightCheckname")).click();
		// Search for flights
		driver.findElement(By.id("searchNow")).click();
		
		
		
	}

}
