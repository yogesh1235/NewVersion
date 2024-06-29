package selnium.demo.project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//Find Number of the rows
		int tableRowsNumber = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody/tr")).size();
		
		//Find Number of columns 
		int tableColoumnNumber=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th")).size();
		
		String value = "Taipei 101" ;
		
		for(int i =1 ; i<=tableRowsNumber; i++ ) {
			
			
				
				
				String data  =driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody/tr["+ i +"]/th")).getText();
				
				if (data.equals(value))
				{
					for (int j =1 ; j <tableColoumnNumber; j ++) {
						
					System.out.println(driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody/tr["+ i +"]/td["+j +"]")).getText());
					
				}
				
							
			}
			
		}
		
		
	}

}
