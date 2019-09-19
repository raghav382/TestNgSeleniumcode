package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Chrom_Latest {

	public static void main(String[] args) throws Exception {

//System.setProperty("webdriver.gecko.driver", "D:\\JavaAutomation\\Files\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();
//driver.get("https://facebook.com");
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//System.setProperty(", value)
		//driver.get("https://www.redbus.in/");
		System.setProperty("webdriver.ie.driver","D:\\JavaAutomation\\Files\\IEDriverServer.exe");
		WebDriver driver5=new InternetExplorerDriver();
		//driver5.get("https://www.redbus.in/");
		driver5.manage().window().maximize();
		driver5.get("https://www.redbus.in/");
		driver5.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver2.findElement(By.xpath("//span[contains@class,'calendar_icon-new icon')]")).click();
		driver5.findElement(By.id("src")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		//driver5.findElement(By.xpath("//li[text()='Bengaluru']")).click();
		driver5.findElement(By.id("dest")).sendKeys("Hubli");
		Thread.sleep(2000);
		//driver5.findElement(By.xpath("//li[text()='Hubli']")).click();
		Thread.sleep(4000);
		driver5.findElement(By.xpath("(//span[contains(@class,'icon-onward-calendar')])")).click();
		driver5.findElement(By.xpath(("(//td[text()='28'])[2]"))).click();
		driver5.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(10000);
		String r1=driver5.findElement(By.xpath("//div[contains(@class,'onward-modify-btn')]")).getText();
		System.out.println(r1);
		String s1=driver5.getCurrentUrl();
		if(r1.equals("Modify"))
		{
			System.out.println("loaded right page");
			driver5.close();

		}
}

}
