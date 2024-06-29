package selnium.demo.project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {
	
	public static void main(String args[]) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	  List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links)
		{
			String url = link.getAttribute("href");
			
			if(url.equals(null) || url.equals("")){
				
				System.out.println("URL is Empty");
				continue;
			}
			
			URL lk = new URL(url);
			HttpURLConnection httpconn = (HttpURLConnection)lk.openConnection();
			httpconn.connect();
			if (httpconn.getResponseCode()>400) {
				System.out.println(httpconn.getResponseCode() + "   is" + "    Broken link  " + url);
			}
		}
		
	}

}
