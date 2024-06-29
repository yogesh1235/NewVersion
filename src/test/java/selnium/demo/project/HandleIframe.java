package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIframe {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.switchTo().defaultContent();
		
	}
	
	public static void testInnerIframe() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Outer Iframe
		WebElement outerIframe =driver.findElement(By.xpath("//abc[@abc='abc']"));
		driver.switchTo().frame(outerIframe);
		
		//inner Iframe
		WebElement innnerIframe =driver.findElement(By.xpath("//abc[@abc='abc']"));
		driver.switchTo().frame(innnerIframe);
		driver.findElement(By.xpath("//abc[@abc='abc']")).sendKeys("abc");
		
		driver.switchTo().parentFrame(); // Go to parent frame of the current frame
		driver.switchTo().defaultContent(); // go to the main page regardless of the number of frames 
		
		
	}
	

}
