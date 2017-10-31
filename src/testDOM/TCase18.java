package testDOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TCase18 {

	public TCase18() {

	}

	public static boolean checkTableContent(WebDriver driver) {

		String[] expected = { "Iuvaret", "Apeirian", "Adipisci", "Definiebas", "Consequuntur", "Phaedrum" };
		List<WebElement> rows = driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		boolean result = true;

		for (WebElement row : rows) {
			List<WebElement> cols = row.findElements(By.tagName("td"));
			cols.remove(cols.size() - 1);
			for (WebElement col : cols) {
				if (col.getText().contentEquals(expected[cols.indexOf(col)] + rows.indexOf(row))) {
					result = false;
					break;
				}
			}
		}
		return result;

	}
}
