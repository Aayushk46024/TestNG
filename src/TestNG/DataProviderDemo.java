package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    WebDriver driver;
    String path;
    @DataProvider(name = "LoginData")
    public Object[][] login()
    {
        Object[][] arr =  new Object[2][2];
        arr[0][0] = "asdf";
        arr[0][1] = "qwe";

        arr[1][0] = "hgf";
        arr[1][1] = "kjk";

        return arr;
    }

    @Test(dataProvider = "LoginData")
    public void CheckTest(String uname, String pass)
    {

        path = System.getProperty("user.dir")+ "//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys(uname);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).submit();

        driver.close();
    }
}
