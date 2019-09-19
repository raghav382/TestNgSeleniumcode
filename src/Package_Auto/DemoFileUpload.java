package Package_Auto;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFileUpload extends hum{

	public static void main(String[] args) throws InterruptedException {
		//doubleclickdemo demo=new doubleclickdemo();
		doubleclickdemo db = new hum();
		db.doubleck();
		
	}
}

interface doubleclickdemo
{
	public void doubleck() throws InterruptedException;
}

class hum implements doubleclickdemo
{
	public void doubleck() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.testandquiz.com/selenium/testing.html"); 		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebElement we=driver.findElement(By.id("dblClkBtn"));
		actions.doubleClick(we).perform();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		System.out.println("Successfully completed");
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(5000);
		alt.accept();
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(5000);
		alt.dismiss();
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		Thread.sleep(5000);
		String str=alt.getText();
		System.out.println(str);
		alt.accept();
	}
	
}