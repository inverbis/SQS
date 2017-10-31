package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TCase14 {

	public TCase14(){
		
	}
	
	public static boolean tableHasHeaders (WebDriver driver){

		return driver.findElements(By.tagName("thead")).size() > 0;
	}
}
