package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handleFrames();
	}
	
	static void launchBrowser()
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
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void handleFrames()
	{
		try
		{
			oBrowser.switchTo().frame(0);
	//		oBrowser.switchTo().frame("packageListFrame"); ------>  <iframe src="overview-frame.html" name="packageListFrame" title="All Packages"></iframe>
			oBrowser.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			oBrowser.switchTo().frame("packageFrame"); // <iframe src="allclasses-frame.html" name="packageFrame" title="All classes and interfaces (except non-static nested types)"></iframe>
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			WebElement oFrame=oBrowser.findElement(By.cssSelector(".rightIframe"));
			oBrowser.switchTo().frame(oFrame);
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}
