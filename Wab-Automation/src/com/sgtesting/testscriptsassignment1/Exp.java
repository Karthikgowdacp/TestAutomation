package com.sgtesting.testscriptsassignment1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp {

	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createTasks();
		Createproject();
		Deleteproject();
		Deletecustomer();
		logouts();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Exampleautomation\\Neweclipse\\Wab-Automation\\Library\\Drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();                 
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			obrowser.navigate().to("http://localhost:82/login.do");
			obrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			obrowser.findElement(By.id("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	
	static void createTasks()
	{
		try
		{
			// create Customers
			obrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
	    	obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Karthik");
	    	Thread.sleep(6000);
	    	obrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
			
			
			static void Createproject()
			{
				try
				{
			
		// create project
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Gowda");
	    	Thread.sleep(6000);
	    	obrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();		
				}
			}
			
			static void Deleteproject()
			{
				try
				{
		// delete project
			obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);}catch(Exception e)
				{
				e.printStackTrace();		
			}
		}
			
			static void Deletecustomer()
			{
				try
				{
		// delete customer	
     		obrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
		    obrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
		    Thread.sleep(2000);
			
	    	 Alert oAlert=obrowser.switchTo().alert();
			 String str=oAlert.getText();
			 System.out.println(str);
			 oAlert.accept();
			 Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

			static void logouts()
			{
				try
				{
					obrowser.findElement(By.linkText("Logout")).click();
					Thread.sleep(3000);
				}catch(Exception e)
				{
					e.printStackTrace();		
				}
			}
			static void closeApplication()
			{
				
				try
				{
					obrowser.quit();
				}catch(Exception e)
				{
					e.printStackTrace();		
				}
			}
}
