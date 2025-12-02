	package com.letcode.base;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	
	import com.letcode.utils.ConfigReader;
	
	public class BaseTest {
	
	    public WebDriver driver;
	
	    @Parameters("browser")
	    @BeforeMethod
	    public void setup(@Optional("chrome") String browserName) {
	
	        if (browserName.equals("chrome")) {
	            driver = new ChromeDriver();
	        }
	        else if (browserName.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        }
	        else if (browserName.equals("firefox")) {
	            driver = new FirefoxDriver();
	        }
	
	        driver.manage().window().maximize();
	        ConfigReader cr = new ConfigReader();
	        driver.get(cr.getProperty("url")); // static call
	    }
	
	    @AfterMethod
	    public void teardown() {
	        driver.quit();
	    }
	}
