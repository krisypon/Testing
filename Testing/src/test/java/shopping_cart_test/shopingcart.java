package shopping_cart_test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import po.po;

public class shopingcart {
	@Test
	public void login(){
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		po login = PageFactory.initElements(driver, po.class);
			
		driver.get("http://www.demoshop24.com/index.php?route=account/login");
		login.login();
		//login.getEmailField();		
		//driver.findElement(By.id("input-email")).sendKeys("hello@hello.com");
		//login.getpasswordfield();		
		//driver.findElement(By.id("input-password")).sendKeys("hellodarkness");
		//driver.findElement(By.cssSelector("input[value='Login']")).click();
		assertEquals(driver.getCurrentUrl(),"http://www.demoshop24.com/index.php?route=account/account");
		
		driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20_27");
		driver.findElement(By.cssSelector("button[onclick=\"cart.add('41', '1');\"]")).click();
		
		
//		driver.get("http://www.demoshop24.com/index.php?route=product/product&path=20_27&product_id=41");
//		driver.findElement(By.cssSelector("button[id='button-cart']")).click();
		driver.findElement(By.cssSelector("i[class='fa fa-shopping-cart']")).click();
		driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id=\"button-shipping-address\"]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[id=\"button-shipping-method\"]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"button-payment-method\"]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[value=\"Confirm Order\"]")).click();
		
		//assertEquals(driver.getCurrentUrl(),"http://www.demoshop24.com/index.php?route=checkout/success");
		
		
		//driver.quit();	
	}
}
