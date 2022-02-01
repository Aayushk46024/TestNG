package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverDemo {
	public static WebDriver driver;
	public static String path, pathfile;
	public static String uname, pass;
	@BeforeSuite
public void LaunchBrowser()
{
	path = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);

		
}


}
