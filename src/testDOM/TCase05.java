package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TCase05 {

	public TCase05() {

	}

	public static boolean isH3Correct(WebDriver driver) {
		String expectedH3 = "Challenging DOM";
		String actualH3 = "";
		actualH3 = driver.findElement(By.tagName("h3")).getText();
		return actualH3.contentEquals(expectedH3);
	}
}
