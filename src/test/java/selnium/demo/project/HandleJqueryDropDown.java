package selnium.demo.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJqueryDropDown {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();

		String firstText = "//input[@name='checkbox-";

		driver.get("https://formstone.it/components/checkbox/");
		driver.manage().window().maximize();

		for(int i=1 ; i<=4 ; i++)
		{ driver.findElement(By.xpath(firstText + i
				+"']"));

		System.out.println(driver.findElement(By.xpath(firstText + i +"']")));

		}

		//selectChoiceValue(driver, "all");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//fieldset[@class='form_fieldset']")).click();
		driver.close();

	}


	public static void selectChoiceValue(WebDriver driver , String... value)
			throws InterruptedException {

		List <WebElement> options =
				driver.findElements(By.xpath("//fieldset[@class='form_fieldset']"));



		if(!value[0].equalsIgnoreCase("all")) {

			for (WebElement option : options) {

				String val = option.getText();

				for (String name : value) {

					if (name.equals(val)) { 
						option.click(); 
						Thread.sleep(10000); 
						break; } }


			}



		} else { for (WebElement option : options) { option.click();
		Thread.sleep(10000); } }

		driver.quit(); }

}
