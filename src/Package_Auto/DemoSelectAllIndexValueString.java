package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelectAllIndexValueString {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver(); 
		driver.get("http://demo.guru99.com/test/guru99home/"); 		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.switchTo().frame("a077aa5e");
		//driver.findElement(By.xpath("html/body/a/img")).click();
		
		WebElement web=driver.findElement(By.id("awf_field-91977689"));
		Select dd=new Select(web);//SAP CO
		dd.selectByValue("awlist3483307");//
		Thread.sleep(5000);
		//dd.selectByIndex(0);
		//Thread.sleep(5000);
		//dd.selectByIndex(1);
		java.util.List<WebElement> option = dd.getOptions();
		int b=option.size();
		for(int i=0;i<b;i++)
		{
			WebElement wer = option.get(i);
			String h=wer.getText();
			System.out.println(h);
			dd.selectByIndex(i);
			Thread.sleep(5000);
		}
		
		dd.selectByValue("awlist3483307");
		driver.findElement(By.xpath("//h4/a[contains(text(),'MOBILE TESTING')]"));
	}

}
