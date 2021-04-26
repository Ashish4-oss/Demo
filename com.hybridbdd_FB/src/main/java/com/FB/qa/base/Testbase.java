package com.FB.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.FB.qa.util.Testutil;

public class Testbase {
	
	public WebDriver driver;
	public Properties prop;
	

	public Testbase () {
		
		try {
			prop= new Properties();
			FileInputStream fis = new FileInputStream("D:\\Ashish\\Automation\\com.hybridbdd_FB\\src\\main\\java\\com\\FB\\qa\\config\\config.properties");
			prop.load(fis);		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}			
	}
	
	public void initiate() {
		prop.getProperty("browser");
		
		System.setProperty("webdriver.chrome.driver","D:\\files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
