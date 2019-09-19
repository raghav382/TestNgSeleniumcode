package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSelectrun {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "D:\\JavaAutomation\\Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Boolean sele=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(sele);
		if(!sele)
		{
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
		}
		
		Boolean sele1=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(sele1);
	}

}
