package selnium.demo.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));

		SelectFromDropDown("Brazil\r\n" + 
				"	", country);
		Thread.sleep(5000);
		driver.quit();

	}



	public static void SelectFromDropDown(String value , WebElement element) {

		Select select = new Select (element);
		List <WebElement> options =  select.getOptions();
		for(WebElement ele : options) {

			if (ele.getText().equals(value)) {

				System.out.println("Entered");
				ele.click();
				break;

			}


		}



	}

}
