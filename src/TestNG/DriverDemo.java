package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverDemo {
	public static WebDriver driver;
	public static String path;
	@BeforeSuite
public void LaunchBrowser()
{
	path = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
		
}

@AfterSuite
public void Close_Browser() {
	driver.close();
}


}
