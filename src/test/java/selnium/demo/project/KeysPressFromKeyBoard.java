package selnium.demo.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysPressFromKeyBoard {

	
public static void main (String [] args)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://text-compare.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	
	WebElement textArea1 = driver.findElement(By.xpath("//textarea[@name='text1']"));
	WebElement textArea2 =driver.findElement(By.xpath("//textarea[@name='text2']"));
	
	textArea1.sendKeys("This is selenium test");
	Actions action = new Actions(driver);
	action.click(textArea1)
	.doubleClick()
	.keyDown(Keys.CONTROL)
	.sendKeys("c").perform();
	
	action.click(textArea2)
	.keyDown(Keys.CONTROL)
	.sendKeys("v").perform();
}

}
