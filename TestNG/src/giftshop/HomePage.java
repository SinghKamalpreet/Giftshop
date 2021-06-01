package giftshop;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage extends LaunchApplication{
	
	@BeforeClass
	public void beforeClass() {
		driver.navigate().to("http://182.76.176.205/giftshop/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
		driver.findElement(By.xpath("//img[@width='180']")).click();
		driver.findElement(By.linkText("Home")).click();
		
	}
	

 @Test
  public void Test1() {
	 
	 driver.findElement(By.linkText("Home")).isDisplayed();
	 
	  }
 
 @Test
 public void Test2() {
	 
	 driver.findElement(By.linkText("Contact")).isDisplayed();
	 
	  }
 
 @Test
 public void Test3() {
	 
	 driver.findElement(By.linkText("Hii admin")).isDisplayed();
	 
	  }
 
 @Test
 public void Test4() {
	 
	 driver.findElement(By.linkText("Logout")).isDisplayed();
	 
	  }
 
 @Test
 public void Test5() {
	 
	 driver.findElement(By.linkText("About Us")).isDisplayed();
	 
	  }
 
 @Test
 public void Test6() {
	 
	 driver.findElement(By.linkText("Contact Us")).isDisplayed();
	 
	  }
 
 @Test
 public void Test7() {
	 
	 driver.findElement(By.linkText("FAQ's")).isDisplayed();
	 
	  }
 
 @Test
 public void Test8() {
	 
	 driver.findElement(By.linkText("Cancellations and returns")).isDisplayed();
	 
	  }
 
 @Test
 public void Test9() {
	 
	 driver.findElement(By.linkText("Shipping")).isDisplayed();
	 
	  }
 
 @Test
 public void Test10() {
	 
	 driver.findElement(By.linkText("Payments")).isDisplayed();
	 
	  }
 
 
 @Test
 public void Test11() {
	 
	 driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
	 
	  }
 
 @Test
 public void Test12() {
	 
	 driver.findElement(By.xpath("//input[@name='query']")).sendKeys("teddy");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	  }
 
}

