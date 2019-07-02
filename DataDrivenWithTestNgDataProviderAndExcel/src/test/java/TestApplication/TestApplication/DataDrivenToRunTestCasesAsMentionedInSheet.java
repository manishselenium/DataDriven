package TestApplication.TestApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;



public class DataDrivenToRunTestCasesAsMentionedInSheet {

WebDriver driver;

@BeforeMethod

public void beforeMethod() throws Exception {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	 driver = new ChromeDriver();

   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   driver.get("http://demo.guru99.com/test/login.html");	

}

@Test(dataProvider="Authentication")

public void Registration_data(String sUserName,String sPassword)throws  Exception{

	driver.findElement(By.id("email")).sendKeys(sUserName);

	System.out.println(sUserName);

	   driver.findElement(By.id("passwd")).sendKeys(sPassword);

	System.out.println(sPassword);

	   driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();

	   System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

	   driver.get("http://demo.guru99.com/test/login.html");

}

@DataProvider

public Object[][] Authentication() throws Exception{

 Object[][] testObjArray = ExcelUtilsToRunTestCasesAsMentionedInSheet.getTableArray("DataDriven.xlsx","Sheet1", 0);

 return (testObjArray);

}

@AfterMethod

public void afterMethod() {

  driver.close();

}

}
