package TestApplication.TestApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelExecutionTestng {

	

	@Test
	(dependsOnMethods="executeSessionTwo")
	public void executSessionOne() {
		// First session of WebDriver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// Goto guru99 site
		driver.get("https://www.google.com/");
		// find user name text box and fill it
		driver.findElement(By.name("q")).sendKeys("Driver 1");
		driver.close();

	}

	@Test
	public void executeSessionTwo() {
		// Second session of WebDriver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Goto guru99 site
		driver.get("https://www.google.com/");
		// find user name text box and fill it
		driver.findElement(By.name("q")).sendKeys("Driver 2");
		driver.close();

	}

	@Test
	public void executSessionThree() {
		// Third session of WebDriver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Goto guru99 site
		driver.get("https://www.google.com/");
		// find user name text box and fill it
		driver.findElement(By.name("q")).sendKeys("Driver 3");
		driver.close();

	}



	}


