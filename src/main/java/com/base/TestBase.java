package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener listener;

	@Rule
	public static ErrorCollector collector = new ErrorCollector();

	public TestBase() {

		try {
			prop = new Properties();

			FileInputStream f = new FileInputStream(
					"C:\\New folder (2)\\Selenium Project\\CucumberWithPOM\\src\\main\\java\\com\\config\\config.properties");
			prop.load(f);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initilization() throws Exception {

		;

		// String browsername = prop.getProperty("firefox");
		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\selenium\\firefox update driver\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox is Load");

		} else if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\ChromeUpdate-76\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			// Instantiate the chrome driver
			driver = new ChromeDriver(options);
			System.out.println("Load chrome");

		}

		/*
		 * e_driver = new EventFiringWebDriver(driver); listener = new
		 * WebEventListener(); e_driver.register(listener); driver = e_driver;
		 */

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

	}

}
