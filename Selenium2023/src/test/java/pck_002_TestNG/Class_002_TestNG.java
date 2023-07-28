package pck_002_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_002_TestNG {
  @Test
  public void f() {
	  
	// Sólo para verificar que está funcionando el eclipse
	System.out.println("Aprendiendo Selenium 27 julio 2023");
			
	// el punto slash significa que busque dentro del proyecto
	String exePath = "./driver/chromedriver.exe"; 
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");  
	  
  }
}
