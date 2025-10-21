package com.project.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
	public static WebDriver driver;
	private Properties pr;
	public static String browser;
	public static String url;
	
	//Parent constructor
	public SetUp() {
		try 
		{
			File file = new File("./Config/config.properties");
			FileInputStream fis = new FileInputStream(file);
			pr = new Properties();
			pr.load(fis);
			browser = pr.getProperty("browser");
			url = pr.getProperty("url");
			System.out.println("Loaded Config --> Browser: " + browser + ", URL: " + url);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

	public static void initialization() throws InterruptedException {
		if (browser == null || url == null) {
			// Manually throw(generate) an exception with a custom error message will be shown in the console
			throw new RuntimeException("Config values not loaded properly!");
		}

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Unsupported browser: " + browser);
		}

		driver.get(url);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	
	//getter method - it simply returns the current/same driver object
	public WebDriver getDriver() {
        return driver;
    }
}
