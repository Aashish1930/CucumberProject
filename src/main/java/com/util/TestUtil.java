package com.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TestUtil extends com.base.TestBase {

	public static long PAGE_LOAD_TIMEOUT =60;
	public static long IMPLECIT_WAIT =60;


	public static void TakeScreenshot() throws IOException {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String CurrentDIr = System.getProperty("user.dir");
		FileHandler.copy(srcfile, new File(CurrentDIr + "/Screenshot/" + System.currentTimeMillis() + ".png"));

	}
	

	
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	

}
