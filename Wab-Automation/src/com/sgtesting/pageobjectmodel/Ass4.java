package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass4 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createtask();
		CreateNewCustomer();
		ModifiyCustomer();
		DeleteCustomer();
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Exampleautomation\\Neweclipse\\Wab-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
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
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void createtask()
	{
		try
		{
			oPage.getTasks().click();
			Thread.sleep(2000);
			oPage.getAddnew().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
			
	static void CreateNewCustomer()
	{
		try
		{
		   oPage.getcreateNewCustomer().click();
		  Thread.sleep(2000);
		  oPage.getcustomerLightBox_nameField().sendKeys("karthik");
		  Thread.sleep(2000);
			oPage.getCreateCustomer().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
			
			static void ModifiyCustomer()
			{
				try
				{
			oPage.getCustomersettings().click();
			Thread.sleep(2000);
			oPage.gettaskListBlock().click();
			Thread.sleep(2000);
			oPage.getEnterCustomerreName().clear();
			  Thread.sleep(2000);
			oPage.getEnterCustomerreName().sendKeys("gowda");
			  Thread.sleep(2000);
			  oPage.getcloseButton().click();
				Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void DeleteCustomer()
	{
		try
		{
			oPage.getDeleteCustomer().click();
			Thread.sleep(2000);
			oPage.getAction().click();
			Thread.sleep(2000);
	    	oPage.getDelete().click();
	    	Thread.sleep(2000);
	    	oPage.getDeletepermanently().click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

	
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
