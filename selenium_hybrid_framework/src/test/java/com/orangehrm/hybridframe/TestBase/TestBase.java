package com.orangehrm.hybridframe.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.orangehrm.hybidframe.utility.ConfigDataProvider;
import com.orangehrm.hybidframe.utility.XLSXDataProvider;

public class TestBase {
	public static WebDriver driver = null;
	public ConfigDataProvider configData;
	public XLSXDataProvider xlsxData;

	@BeforeSuite
	public void setupSuite() {
		configData = new ConfigDataProvider();
		xlsxData = new XLSXDataProvider();
	}

	@Parameters("Browser")
	@BeforeMethod
	public void setUp(@Optional("Chrome") String browserName) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("Microsoft edge")) {
			System.setProperty("webdriver.edge.driver", "./Driver/msedgedrive.exe");
			driver = new EdgeDriver();

		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Driver/operadriver.exe");
			driver = new InternetExplorerDriver();
		}

		// driver.get("https://opensource-demo.orangehrmlive.com/");
		//

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(configData.getAppUrl());
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}