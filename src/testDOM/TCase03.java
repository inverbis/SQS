package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TCase03 {

	public TCase03(){
		
	}
	
	public static boolean validateHTML(WebDriver driver, String url){
		
		driver.get("https://validator.w3.org/nu/?doc=" + url.replace(":","%3A").replace("/","%2F"));
		return !(driver.findElements(By.tagName("strong")).size() > 0);
	}
}
