package com.ait.actitime.Baseclass;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;
	public Excel xlib;
	
	@BeforeClass
	public void OpenBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/aj/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void Login() {
		xlib=new Excel();
		String un= xlib.getExcelData("Login", 1, 0);
		String pw= xlib.getExcelData("Login", 1, 1);	
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login']")).click();

	}

	@AfterMethod
	public void Logout() {
		driver.findElement(By.id("logoutLink")).click();;

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
