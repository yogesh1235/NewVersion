package selnium.demo.project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestHandling {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Google");
		List<WebElement>webelements =driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		
		for (WebElement ele:webelements) {
			
			if(ele.getText().equals("google maps")){
			ele.click();
			Thread.sleep(5000);
			break;
			}
			
		}
		
		driver.close();
		
	}

}
