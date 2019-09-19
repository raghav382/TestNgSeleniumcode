package Package_Auto;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.modifier.SyntheticState;

public class DemoTimeoutWindow {

	public static void main(String[] args) throws Exception{

		System.setProperty("webdriver.chrome.driver", "D:\\javaProg\\files\\chromedriverlatest.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebDriverWait wait=new WebDriverWait(driver, 20);
driver.get("https://www.toolsqa.com/selenium-webdriver/find-all-the-links/");
driver.manage().window().maximize();
System.out.println("Maximised");
String r1=driver.getTitle();
System.out.println(r1);
driver.findElement(By.xpath("//a[@class='gb_z gb_rc']")).click();
String drop=driver.findElement(By.xpath("//ul[@class='gb_E gb_w']")).getText();
System.out.println(drop);
//List<WebElement> links = driver.findElements(By.tagName("a"));
//for(WebElement we : links) {
//   try
  // {
	//if("Privacy".equals(we.getText())) 
   //{
     // we.click();
      //WebDriverWait wait1=new WebDriverWait(driver, 20);
     //Thread.sleep(20000);
      //String r2=driver.getTitle();
      //System.out.println(r2);
      //System.out.println("Got the right link");
   //}
   //}
	//catch(Exception er)
	//{
		//System.out.println("Failed to get title");
	//}
	//}
try
{
	//java.util.List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text'")); 
	//java.util.List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='textField']"));
	//System.out.println(textboxes.size());
	//System.out.println(textboxes.size());
java.util.List<WebElement> links = driver.findElements(By.tagName("a href"));

System.out.println(links.size());


for (int i = 1; i<=links.size(); i=i+1)

{

System.out.println(links.get(i).getText());

}
}
catch (Exception er)
{
	System.out.println("failed to get array");
}
}
}