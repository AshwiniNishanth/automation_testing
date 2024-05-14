package BasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TasksPage {

	public void tasks(WebDriver driver) {
		driver.findElement(By.xpath("//a[@href='/products']")).click();

	}

	public void clickOnButton(WebDriver driver) { 
		driver.findElement(By.xpath("//button[@class='btn btn-default cart']")).click();	

	}
	public void addToCart(WebDriver driver) { 
		driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();

	}
	public void submit(WebDriver driver) { 
		driver.findElement(By.xpath("//button[@id='button-review']")).click();	

	}
	public void clickOnCart(WebDriver driver) { 
		driver.findElement(By.xpath("//a[@href='/view _cart']")).click();	

	}
	public void checkout(WebDriver driver) { 
		driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();

	}
	public void placeOrder(WebDriver driver) {
		driver.findElement(By.xpath("//a[@href='/payment']")).click();
	}
	public void invoice(WebDriver driver) {
		driver.findElement(By.xpath("//a[text()='Download Invoice']")).click();
	}
	public void cardDetails(WebDriver driver) {
		
	}
	
} 
