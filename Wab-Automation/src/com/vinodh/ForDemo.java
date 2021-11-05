package com.vinodh;

import org.apache.log4j.Logger;

public class ForDemo {

	public static Logger logs=Logger.getLogger("Automation...");
	public static void main(String[] args) {
		logs.info("The For Loop Output Starts here...");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				logs.info("Even Number :"+i);
			}
		}
		logs.info("The For Loop Output Ends here...");

	}

}