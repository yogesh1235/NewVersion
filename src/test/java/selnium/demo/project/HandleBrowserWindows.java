package selnium.demo.project;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	
		driver.findElement(By.xpath("//a[@target= '_blank']")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		System.out.println(parentWindow);
		
		//Second method using List/ArrayList
		
		List<String> windowIDsList = new ArrayList<String>(window);
		
		String parentWindowId= windowIDsList.get(0);
		String childWindowId= windowIDsList.get(1);
		
		//How to use window id for switching
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		
		//For Each loop
		
		for (String winid : windowIDsList) {
			
			String title = driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		
		
		//Closing any particular browser window
		
		for (String winid : windowIDsList) {
			
			String title =driver.switchTo().window(winid).getTitle();
			if (title.equals("HTML editor") || title.equals("Checkboxes & Radio Buttons")){
				
				driver.close();
				
			}
			
		}
		
			
		}
		
	}


