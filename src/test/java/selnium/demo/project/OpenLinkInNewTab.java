package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//The below mentioned code will open the link into new tab
		String tab = Keys.chord(Keys.CONTROL , Keys.RETURN);
		driver.findElement(By.linkText("Plugins")).sendKeys(tab);;
	
		driver.quit();
		
		//open two different application in two different tabs 
	     driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().newWindow(WindowType.TAB).get("https://jqueryui.com"); // this will open new application in new tab
		
		driver.quit();
		
		//open two different application in two different windows
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://jqueryui.com"); // this will open new application in new window
	}

}
