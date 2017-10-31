package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

public class ColourChecker {

	public ColourChecker(){
		
	}
	
	public static boolean hex (WebDriver driver, String expectedHex, int buttonNumber){
		String actualRGB = "";
		actualRGB = driver.findElements(By.className("button")).get(buttonNumber - 1).getCssValue("background-color");
		String actualHex = Color.fromString(actualRGB).asHex();
		return actualHex.contentEquals(expectedHex);
	}
}
