package com.mystore.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
Readconfig read=new Readconfig();
	
public	String browser = read.basebrowser();
public 	String url = read.Baseurl();
	
	public static WebDriver driver;
	
	public static Logger logger; 
	
	@BeforeClass
	public void  lunch() {
	

	switch(browser.toLowerCase()) 
	{
	case"chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
	case "msedge":
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
	case "firefoxDriver":
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "null":
		driver=null;
		break;
		
		
	
	
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//for logging
	
	
	
	logger=LogManager.getLogger("Mystore");

	
	
	}
	
	@AfterSuite
	public void teardown() 
	{
		driver.close();
		driver.quit();
	}

}
