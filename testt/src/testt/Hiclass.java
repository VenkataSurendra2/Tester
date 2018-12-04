package testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiclass {

	public static void main(String[] args) {
		
		System.out.println("sdsd");
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);
	}
}
