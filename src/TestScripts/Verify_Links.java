
package TestScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Links {


	public static void main(String[] args) throws InterruptedException {

		//Setting the path of chrome browser.
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		//Lunching chrome browser
		WebDriver driver = new ChromeDriver();

		// maximising broswer
		driver.manage().window().maximize();

		// entering url
		driver.get("https://www.ultimatesoftware.com/");

		//wait for 10sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='Ultimate Software' ]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
		driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("software");
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='search__input']")).clear();*/
		
		
		driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys(Keys.ENTER);

		String  text1=driver.findElement(By.xpath("//*[@id=\"SearchResults\"]/ul/li[1]/div/div/a")).getText();
		System.out.println(text1);
		
		
		String txt2=driver.findElement(By.xpath("//*[@id=\"SearchResults\"]/ul/li[2]/div/div/a")).getText();
		System.out.println(txt2);
		
		driver.close();
	
	}
}
