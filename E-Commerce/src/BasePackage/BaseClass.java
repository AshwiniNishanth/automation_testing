package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	public  WebDriver driver;
	public  Excel xlib;
	public  TasksPage pt;

	@BeforeClass
	public void openBrowser() {
		driver=new FirefoxDriver();
		xlib=new Excel();
		pt=new TasksPage();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		String un=	xlib.getExcelData("Login", 1, 0);
		String pw=	xlib.getExcelData("Login", 1, 1);
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(pw);
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
