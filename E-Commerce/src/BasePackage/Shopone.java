package BasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Shopone extends BaseClass {
	@Test
	public void women() {
		pt.tasks(driver);
		driver.findElement(By.xpath("//a[@href='#Women']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/1']")).click();
		driver.findElement(By.xpath("//a[@href='/product_details/3']")).click();
		pt.clickOnButton(driver); 
		pt.addToCart(driver);
		String yn=  xlib.getExcelData("Review", 1, 0);
		String em=  xlib.getExcelData("Review", 1, 1);
		String ds=  xlib.getExcelData("Review", 1, 2);
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys(yn);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(em);
		driver.findElement(By.xpath("//textarea[@placeholder='Add Review Here!']")).sendKeys(ds);
		pt.submit(driver);
		pt.clickOnCart(driver);
		pt.checkout(driver);
		pt.placeOrder(driver);
		String nc=  xlib.getExcelData("Card", 1, 0);
		String cn=  xlib.getExcelData("Card", 1, 1);
		String cvc=  xlib.getExcelData("Card",1, 2);
		String mm=  xlib.getExcelData("Card", 1, 3);
		String yy=  xlib.getExcelData("Card", 1, 4);
		driver.findElement(By.xpath("//input[@name='name_on_card']")).sendKeys(nc);
		driver.findElement(By.xpath("//input[@name='card_number']")).sendKeys(cn);
		driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys(cvc);
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys(mm);
		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys(yy);	
		driver.findElement(By.xpath("//button[text()='Pay and Confirm Order']")).click();
		pt.invoice(driver);

	}
}
