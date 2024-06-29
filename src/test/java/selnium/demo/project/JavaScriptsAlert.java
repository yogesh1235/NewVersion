package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptsAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	

		driver.findElement(By.xpath("// button[@onclick=\"jsAlert()\"]")).click();
		//for single accept
		driver.switchTo().alert().accept();

		//for cancel alert
		driver.findElement(By.xpath("// button[@onclick=\"jsConfirm()\"]")).click();
		driver.switchTo().alert().dismiss();


		//for alert with text 
		driver.findElement(By.xpath("// button[@onclick=\"jsPrompt()\"]")).click();

		Alert	alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hello");
		
		
		
		

	}

}
