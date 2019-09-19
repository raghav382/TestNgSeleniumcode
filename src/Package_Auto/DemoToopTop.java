package Package_Auto;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoToopTop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		//String g1=driver.findElement(By.xpath("(//img[@class='product-image'])[23]")).getAttribute("title");
		
		//Actions actions = new Actions(driver);
		//WebElement target=driver.findElement(By.xpath("(//img)[23]"));
		//Thread.sleep(50000);
		//actions.moveToElement(target).build().perform();
		//System.out.println(g1);
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//img)[23]")).click();
		
		 // Create action class object
		Actions builder=new Actions(driver);
		 
		// find the tooltip xpath
		 WebElement username_tooltip=driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]"));
		 
		 System.out.println(username_tooltip);
		// Mouse hover to that text message
		builder.moveToElement(username_tooltip).perform();
		 
		// Extract text from tooltip
		 String tooltip_msg=username_tooltip.getText();
		 
		// Print the tooltip message just for our refrences
		 System.out.println(tooltip_msg);
		 
		 //Dimension r=username_tooltip.getSize();
	}

}
