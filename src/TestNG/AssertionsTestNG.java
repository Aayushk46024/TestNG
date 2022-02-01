package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.nio.file.Watchable;

public class AssertionsTestNG {
    String path;
    WebDriver driver;
    SoftAssert sa = new SoftAssert();
    @Test
    public void Login()
    {
        path = System.getProperty("user.dir")+ "//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        sa.assertEquals(driver.getTitle(), "OrageHRM"); // Hard Assertation
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).submit();
        sa.assertAll();
        driver.close();
    }
}
