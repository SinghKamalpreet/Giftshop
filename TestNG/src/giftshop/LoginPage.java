package giftshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage extends LaunchApplication {
	
	@BeforeClass
	public void beforeClass() {
		
		driver.navigate().to("http://182.76.176.205/giftshop/login.php");
	}
	
	@Test(priority=0)
	  public void test1() {
		  
			driver.findElement(By.xpath("//img[@width='180']")).isDisplayed();
		  }
	
	@Test(priority=1)
	  public void test2() {
		  
			driver.findElement(By.xpath("//img[@width='180']")).click();	  
		}
	 
	
	 @Test(priority=2)
	  public void test3() {
		  
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kamalpreet Singh");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Kamal");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }
	 
	  @Test(priority=3)
	  public void test4() {
		  
		  
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Kamal");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }
	  
	  @Test(priority=4)
	  public void test5() {
		  
		  
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kamalpreet Singh");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }
	  
	  @Test(priority=5)
	  public void test6() {
		  
		  
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Kamal");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }
	  
	  @Test(priority=7)
	  public void test7() {
		  
		  
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kamalpreet Singh");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }
	  
	 @Test(priority=6)
	  public void test8() {
		  
		  

			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }
	  
	  @Test(priority=8)
	  public void test9() {
		  
		  
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }
	  
	 @Test(priority=9)
	  public void test10() {
		  
		  
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("admin");
			driver.findElement(By.xpath("//img[@width='180']")).click();
		  }	  
	}
