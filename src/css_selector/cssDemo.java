package css_selector;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cssDemo {

	WebDriver driver = null;

	@BeforeMethod
	public void setUp() {

		
		  String browser = "chrome";
		  
		  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\webdriver\\chromedriver.exe"); driver = new ChromeDriver(); } else if
		  (browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.firefox.driver",
		  "C:\\webdriver\\geckodriver-v0.33.0-win32\\geckodriver.exe"); driver = new
		  FirefoxDriver(); } else if (browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\webdriver\\edgedriver_win64\\msedgedriver.exe"); driver = new
		  EdgeDriver();
		  
		  }
		 

	}

	// @After

	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();

	}

	@Test
	public void Test1() {
		System.out.println("String test 1");

		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("textarea[name=q]")).sendKeys("selenium");

	}

}
