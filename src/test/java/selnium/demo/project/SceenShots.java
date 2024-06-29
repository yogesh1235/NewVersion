package selnium.demo.project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SceenShots {

	
public static void main(String[] args) throws IOException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//Full page screen shot 
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File (".\\ScreenShot\\homePage.png");
		FileUtils.copyFile(file, tgt);
		
		// Screenshots of the section or portion 
		WebElement ele  = driver.findElement(By.xpath("//h2[@class='business-title']"));
		File file1 = ele.getScreenshotAs(OutputType.FILE);
		File tgt1 = new File (".\\ScreenShot\\portion.png");
		FileUtils.copyFile(file1, tgt1);
		
		// Screen shot of specific element 
	//	Same as above
		
}
		
	
	
}
