package TestScripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebelement2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ultimatesoftware.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Watch tour tag name
		WebElement dd=driver.findElement(By.xpath("/html/body/header/div[2]/nav/div[2]/ul/li[5]/a"));
		String tag=dd.getTagName();
		System.out.println(tag);
		dd.click();

		Thread.sleep(3000);

		WebElement	a=driver.findElement(By.xpath("//*[@id=\"master-breadcrumbs\"]/span[1]/a"));
		String b=a.getText();
		System.out.println(b);
		a.click();

		WebElement c=driver.findElement(By.xpath("//*[@id=\"prime\"]/li[2]/a"));

		String	d=c.getAttribute("title");
		System.out.println(d);

		driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
		WebElement e=driver.findElement(By.xpath("//input[@class='search__input']"));
		Point f=e.getLocation();
		System.out.println(f);
		
		WebElement er=driver.findElement(By.xpath("//input[@class='search__input']"));
		String cc=er.getCssValue("color");
		System.out.println(cc);

		//tagName + getText + getAttribute + getLocation method + getCssValue


	}
}