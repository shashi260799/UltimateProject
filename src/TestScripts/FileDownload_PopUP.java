package TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload_PopUP {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.mozilla.org/en-US/firefox/new/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"protocol-nav-download-firefox\"]/a")).click();
		System.out.println("File downloading started");
		
	
}
}