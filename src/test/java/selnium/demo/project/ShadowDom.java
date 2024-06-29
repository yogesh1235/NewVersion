package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement root  = driver.findElement(By.tagName("book-app"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		SearchContext shadowDom1 =(SearchContext) js.executeScript("return arguments[0].shadowRoot", root);
		
		Thread.sleep(2000);
		WebElement appheader = shadowDom1.findElement(By.tagName("app-header"));
		WebElement apptoolbar = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom")) ;
		WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));
		bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");
	}

}
