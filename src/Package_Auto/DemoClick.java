package Package_Auto;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoClick {

	public static void main(String[] args) throws Exception {


		
		//input[@id='ctl10_SO_GoogleSearch1_txtQuery']
		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ist.edu.pk/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='ctl10_SO_GoogleSearch1_txtQuery']")).sendKeys("Admissions");
		String y=driver.getCurrentUrl();
		System.out.println(y);
		driver.findElement(By.xpath("//input[@id='ctl10_SO_GoogleSearch1_ImageButton1']")).click();
		if(driver.findElement(By.xpath("//input[@id='ctl10_ctl01_ctl00_txtSearch']")).isDisplayed())
		{
			System.out.println("successfully landed");
			Thread.sleep(5000);
			driver.get(y);
			Actions act = new Actions(driver);
			WebElement username_tooltip=driver.findElement(By.xpath("//a[contains(text(),'Admissions')]"));
			String n=username_tooltip.getText();
			System.out.println(n);
			act.moveToElement(username_tooltip).perform();
			Thread.sleep(5000);
			
			java.util.List<WebElement> w1= driver.findElements(By.xpath("//li/a"));
		
			for(WebElement fg: w1)
			{
				System.out.println(fg.getText());
				fg.click();
				//fg.click();
			//int y1=qw.size();
			//System.out.println(y1);
			//qw.get(y1);
			//qw.get(y1).getText();
			//for(int p=0;p<y1;p++)
			//{
				//WebElement bn = qw.get(p);
				//String h=bn.getText();
				//System.out.println(h);
				//bn.click();
			//	itr.
			//	itr.findElement(By.xpath("//ul[@id='flexmenu16']//a[p]")).get(p).click();
				//itr.next().click();
				//Thread.sleep(5000);
				//driver.get(y);
			}
			
			
		}
		
		//else
		//{
			//System.out.println("wrong page");
			
	//	}
		}
		
	}
