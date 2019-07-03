package TestApplication.TestApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterization {

	WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/login.html");

		driver.manage().window().maximize();
	}

	@Test(invocationCount =2)
	@Parameters({"sUserName","sPassword"})
    public void Registration_data(String sUserName, String sPassword) throws Exception {

		driver.findElement(By.id("email")).sendKeys(sUserName);

		System.out.println(sUserName);

		driver.findElement(By.id("passwd")).sendKeys(sPassword);

		System.out.println(sPassword);

		driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
		driver.get("http://demo.guru99.com/test/login.html");
	}
}
