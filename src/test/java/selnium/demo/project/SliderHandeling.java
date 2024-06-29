package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderHandeling {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(min_slider, 100, 0).perform();

		
		// Difference between Action and Actions 
		// Actions is a class and action is Interface
		Action act  = action.dragAndDropBy(min_slider, 100, 0).build();
		act.perform();
		
	}
	

}
