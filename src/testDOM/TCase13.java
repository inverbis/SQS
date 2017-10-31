package testDOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TCase13 {

	public TCase13 (){
		
	}
	
	public static boolean isCharRendered (WebDriver driver){
		
		String script = "return window.getComputedStyle(document.querySelector('.success'),':before').getPropertyValue('content')";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String charBefore = (String) js.executeScript(script);
		return charBefore.equals("\"?\"");
	}
}
