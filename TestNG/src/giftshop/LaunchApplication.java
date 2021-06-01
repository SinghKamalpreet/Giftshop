package giftshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchApplication {
  WebDriver driver;
  String path;
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.navigate().to("http://182.76.176.205/giftshop/");
	  
  }
  
  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }
}
  