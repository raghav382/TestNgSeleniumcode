package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoContextclick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("https://irctc.co.in/"); 		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
WebElement WE=driver.findElement(By.xpath("//img[@alt='Domestic Air Packages']"));
		Actions ACT=new Actions(driver);
		ACT.moveToElement(WE, 150, 250);
		Thread.sleep(5000);
		JavascriptExecutor javae=(JavascriptExecutor)driver;
		javae.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(3500);
		ACT.contextClick(WE).perform();
		ACT.sendKeys(Keys.ARROW_DOWN).perform();
		ACT.sendKeys(Keys.ENTER).perform();
	
	}

}
