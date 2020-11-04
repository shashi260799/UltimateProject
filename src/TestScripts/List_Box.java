package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Selecting Items in a Multiple SELECT elements
		Thread.sleep(5000);
				driver.navigate().to("http://jsbin.com/osebed/2");
				Select fruits = new Select(driver.findElement(By.id("fruits")));
				fruits.selectByVisibleText("Banana");
				fruits.selectByIndex(1);
				fruits.deselectByIndex(1);
				fruits.deselectAll();
				
	}

}
