package TestNG;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class FetchData extends DriverDemo {
    @DataProvider (name="Login")
    public Object[][] Login() throws IOException {
        pathfile = System.getProperty("user.dir") + "//TestData//Login_Data.xls";
        FileInputStream fis = new FileInputStream(pathfile);

        HSSFWorkbook wb = new HSSFWorkbook(fis);

        HSSFSheet sheet = wb.getSheet("Login_Details");
        int row = sheet.getLastRowNum();
        Object[][] arr = new Object[row+1][2];
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            uname = sheet.getRow(i).getCell(0).getStringCellValue();
            arr[i][0]=uname;
            pass = sheet.getRow(i).getCell(1).getStringCellValue();
            arr[i][1]=pass;
        }

        return arr;
    }
    @Test(dataProvider = "Login")
    public void checkTest(String uname,String pass)
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys(uname);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).submit();
        driver.close();
    }
}
