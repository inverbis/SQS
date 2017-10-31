package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TCase20 {

	public TCase20() {

	}

	public static boolean isCanvasContentRight(WebDriver driver) {
		// create a wrapper for running JS
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// find the script that draws on canvas
		WebElement canvas = driver.findElement(By.xpath("//body/div/div/script"));

		// parse the contents of the canvas script
		String scriptStr = (String) js.executeScript("return arguments[0].innerHTML", canvas);

		boolean canvasTest = (boolean) js.executeScript(
			// create a second canvas and append it right after the existing one
			"var cTest = document.createElement('canvas');"
				+ "cTest.id = 'cTest';"
				+ "cTest.width = 599;"
				+ "cTest.height = 200;"
				+ "cTest.style.border = '1px dotted';"
				+ "var div = document.getElementsByClassName('large-10')[1];"
				+ "div.appendChild(cTest);"
				// put ImageData from the first canvas into an integer array
				+ "var c1 = document.getElementById('canvas');"
				+ "ctx1 = c1.getContext('2d');"
				+ "var data1 = ctx1.getImageData(0, 0, c1.width, c1.height).data;"
				// draw on the second canvas and put ImageData from it into an integer array
				+ scriptStr.replace("canvas", "cTest")
				+ "var data2 = cTest.getImageData(0, 0, cTest_el.width, cTest_el.height).data;"
				// compare the two arrays
				+ "var same = true;"
				+ "for (var i = 0; i < data1.length; i++) {"
					+ "if (data1[i] !== data2[i]) {"
						+ "same = false;"
						+ "break;"
					+ "}"
				+ "}"
				+ "return same;");
		return canvasTest;
	}
}
