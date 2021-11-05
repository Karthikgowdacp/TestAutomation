package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass7 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createtask();
		CreateNewCustomer();
		CreateProject();
		Createtasks();
		Deletetasks();
		DeleteProject();
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
			
			static void CreateProject()
			{
				try
				{
			oPage.getAddnewp().click();
			Thread.sleep(2000);
			oPage.getAddproject().click();
			Thread.sleep(2000);
			oPage.getEnteProjectName().sendKeys("rocy");
			  Thread.sleep(2000);
			  oPage.getCreateProject().click();
				Thread.sleep(2000);
				}catch(Exception e)
				{
					e.printStackTrace();		
				}
			}
				
				static void Createtasks()
				{
					try
					{
				
				oPage.getAddNewTask().click();
				Thread.sleep(2000);
				oPage.getCreatenewtasks().click();
				Thread.sleep(2000);
				oPage.getEntertaskname().sendKeys("cp");
				Thread.sleep(2000);
				oPage.getCreateTasksbutton().click();
				Thread.sleep(2000);
					}catch(Exception e)
					{
						e.printStackTrace();		
					}
				}
				
				static void Deletetasks()
				{
					try
					{
				
				oPage.gettaskRowCellWrapper().click();
				Thread.sleep(2000);
				oPage.gettaskaction().click();
		    	Thread.sleep(2000);
		    	oPage.gettaskDelete().click();
		    	Thread.sleep(2000);
		    	oPage.gettaskDeletepermanently().click();
		    	Thread.sleep(2000);
				
				
				}catch(Exception e)
				{
					e.printStackTrace();		
				}
			}
				
				static void DeleteProject()
				{
					try
					{
				
				oPage.geteditButton().click();
				Thread.sleep(2000);
				oPage.getaction().click();
				Thread.sleep(2000);
				oPage.getDeleteproject().click();
				Thread.sleep(2000);
				oPage.getDeletepermanentlyproject().click();
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

