package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebElement3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://register.freecrm.com/register/");
		driver.manage().window().maximize();

		//Using is Displayed method to check Sign Up button
		WebElement	dis=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button"));
		boolean a=dis.isDisplayed();
		System.out.println("sign up button is displayed" +" = "+ a);

		//Using isSelected method to check Agreement check box
		WebElement sel=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		boolean c=sel.isSelected();
		System.out.println("Agreement T&C box is selected" +" = "+ c);

		/*WebElement sel2=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		sel2.click();
		boolean d=sel.isSelected();
		System.out.println("Agreement T&C box is selected" +" = "+ d);
		 */
		//Using isEnabled method to check
		WebElement	enb=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button"));
		boolean b=enb.isEnabled();
		System.out.println("sign up button is Enabled" +" = "+ b);

		//Using cssValue to find the color no.
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button")).click();
		String ddd=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/ul/li[1]")).getCssValue("color");
		System.out.println(ddd);
		
		//isDisplayed  + isSelected + isEnabled + cssValue methods.
		
		
	}
}