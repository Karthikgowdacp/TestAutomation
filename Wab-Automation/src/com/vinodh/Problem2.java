package com.vinodh;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem2 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		createuser();
		modifyuser();
		deleteuser();
		logout();
		closeapplication();

	}
	
	static void launchbrowser()
	{
		try
		{
			 System.setProperty("webdriver.chrome.driver", "E:\\Exampleautomation\\Neweclipse\\Wab-Automation\\Library\\Drivers\\chromedriver.exe");
			 oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
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
		
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		//	Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
	//		Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("VINOD");
		//	Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Reddy");
		//	Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("vinod@gmail.com");
		//	Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("vinodreddy");
		//	Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
		//	Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
		//	Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("VIKAS");
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Reddy");
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("vikas@gmail.com");
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("vikasreddy");
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("654321");
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("654321");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
		e.printStackTrace();		
		}
	}
	static void closeapplication()
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