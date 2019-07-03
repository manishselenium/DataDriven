package TestApplication.TestApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AngularApplicationWithoutProtractor {
	
	WebDriver driver;
	
	@Test
	public void SampleTest() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://angularjs.org/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/input")).sendKeys("Hello");
		
		
		
	}

}
