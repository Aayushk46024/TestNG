package demo.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchData {
	String path, pathdriver;
	WebDriver driver;
	String uname, pass;
public void Launch() throws IOException 
{
	
	pathdriver = System.getProperty("user.dir")+ "//drivers//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", pathdriver);
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com//");
	
	
	path = System.getProperty("user.dir")+"//TestData//Login_Data.xls";
	FileInputStream fis = new FileInputStream(path);
	
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	
	HSSFSheet sheet = wb.getSheet("Login_Details");
	
//	System.out.println(sheet.getLastRowNum());	
//	String uname = sheet.getRow(1).getCell(0).getStringCellValue();
//	System.out.println(uname);
	
	for(int i = 0; i<=sheet.getLastRowNum(); i++)
	{
		uname = sheet.getRow(i).getCell(0).getStringCellValue();
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		pass = sheet.getRow(i).getCell(1).getStringCellValue();
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		
		driver.findElement(By.id("btnLogin")).submit();
	}
}

	public static void main(String[] args) throws IOException {
		FetchData fd = new FetchData();
		fd.Launch();

	}

}
