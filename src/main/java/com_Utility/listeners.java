package com_Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import net.bytebuddy.utility.RandomString;

public class listeners extends baseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		String d=RandomString.make(3);
	File SRC=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destn=new File("C:\\Users\\jalindar.chougule\\eclipse-workspace\\Dummy_Data_Framework\\TestData.d.png");
	try {
		FileHandler.copy(SRC, destn);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

	public void onTestSuccess(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

}
