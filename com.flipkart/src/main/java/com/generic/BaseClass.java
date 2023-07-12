package com.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	}
	
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		driver= new ChromeDriver();
		
		Lib l= new Lib();
		String url = l.getPropertyData("url");
		driver.get(url);
		driver .manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
		
		
		
	}
	
	@BeforeMethod
	public void Login() throws IOException
	{
		Lib l= new Lib();
		String un = l.getPropertyData("username");
		String pwd = l.getPropertyData("password");
		
	
		
		
		
	}
	
	@AfterMethod
	public void Logout() {
		
		
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		
	}
	
	
	

}
