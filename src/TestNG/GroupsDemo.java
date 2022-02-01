package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupsDemo {
    String path;
    WebDriver driver;
    @BeforeSuite(groups = {"Smoke"})
    public void Launch()
    {
        path = System.getProperty("user.dir")+ "//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test(groups = {"Smoke"})
    public void Login()
    {
        System.out.println("Login Demo");
    }
    @Test(groups = "Sanity")
    public void Logout()
    {
        System.out.println("Logout");
    }

    @AfterSuite(groups = {"Sanity"})
    public void Close_Browser()
    {
        driver.close();
    }
}
