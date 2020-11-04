package MainScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Selenium_Demo {


	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		//TC_01_Verify UKG image in UKG page

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ultimatesoftware.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		driver.close();
		Thread.sleep(3000);
		System.out.println("rama");
		//TC_02_Verify first and second link in Ultimate Software Search Page.

		driver.switchTo().window(ar.get(0));
		driver.findElement(By.xpath("//*[@id=\"prime\"]/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("software");
		driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys(Keys.ENTER);

		String  text1=driver.findElement(By.xpath("//*[@id=\"SearchResults\"]/ul/li[1]/div/div/a")).getText();
		System.out.println(text1);
		String txt2=driver.findElement(By.xpath("//*[@id=\"SearchResults\"]/ul/li[2]/div/div/a")).getText();
		System.out.println(txt2);
		driver.navigate().back();
		Thread.sleep(3000);

		//TC_03_Verify the entered Text is cleared in Ultimate Software search field

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
		String text3=driver.findElement(By.xpath("//*[@id=\"SearchResults\"]/ul/li[1]/div/div/a")).getText();
		System.out.println(text3);
		driver.navigate().back();
		Thread.sleep(3000);
		//click + + sendKeys + clear + submit methods	

		//TC_04_Verify Watch Demo TagName, Verify Home Text, verify Title of Korons Header, Verify location of search box and CSS value

		// Watch tour tag name
		WebElement dd=driver.findElement(By.xpath("/html/body/header/div[2]/nav/div[2]/ul/li[5]/a"));
		String tag=dd.getTagName();
		System.out.println(tag);
		dd.click();

		Thread.sleep(3000);

		WebElement	h=driver.findElement(By.xpath("//*[@id=\"master-breadcrumbs\"]/span[1]/a"));
		String g=h.getText();
		System.out.println(g);
		h.click();
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

		driver.navigate().back();
		Thread.sleep(3000);
		//tagName + getText + getAttribute + getLocation method + getCssValue

		//TC_05_Verify SignUp button is displayed, Agrement T&C is Selected and signUp button is Enable in Home Page.

		driver.navigate().to("https://register.freecrm.com/register/");

		//Using is Displayed method to check Sign Up button
		WebElement	dis=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button"));
		boolean j=dis.isDisplayed();
		System.out.println("sign up button is displayed" +" = "+ j);

		//Using isSelected method to check Agreement check box
		WebElement sel=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		sel.click();
		boolean k=sel.isSelected();
		System.out.println("Agreement T&C box is selected" +" = "+ k);


		//Using isEnabled method to check
		WebElement	enb=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button"));
		boolean l=enb.isEnabled();
		System.out.println("sign up button is Enabled" +" = "+ l);
		//isDisplayed  + isSelected + isEnabled
		Thread.sleep(6000);

		//TC_06_Verify FileUpload Popup.


		driver.navigate().to("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		Thread.sleep(5000);
		WebElement browserBtm = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(5000);
		browserBtm.sendKeys("C:\\Users\\ShashiBhushan\\Desktop\\xpathLocators.docx");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div/div[2]/div[2]/div/button[1]")).click();
		Thread.sleep(5000);
		System.out.println("File uplaoded successfully");

		Thread.sleep(5000);

		//TC_07_Verify FileDownload Popup.

		driver.navigate().to("https://www.mozilla.org/en-US/firefox/new/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"protocol-nav-download-firefox\"]/a")).click();
		Thread.sleep(5000);
		System.out.println("File downloading started");

		// TC_08	Select date from Hidden Division PopUp
		String travolook="https://www.travolook.in/?gclid=Cj0KCQjw8rT8BRCbARIsALWiOvTRqa-d6M47DoBE-At6C0WmbJPP5h8VmGsbaBiS1tnXkXBybl2KbHUaAgNUEALw_wcB";
		driver.navigate().to(travolook);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"Fly_depdate_val\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[5]/td[2]/a")).click();
		System.out.println("Date 30th nov is selected");
		// Tc_08
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
		//Tc_10
		driver.navigate().to("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		fruits.deselectByIndex(1);
		fruits.deselectAll();
	}
}


