package Package_Auto;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Demo_Parent_Child {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("http://demo.guru99.com/test/guru99home/"); 
		String e=driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
        //driver.findElement(By.xpath("//h4/a[contains(text(),'MOBILE TESTING')]")).click();
        //driver.get(e);
		//driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        String r=driver.getCurrentUrl();
        //if(e.equals (r))
        //{
        	//System.out.println("Fail");
       // }
        //else
        //{
        	//System.out.println("Pass");
        //}//ul[@class='dropdown-menu']
		
     java.util.List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
		//Traversing through the list and printing its text along with link address
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
			link.click();
			Thread.sleep(5000);
			driver.get(r);
			Thread.sleep(5000);
		}
	}

}
