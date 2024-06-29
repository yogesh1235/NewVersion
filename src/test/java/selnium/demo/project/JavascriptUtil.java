package selnium.demo.project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {

	public static void drawBorder(WebElement element , WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);

	}


	public static String getTitleByJS( WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		return title;

	}


	public static void clickElement(WebElement element , WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void genratealert(String message , WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"  + message +")", driver);

	}

	public static void refreshJS( WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");

	}

	public static void scrollPageDown( WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("winodow.scrollTo(0,document.body.scrollHeight)");

	}
	
	public static void scrollPageUp( WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("winodow.scrollTo(0,-document.body.scrollHeight)");

	}
	
	public static void zoomPageByJS( WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");   //Zoom Out By 50% 

	}
	
	public static void flash( WebElement element , WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String bgColor = element.getCssValue("backgroundColor");
		for(int i = 0 ; i <10 ; i ++) {
			changeColor("#000000", element, driver);
			changeColor(bgColor, element, driver);
			
			
		}
	}
	
	public static void changeColor(String color,  WebElement element , WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor ='"+ color + "'" , element);
		Thread.sleep(20);
		
	}


}
