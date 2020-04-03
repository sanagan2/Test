package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	public  WebDriver driver;
	public  Properties prop;
	
public TestBase() {
	prop=new Properties();
	try {
		FileInputStream fis= new FileInputStream("C:/Users/sanagan2/eclipse-workspace/Jmhworkday/JMH_workday/src/main/java/com/qa/config/config.properties");
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public void intialization() {
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_77.0.3865.40\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanagan2\\Downloads\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanagan2\\Downloads\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type"); 
		options.addArguments("start-maximized"); 
		options.addArguments("--js-flags=--expose-gc"); 
		options.addArguments("--enable-precise-memory-info"); 
		options.addArguments("--disable-popup-blocking"); 
		options.addArguments("--disable-default-apps"); 
		options.addArguments("test-type=browser"); 
		options.addArguments("disable-infobars"); 
		options.addArguments("no-sandbox");
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("disable-extensions");
		 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	/*	desiredCapabilities = DesiredCapabilities.chrome();
		desiredCapabilities.setCapability("platform", "Windows 10");
		desiredCapabilities.setCapability("version", "66.0");
	
		try {
			driver = new RemoteWebDriver(new URL("http://" + "kdeepa" + ":" + "6ba4bcb2-d5a7-41a9-890c-7607baacd5c9" + "@ondemand.saucelabs.com:80/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}	
	else if(browserName.equals("IE")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sanagan2\\Desktop\\JMH\\Selenium project\\Drivers\\IEDriverServer.exe");
		
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities = DesiredCapabilities.internetExplorer();
		desiredCapabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
		desiredCapabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		desiredCapabilities.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true); 
		desiredCapabilities.setJavascriptEnabled(true);
		InternetExplorerOptions options = new InternetExplorerOptions(desiredCapabilities);
		desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		
		driver = new InternetExplorerDriver(desiredCapabilities);
		driver.manage().window().maximize();


		
		  
		 //it is used to initialize the IE driver
		 
		  
		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_TimeOut, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(TestUtil.impicit_wait,TimeUnit.SECONDS);
	
	
}
}
