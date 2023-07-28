package pkg_001_VerificarUsoMavenDependencies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_001_seleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sólo para verificar que está funcionando el eclipse
		System.out.println("Aprendiendo Selenium 27 julio 2023");
		
		// el punto slash significa que busque dentro del proyecto
		String exePath = "./driver/chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
