package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends DriverDemo {
	String actualTitle;
@Test
public void VerifyPage()
{
	actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, "OrangeHRM");
}
@Test
public void Logout()
{
	driver.findElement(By.partialLinkText("Welcome")).click();
	driver.findElement(By.linkText("Logout")).click();
}
}
