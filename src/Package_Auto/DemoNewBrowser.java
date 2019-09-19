package Package_Auto;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoNewBrowser {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("https://irctc.co.in/"); 		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.findElement(By.id("loginText")).click();
		//driver.findElement(By.xpath("//a[@class='fa fa-window-close pull-right']")).click();
		WebElement HD_Mouse=driver.findElement(By.xpath("//a[text()=' HOLIDAYS ']"));
		WebElement ST=driver.findElement(By.xpath("(//span[text()='Special Trains'])[1]"));
		WebElement TP=driver.findElement(By.xpath("(//span[text()='Tourist Train'])[1]"));
		Actions Act=new Actions(driver);
		Act.moveToElement(HD_Mouse).perform();
		Act.moveToElement(ST).perform();
		Act.moveToElement(TP).click().perform();
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> Is=allwindows.iterator();
		String IRCTS=Is.next();
		System.out.println(IRCTS);
		String Tourist_Plain=Is.next();
		System.out.println(Tourist_Plain);
		driver.switchTo().window(Tourist_Plain);
		driver.findElement(By.xpath("//a[text()='Name']")).click();
		driver.close();
		driver.switchTo().window(IRCTS);
		driver.findElement(By.id("loginText")).click();
		System.out.println("Success");
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		driver.quit();
		
			
	}

}
