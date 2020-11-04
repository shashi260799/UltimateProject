package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		Thread.sleep(5000);
		WebElement browserBtm = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(5000);
		browserBtm.sendKeys("C:\\Users\\ShashiBhushan\\Desktop\\xpathLocators.docx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/div/button[1]")).click();

		Thread.sleep(5000);
		driver.close();
	}

}


