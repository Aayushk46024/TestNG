package demo.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//        driver.findElement(By.name("Submit")).click();
		
		List<WebElement> l1 = driver.findElements(By.className("media__link"));
		System.out.println(l1.size());
		
		for(int i=0; i<l1.size(); i++) {
			//System.out.println(l1.get(i).getText());
			System.out.println(l1.get(i).getAttribute("href"));
		}
		
		
		//driver.close();

	}

}
