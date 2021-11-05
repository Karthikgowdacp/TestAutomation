package com.sgtesting.pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvAss1 {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
//		createUser1();
	//	createUser2();
	//	createUser3();
//		logout1();
//		loginuser1();
//		logout2();
//		loginuser2();
//		logout3();
//		loginuser3();
//		logout4();
//		longinadminformodify();
//		modifypassworduser1();
//		modifypassworduser2();
    	modifypassworduser3();
	//	deleteUser();
	//	logout();
	//	closeApplication();
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
	static void createUser1()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getAddusers().click();
			Thread.sleep(2000);
			oPage.getFirstname().sendKeys("anadh");
			oPage.getLastname().sendKeys("ap");
			oPage.getEmail().sendKeys("viraj@2017");
			oPage.getUsername().sendKeys("user1");
			oPage.getpassword().sendKeys("2021");
			oPage.getRtpassword().sendKeys("2021");
			oPage.getCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	
	static void createUser2()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getAddusers().click();
			Thread.sleep(2000);
			oPage.getfirstName2().sendKeys("baharth");
			oPage.getlastName2().sendKeys("bp");
			oPage.getemailField2().sendKeys("viraj@2017");
			oPage.getUsername2().sendKeys("user2");
			oPage.getPassword2().sendKeys("20212");
			oPage.getRetypePassword2().sendKeys("20212");
			oPage.getCreateUser2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	
	static void createUser3()
	{
		try
		{
			oPage.getUsers().click();
			Thread.sleep(2000);
			oPage.getAddusers().click();
			Thread.sleep(2000);
			oPage.getfirstName3().sendKeys("harish");
			oPage.getlastName3().sendKeys("pb");
			oPage.getemailField3().sendKeys("viraj@2017");
			oPage.getUsername3().sendKeys("user3");
			oPage.getPassword3().sendKeys("20212");
			oPage.getRetypePassword3().sendKeys("20212");
			oPage.getCreateUser3().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	
	static void logout1()
	{
		try
		{
			oPage.getLogout1().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginuser1()
	{
		try
		{
			oPage.getusername1().sendKeys("user1");
			oPage.getpassword1().sendKeys("2021");
			oPage.getLogin1().click();
			Thread.sleep(4000);
			oPage.getStartexploring1().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logout2()
	{
		try
		{
			oPage.getLogout2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginuser2()
	{
		try
		{
			oPage.getusername2().sendKeys("user2");
			oPage.getpassword2().sendKeys("20212");
			oPage.getLogin2().click();
			Thread.sleep(4000);
			oPage.getStartexploring2().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logout3()
	{
		try
		{
			oPage.getLogout3().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void loginuser3()
	{
		try
		{
			oPage.getusername3().sendKeys("user3");
			oPage.getpassword3().sendKeys("20212");
			oPage.getLogin3().click();
			Thread.sleep(4000);
			oPage.getStartexploring3().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void logout4()
	{
		try
		{
			oPage.getLogout4().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void longinadminformodify()
	{
		try
		{
			oPage.getolonginadmin().sendKeys("admin");
			oPage.getadminpassword().sendKeys("manager");
			oPage.getLogin3().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifypassworduser1()
	{
		try
		{
			oPage.getouser1().click();
			Thread.sleep(4000);
			oPage.getuserNameCellfirst1().click();
			Thread.sleep(4000);
			oPage.getNewPassworduser1().sendKeys("123456");;
			oPage.getpasswordCopyuser1().sendKeys("123456");
			Thread.sleep(4000);
			oPage.getSaveChangesuser1().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifypassworduser2()
	{
		try
		{
			oPage.getouser2().click();
			Thread.sleep(4000);
			
			oPage.getuserNameCellfirst2().click();
			Thread.sleep(4000);
		oPage.getNewPassworduser2().sendKeys("123456");
			Thread.sleep(4000);
			oPage.getpasswordCopyuser2().sendKeys("123456");
			Thread.sleep(4000);
			oPage.getSaveChangesuser2().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifypassworduser3()
	{
		try
		{
			oPage.getouser3().click();
			Thread.sleep(4000);
			oBrowser.switchTo().frame(0);
			oPage.getuserNameCellfirst3().click();
			Thread.sleep(4000);
		    oPage.getNewPassworduser3().sendKeys("123456");
			Thread.sleep(4000);
			oPage.getpasswordCopyuser3().sendKeys("123456");
			Thread.sleep(4000);
			oPage.getSaveChangesuser3().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	static void deleteUser()
	{
		try
		{
			oPage.getdeleteUser().click();
			Thread.sleep(3000);
			oPage.getDeleteUser().click();
			Thread.sleep(3000);
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
