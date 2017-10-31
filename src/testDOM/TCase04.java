package testDOM;

import org.openqa.selenium.WebDriver;

public class TCase04 {

	public TCase04(){
		
	}
	
	public static boolean isTitleCorrect(WebDriver driver){
		String expectedTitle = "The Internet";
		String actualTitle = "";
		actualTitle = driver.getTitle();
		return actualTitle.contentEquals(expectedTitle);
	}
	
}
