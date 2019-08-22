package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utils {
	public static WebDriver d;
	
	public static void OpenGooleApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\MyPlace\\Browser EXE\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://google.com");
		System.out.println("Google opned...");
		
	}
	
	public static void logoutApplication() {
		d.quit();
	}
	
	
	
	
}