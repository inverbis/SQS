package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TCase17 {

	public TCase17() {

	}

	public static boolean checkRows(WebDriver driver) {

		int expected = 10;

		return expected == driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size();
	}
}
