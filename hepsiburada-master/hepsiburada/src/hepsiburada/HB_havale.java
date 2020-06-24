package hepsiburada;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class HB_havale {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\work\\webdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

		
		driver.get("https://www.hepsiburada.com/uyelik/giris?ReturnUrl=%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);//for the passing of captche i should pass manuel to this step because of this step  
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("mehmetbaytekin36@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234567");
		driver.findElement(By.cssSelector("button.btn.full.btn-login-submit")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'SearchBoxOld\']/div/div/div[1]/div[2]/div/input")).sendKeys("kitap");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'SearchBoxOld\']/div/div/div[2]")).click();
		Thread.sleep(4000);
	

		driver.findElement(By.cssSelector("li.search-item:nth-child(2) > div:nth-child(1) > a:nth-child(2) > figure:nth-child(1) > div:nth-child(1) > img:nth-child(1)")).click(); //kitaba týkla
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#addToCart")).click(); //sepete ekle
		Thread.sleep(3000);
		
	
		driver.findElement(By.cssSelector("a.OldMyAccount-2OvEz")).click(); //go to shoppingchart
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn-primary")).click(); //done shopping
		Thread.sleep(2000);
		//complicate the adress
		driver.findElement(By.id("first-name")).sendKeys("mehmet");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("baytekin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.control-group:nth-child(3) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".dropup > div:nth-child(2) > ul:nth-child(2) > li:nth-child(24) > a:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.control-group:nth-child(4) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div.control-group:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(8) > a:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys("kadýköy kuyubasý no:1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='address-name']")).sendKeys("ev");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("5071922060");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.btn-primary:nth-child(1) > span:nth-child(1)")).click();
		
		
		//payment page
	
		driver.findElement(By.cssSelector(".paymentType-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li.group:nth-child(4)")).click(); //banka seçimi
		driver.findElement(By.cssSelector("button.btn-primary")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn:nth-child(2)")).click();
		
		Thread.sleep(4000);
		
	//canceled of order
		driver.findElement(By.cssSelector(".link-type-one")).click(); //hesabým
		Thread.sleep(3000);
	
		
		driver.findElement(By.cssSelector("a.hb-button")).click(); //iptal butonu
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".selectbox-icon > svg:nth-child(1)")).click();//iptalnedeni secenek açma
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".selectbox-result__list > li:nth-child(3)")).click(); // seçenek seçme
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.hb-button:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".modal__body__close-button > svg:nth-child(1)")).click(); //pencereyi kapatma
		Thread.sleep(3000);
		//log out 
		
		driver.findElement(By.cssSelector(".StaticMenuItem-Mw8y0")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
