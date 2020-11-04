package TestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class {
	public static void main(String[] args) throws AWTException, InterruptedException {

		//Setting the path of chrome browser.
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		//Lunching chrome browser
		WebDriver driver = new ChromeDriver();

		// maximising broswer
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");

		Robot r= new Robot();

		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_E);

		r.keyPress(KeyEvent.VK_SPACE);

		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_F);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_W);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_ENTER);


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/span")).click();
		System.out.println("Ultimate software Home page is display");
		Thread.sleep(3000);

		driver.close();
	}

}
