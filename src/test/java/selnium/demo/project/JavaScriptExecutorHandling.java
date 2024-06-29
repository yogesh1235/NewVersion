package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//Javascript executor is interface
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(Script, args); Syntax

		//flash 
		//Drawing border
		WebElement element = driver.findElement(By.xpath("//h1[@class=\"entry-title\"]"));
		System.out.println(element.getCssValue("backgroundColor"));
		JavascriptUtil.flash(element, driver);
		//take screen shots 
		//Getting title of page
		//click action 
		//generate an alert 
		//Refreshing the page 
		//Scroll up down 
		// Zoom page 
		
		JavascriptUtil.zoomPageByJS(driver); 
		
		
	}

}
