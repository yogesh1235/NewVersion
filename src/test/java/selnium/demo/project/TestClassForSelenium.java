package selnium.demo.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassForSelenium {

	public static void main(String[] args) {

		/*
		 * System.setProperty("WebDriver.chrome.driver",
		 * "C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		 * WebDriver driver = new ChromeDriver(); driver.get("https://google.com");
		 */
		
		//Using the Drivermanager
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
	}

}
