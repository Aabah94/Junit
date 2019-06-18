package testng_prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.agiletestware.bumblebee.annotations.testng.BumblebeeTestNGReporter;

@Bumblebee(testlab = "Root\\testng_simple", testset = "class_annotations", testplan = "Subject\\testng_simple")

public class prac1 {
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
		
	}
	@AfterTest
	public void close(){
		driver.quit();
		System.out.println("browser closed");
	}

}
