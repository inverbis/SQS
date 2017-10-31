package testDOM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTests {

	public static void main(String[] args) {

		String path = "C:\\Users\\Eli\\Downloads\\selenium_drivers\\";
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.gecko.driver", path +
		// "geckodriver.exe");

		// Now you can Initialise marionette driver to launch firefox
		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setCapability("marionette", true);
		// WebDriver driver = new FirefoxDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] protocol = {"http","https"};
		String url = "://the-internet.herokuapp.com/challenging_dom";
		String http = protocol[0] + url;
		String https = protocol[1] + url;
		


		// TESTS GO HERE
		ArrayList<Boolean> testResults = new ArrayList<Boolean>();
		testResults.add(URLHeader.checkStatus(http)); // TCase01
		testResults.add(URLHeader.checkStatus(https)); // TCase02
		testResults.add(TCase03.validateHTML(driver, http));
		
		// launch the browser and go to the URL
		driver.get(http);
		
		testResults.add(TCase04.isTitleCorrect(driver));
		testResults.add(TCase05.isH3Correct(driver));
		testResults.add(Adjacent.tagFollowedBy(driver, "h3", "p")); // TCase06
		testResults.add(TCase07.isParagraphCorrect(driver));
		testResults.add(Adjacent.tagFollowedBy(driver, "p", "hr")); // TCase08
		testResults.add(TCase09.countButtons(driver));
		testResults.add(ColourChecker.hex(driver, "#2ba6cb", 1)); // TCase10
		testResults.add(ColourChecker.hex(driver, "#c60f13", 2)); // TCase11
		testResults.add(ColourChecker.hex(driver, "#5da423", 3)); // TCase12
		//testResults.add();
		testResults.add(TCase14.tableHasHeaders(driver));
		testResults.add(TCase15.areHeadersCorrect(driver));
		testResults.add(TCase16.checkColumns(driver));
		testResults.add(TCase17.checkRows(driver));
		testResults.add(TCase18.checkTableContent(driver)); // CHECK!!!
		//testResults.add();
		testResults.add(TCase20.isCanvasContentRight(driver)); // CHECK!!!
		testResults.add(TCase21.checkLinks(driver));

		System.out.println(TCase21.checkLinks(driver));
		

		// close browser window
		driver.close();

	}

}