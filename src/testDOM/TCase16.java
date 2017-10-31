package testDOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TCase16 {

	public TCase16() {

	}

	public static boolean checkColumns(WebDriver driver) {

		int expected = 7;
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		boolean result = (columns.size() == expected);

		if (result) {
			List<WebElement> rows = driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
			for (WebElement row : rows) {
				if (row.findElements(By.tagName("td")).size() != expected) {
					result = false;
					break;
				}
			}
		}

		return result;

	}
}
