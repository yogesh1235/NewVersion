package selnium.demo.project;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.6.3");
		
		
		
		WebElement ele = driver.findElement(By.xpath("//div[@class=\"im-header\"]//h2/a[@href=\"/artifact/io.github.bonigarcia/webdrivermanager\"]"));
		System.out.println(ele.getAttribute("xpath"));
		driver.close();
		
		Select select = new Select(ele);
		select.selectByIndex(0);
		select.deselectByValue("");
		select.selectByVisibleText("");
		
		
		
	}

}
