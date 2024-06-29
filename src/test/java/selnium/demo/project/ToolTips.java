package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTips {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
		driver.switchTo().frame(0);
		WebElement ele  = driver.findElement(By.xpath("//input[@id='age']"));
		String toolTIp = ele.getAttribute("title");  // Title of element is the tool tip
		System.out.println(toolTIp);

		
		//To get the size and location of an element 
		ele.getLocation().getX();
		ele.getLocation().getY();
		ele.getSize().getHeight();
		ele.getSize().getWidth();
		
	}

}
