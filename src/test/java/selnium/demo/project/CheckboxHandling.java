package selnium.demo.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHandling {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		List <WebElement> chekboxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		String color;
		//checkbox selection on based our choice
		/*
		 * for(WebElement checkbox : chekboxes) {
		 * 
		 * color =checkbox.getAttribute("value");
		 * 
		 * if (color.equals("green") || color.equals("orange")) {
		 * 
		 * checkbox.click(); }
		 * 
		 * 
		 * }
		 */
		
		
		// select last 2 checkboxes 
		int totalNoOfCheckBoxes = chekboxes.size();
		
		for (int i=totalNoOfCheckBoxes-2; i<totalNoOfCheckBoxes;i++)
		{
			
			chekboxes.get(i).click();
			
		}
		
		
		// select first 3 checkboxes 
		
		for (int i =0 ; i<totalNoOfCheckBoxes; i++) {
			
			if(i<3) {
				chekboxes.get(i).click();
			}
			
		}
		
	}

}
