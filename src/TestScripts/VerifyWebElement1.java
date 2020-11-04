package TestScripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebElement1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ultimatesoftware.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='Ultimate Software' ]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
		WebElement ab=driver.findElement(By.xpath("//input[@class='search__input']"));
		ab.sendKeys("software");
		ab.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		
		WebElement ab2=driver.findElement(By.xpath("//*[@id=\"box\"]"));
		ab2.clear();
		Thread.sleep(3000);
		ab2.sendKeys("HR");
		Thread.sleep(3000);
		ab2.submit();	
	//click + + sendKeys + clear + submit methods
		
		
}
	}