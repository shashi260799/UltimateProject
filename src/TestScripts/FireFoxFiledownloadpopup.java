package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxFiledownloadpopup {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("https://www.java.com/en/download/");


}
}
