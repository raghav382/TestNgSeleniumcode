package Package_Auto;

import java.awt.List;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseHavorList {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ist.edu.pk/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		WebElement list=driver.findElement(By.xpath("//a[text()='Academics']"));
		WebElement d=driver.findElement(By.xpath("(//ul[@id='flexmenu7']//a)[1]"));
		actions.moveToElement(list).build().perform();
		driver.findElement(By.cssSelector("ul#flexmenu7 li:nth-of-type(2) a:nth-of-type(2)"));
		
		actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).perform();
		//actions.moveToElement(d).build().perform();
		//String textlist=list.getText();
		//System.out.println(textlist);
		//WebElement v1=driver.findElement(By.xpath("(//ul[@id='flexmenu7']//a)[1]"));
		WebElement v=driver.findElement(By.xpath("(//ul[@id='flexmenu7']//a)[5]"));
		System.out.println(v.getText());
		v.click();
		
		driver.findElement(By.cssSelector("ul#flexmenu7 li:nth-of-type(2) a:nth-of-type(2)"));
		
		
		
		}
		 
    

}
