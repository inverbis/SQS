package testDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TCase09 {

	public TCase09(){
		
	}
	
	public static boolean countButtons (WebDriver driver){
		int expected = 3;
		int actual = 0;
		actual = driver.findElements(By.className("button")).size();
		return actual == expected;
	}
}
