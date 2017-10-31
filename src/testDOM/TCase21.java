package testDOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TCase21 {

	public TCase21() {
		
	}
	
	public static boolean checkLinks (WebDriver driver) {
		
		boolean result = true;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			url = url.startsWith("http") ? url : "http://the-internet.herokuapp.com" + url;
			if (!URLHeader.checkStatus(url)){
				result = false;
				break;
			}
		}
		
		return result;
	}
}
