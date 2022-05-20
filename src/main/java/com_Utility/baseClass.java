package com_Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static WebDriver driver;
	public static configDataProvider config;
	public static library lib;
	public static excelDataProvider excel;
	public static listeners list;

	@BeforeSuite
	public void manage() throws IOException {
		config = new configDataProvider();
		lib = new library();
		excel = new excelDataProvider();
		list = new listeners();
	}

	@BeforeMethod
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void teardown() throws InterruptedException {

		Thread.sleep(3000);

		driver.quit();
	}
}
