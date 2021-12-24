package br.com.thiago1bd2.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;
	private static ChromeOptions cOption;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (cOption == null) {
			cOption = new ChromeOptions();
			cOption.setLogLevel(ChromeDriverLogLevel.DEBUG);
		}

		if (driver == null) {
			switch (Properties.browser) {
			case CHROME:
				driver = new ChromeDriver(cOption);
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			}
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
