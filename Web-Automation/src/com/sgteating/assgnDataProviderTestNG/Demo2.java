package com.sgteating.assgnDataProviderTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("actitime testing");
	
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\DemoWorkspace\\Web-Automation\\LIBRARY\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

			log.info("chrome browser has been successfully launched");
			oBrowser.manage().window().maximize();

			log.info("browser has been maximised");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			log.info("navigated to the actitime successfully");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			log.info("logged in to actitime successfully");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			log.info("logged out of actitime successfully");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			log.info("flyout window has been minimised");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("user11");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
			log.info("user has been created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			log.info("user has been deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=10)
	public void closeApplication()
	{
		try
		{
			oBrowser.close();
			log.info("the application has been closed successfully");
			log.info("------------------------------------------------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void modifyUser()
	{
		try
		{

			oBrowser.findElement(By.xpath( 
					"//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
		oBrowser.findElement(By.name("username")).sendKeys("moni");
		Thread.sleep(5000);
		oBrowser.findElement(By.xpath( "//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(3000);
		log.info("the user has been modified successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
