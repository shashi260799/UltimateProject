package TestScripts;



import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Ukg_Image {
	public static void main(String[] args) throws InterruptedException {

		//Setting the path of chrome browser.
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		//Lunching chrome browser
		WebDriver driver = new ChromeDriver();

		//wait for 10sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// entering url
		driver.get("https://www.ultimatesoftware.com/");

		// maximising broswer
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='UKG']")).click(); 


		// switching to new browser tab
		ArrayList<String> ar= new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(ar.get(1));
		
		WebElement img=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/a/img"));
		
		// verify image
		if (img.isDisplayed()) {
			System.out.println("UKG Image is Displayed");

		} else {
			System.out.println("UKG image is not displayed");
		}
		driver.quit();
	}
}