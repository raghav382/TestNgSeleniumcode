package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChromLatest {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
WebDriver driver5=new ChromeDriver();
//driver5.get("https://www.redbus.in/");
driver5.manage().window().maximize();
driver5.get("https://www.redbus.in/");
driver5.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//driver2.findElement(By.xpath("//span[contains@class,'calendar_icon-new icon')]")).click();
driver5.findElement(By.id("src")).sendKeys("Bengaluru");
Thread.sleep(4000);
//driver5.findElement(By.xpath("//li[text()='Bengaluru']")).click();
driver5.findElement(By.id("dest")).sendKeys("Hubli");
Thread.sleep(4000);
//driver5.findElement(By.xpath("//li[text()='Hubli']")).click();
Thread.sleep(4000);
driver5.findElement(By.xpath("(//span[contains(@class,'icon-onward-calendar')])")).click();
driver5.findElement(By.xpath(("(//td[text()='28'])[2]"))).click();
driver5.findElement(By.xpath("//button[@id='search_btn']")).click();
Thread.sleep(20000);
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
