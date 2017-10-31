package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adjacent {

	public Adjacent() {

	}
	
	public static boolean tagFollowedBy (WebDriver driver, String tag1, String tag2) {
		
		return driver.findElements(By.cssSelector(tag1 + " + " + tag2)).size() > 0;
	}
}
