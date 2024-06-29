package selnium.demo.project;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.base.Functions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSyncronization {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();


		//Thread.sleep(MS)
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	

		//Explicit wait

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		element.click();

		//Calling the generic method
		By locator  = By.xpath("//abc[@abc=abc]");
		waitForElementPresent(driver, locator, 10);

		//Fluent wait 
		//Also similar to the WebDriverWait with more flexibility in polling time and ignoring exception
		//Fluent wait Declaration
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		//usage of FluentWait
		WebElement webelement = fwait.until(new Function<WebDriver , WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("foo"));
			}
		});
		webelement.click();

	}



	//Generic method for the explicit wait 

	public static WebElement waitForElementPresent(WebDriver driver , By locator , int timeout) {

		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		return driver.findElement(locator);


	}


}
