package selnium.demo.project;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScrollUntillElementIsVisible {

	@Test
	public void ByVisibleElement() {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe"); 
		driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Launch the application		
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");

		//Locating element by link text and store in variable "Element"        		
		WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));

		// Scrolling down the page till the element is found		
		js.executeScript("arguments[0].scrollIntoView();", Element);

	}

}
