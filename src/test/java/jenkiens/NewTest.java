package jenkiens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://collegeweeklive.com/go-signup");
	//  driver.findElement(By.xpath("//*[@id=\"register\"]/div[4]/div[2]/div/div/select")).click();
	//  new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
	  Thread.sleep(5000);
		}

}

