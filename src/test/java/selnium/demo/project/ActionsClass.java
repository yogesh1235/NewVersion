package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement ele = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions actions = new Actions(driver);
		actions.contextClick(ele).perform(); // Right click  //No need to write build.performe as perform internally contains build
		
		actions.moveToElement(source).moveToElement(target).click().perform(); // If we need to move to multiple element Eg. Drop Down
		actions.dragAndDrop(source, target); 
		actions.doubleClick();
		actions.scrollByAmount(deltaX, deltaY)
		
	}

}
