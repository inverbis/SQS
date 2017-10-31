package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TCase07 {

	public TCase07() {

	}

	public static boolean isParagraphCorrect(WebDriver driver) {
		String expectedText = "The hardest part in automated web testing is finding the best locators (e.g., ones that well named, unique, and unlikely to change). It's more often than not that the application you're testing was not built with this concept in mind. This example demonstrates that with unique IDs, a table with no helpful locators, and a canvas element.";
		String actualText = "";
		actualText = driver.findElement(By.tagName("p")).getText();
		return actualText.contentEquals(expectedText);
	}
}
