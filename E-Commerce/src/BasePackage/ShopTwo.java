package BasePackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShopTwo extends BaseClass {
	@Test
	public void men() {
		pt.tasks(driver);
		driver.findElement(By.xpath("//a[@href='#Men']")).click();
		driver.findElement(By.xpath("//a[@href='/category_products/3']")).click();
		driver.findElement(By.xpath("//a[@href='/product_details/2']")).click();
		pt.clickOnButton(driver); 
		pt.addToCart(driver);
		String mn=  xlib.getExcelData("ReviewMen", 1, 0);
		String me=  xlib.getExcelData("ReviewMen", 1, 1);
		String md=  xlib.getExcelData("ReviewMen", 1, 2);
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys(mn);
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys(me);
		driver.findElement(By.xpath("//textarea[@placeholder='Add Review Here!']")).sendKeys(md);
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
