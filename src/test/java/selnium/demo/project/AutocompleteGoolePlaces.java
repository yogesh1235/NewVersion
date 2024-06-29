package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocompleteGoolePlaces {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.id("autocomplete"));
		searchBox.clear();
		
		searchBox.sendKeys("T");
		String text;
		
		do {
			searchBox.sendKeys(Keys.ARROW_DOWN);
			text =searchBox.getAttribute("value");
			
			if (text.equals("Turkey")) {
				searchBox.sendKeys(Keys.ENTER);
				Thread.sleep(4000);
				break;
			}
		}
		
		while(!text.isEmpty());
		
		driver.close();
		
		

	}

}
