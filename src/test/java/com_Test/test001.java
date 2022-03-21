package com_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com_Utility.baseClass;
import pageobjectmodel.loginpom;

public class test001 extends baseClass {

	
	
	//@Test
	public void test1() {
		loginpom fn=PageFactory.initElements(driver, loginpom.class);
		WebElement fn1=fn.getfirstname();
		WebElement ln1=fn.getlastname();
		
		
		lib.sendkeys(fn1, "abc");
		lib.sendkeys(ln1, "jkl");
	}
	
	
	@Test
	public void test2() {
		
		loginpom fn=PageFactory.initElements(driver, loginpom.class);
		WebElement FN=fn.getfirstname();
		WebElement LN=fn.getlastname();
		
		
		lib.sendkeys(FN, excel.stringData("Sheet1", 0, 0));
		lib.sendkeys(LN, excel.stringData("Sheet1", 1, 0 ));
	}
}
