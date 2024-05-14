package com.ait.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ait.actitime.Baseclass.BaseClass;

public class DeleteCustomer extends BaseClass {
	@Test
	public void testDeleteCustomer() {
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.xpath("//div[@class='plusIcon']")).click();
		String sa= xlib.getExcelData("Delete Customer", 1, 0);
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name...'])[1]")).sendKeys(sa);
		driver.findElement(By.xpath("//div[text()='\"+dc+\"']/../..//div[@class='editButton']")).click();
		driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Delete permanently'])[1]")).click();
	}
}
