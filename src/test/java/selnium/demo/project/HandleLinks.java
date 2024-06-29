package selnium.demo.project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


		//using linked text 
	 //driver.findElement(By.linkText("Best Free Web Hosting")).click();

		//using partial linked text 
		//driver.findElement(By.partialLinkText("Web Hosting")).click();

		//Get all the links in the application
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		//extrat all links using the normal loop 
		
		for (int i =0 ; i<links.size(); i++) {
			
			System.out.println(links.get(i).getText());
			links.get(i).getAttribute("href");
			
		}
		
		//using the for each loop 
		for (WebElement link : links ) {
			
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

	}

}
