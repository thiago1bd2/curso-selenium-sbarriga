package br.com.thiago1bd2.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import br.com.thiago1bd2.core.Properties.TipoExecucao;

public class DriverFactory {

	private DriverFactory() {
	}

	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
		@Override
		protected synchronized WebDriver initialValue() {
			return initDriver();
		}
	};

	public static WebDriver getDriver() {
		return threadDriver.get();
	}

	public static WebDriver initDriver() {
		WebDriver driver = null;
		if (Properties.TIPO_EXECUCACO == TipoExecucao.LOCAL) {
			switch (Properties.BROWSER) {
			case CHROME:
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			}
		}
		
		if (Properties.TIPO_EXECUCACO == TipoExecucao.GRID) {
			Capabilities cap = null;
			
			switch (Properties.BROWSER) {
			case CHROME:
				cap =  new ChromeOptions();
				break;
			case FIREFOX:
				cap = new FirefoxOptions();
				break;
			}
			
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.0.149:4444/wd/hub"), cap);
			} catch (MalformedURLException e) {
				System.err.println("Falha na conexao com o GRID.");
				e.printStackTrace();
			}
		}
		
		return driver;
	}

	public static void killDriver() {
		WebDriver driver = getDriver();

		if (driver != null) {
			driver.quit();
			driver = null;
		}

		if (threadDriver != null) {
			threadDriver.remove();
		}
	}
}
