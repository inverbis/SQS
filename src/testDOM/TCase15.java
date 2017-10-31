package testDOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TCase15 {

	public TCase15() {

	}

	public static boolean areHeadersCorrect(WebDriver driver) {

		String[] expected = { "Lorem", "Ipsum", "Dolor", "Sit", "Amet", "Diceret", "Action" };
		List<WebElement> actual = driver.findElements(By.tagName("th"));
		boolean result = true;
		for (int i = 0; i < expected.length; i++) {
			if (!actual.get(i).getText().equals(expected[i])) {
				result = false;
				break;
			}
		}
		return result;
	}
}
