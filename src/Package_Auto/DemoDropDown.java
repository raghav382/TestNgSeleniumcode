package Package_Auto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("http://demo.guru99.com/test/guru99home/"); 		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		List<WebElement> y=driver.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		int h=y.size();
		for(int i=0;i<h;i++)
		{
			WebElement s= y.get(i);
			System.out.println(s.getText());
		}
		
		 }	 
}