package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hiddendivisionpopup {
	public static void main(String[] args) throws InterruptedException {
		// TC_08	Select date from Hidden Division PopUp
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// TC_08	Select date from Hidden Division PopUp
		String travolook="https://www.travolook.in/?gclid=Cj0KCQjw8rT8BRCbARIsALWiOvTRqa-d6M47DoBE-At6C0WmbJPP5h8VmGsbaBiS1tnXkXBybl2KbHUaAgNUEALw_wcB";
		driver.navigate().to(travolook);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"Fly_depdate_val\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[5]/td[2]/a")).click();

		String date=driver.findElement(By.xpath("//*[@id=\"Fly_depdate_val\"]/big")).getText();
		Thread.sleep(3000);
		if (date.equals("30")) {
			System.out.println("Date is verified");
		} else {
			System.out.println("Date is not verified");
		}
	}
}

