package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;

public class DemoAction_Mouse_Keyboard {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\JavaAutomation\\Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumtrainingbangalore.com/"); 		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		Thread.sleep(5000);
		try
		{
		WebElement WE=driver.findElement(By.xpath("//a[text()='Branches']"));
		WebElement vf=driver.findElement(By.xpath("//a[text()='Marathahalli']"));
		WebElement Mar=driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
		Actions Act=new Actions(driver);
		Act.moveToElement(WE).perform();
		Thread.sleep(3000);
		Act.moveToElement(vf).perform();
		Thread.sleep(3000);
		Act.moveToElement(Mar).perform();
		Thread.sleep(5000);
		Act.contextClick(Mar).sendKeys(Keys.RETURN).sendKeys("T").build().perform();
		//Act.sendKeys(Keys.SHIFT).build();
		//Act.sendKeys(Keys.ARROW_DOWN).perform();
		//Act.sendKeys(Keys.ENTER).perform();
		//Act.sendKeys(Keys.ENTER).perform();
		//Act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_RIGHT).perform();
		//Thread.sleep(3000);
		//Act.moveToElement(Mar).perform();
		//Thread.sleep(5000);
		//Act.contextClick(Mar).sendKeys(Keys.ARROW_DOWN).perform();
        //Act.contextClick().keyDown(Keys.ARROW_DOWN).perform();
		//Thread.sleep(3000);
		//Act.keyDown(Keys.ARROW_DOWN).perform();
		//Act.sendKeys(Keys.SHIFT).build();
		//Act.sendKeys("T").perform();
		//Thread.sleep(5000);
		//Act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		}
		catch (Exception e)
		{
		System.out.println("Failed");	
		}
	}

}
