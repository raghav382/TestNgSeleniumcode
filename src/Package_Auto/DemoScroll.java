package Package_Auto;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoScroll {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("https://irctc.co.in/"); 		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor javae=(JavascriptExecutor)driver;
		javae.executeScript("window.scrollBy(0,500)", "");
		File screenfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(screenfile,new File("D:\\files\\raghu.bmp"));
	}

}
