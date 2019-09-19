package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class DemoLogoVeri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Boolean b1= driver.findElement(By.id("headerContainer")).isDisplayed();
		Boolean de=driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		if(de && b1)
		{
			System.out.println("Image present");
			String te = driver.findElement(By.id("headerContainer")).getText();
			
			System.out.println(te);
			
		}
		else
		{
			System.out.println("Image not present");
		}
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		//driver.findElement(By.xpath("//div[@class='popup_menu_icon']")).click();
	}

}
