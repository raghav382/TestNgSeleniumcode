package Package_Auto;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("guest_count")).click();
		WebElement sigleselect=driver.findElement(By.xpath("(//div[@class='ilbl selectbox a control'])/select/option[2]"));
		///html/body/div/div/select/option[4]
		Select dd=new Select(sigleselect);
		dd.selectByIndex(3);
		java.util.List<WebElement> listselect=dd.getOptions();
		int t = listselect.size();
		for(int i=0;i<=t;i++)
		{
			WebElement option1 = listselect.get(i);
			String te1=option1.getText();
			System.out.println(te1);
		}
		
	}

}
