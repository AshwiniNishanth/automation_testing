package com.ait.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ait.actitime.Baseclass.BaseClass;

public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() {
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.xpath("//div[@class='plusIcon']")).click();
		driver.findElement(By.xpath("//div[@class='item CreateNewCustomer']")).click();
		String cn=   xlib.getExcelData("Create Customer", 1, 0);
		String ds=     xlib.getExcelData("Create Customer", 1, 1);
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys(cn);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(ds);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();



	}
}
