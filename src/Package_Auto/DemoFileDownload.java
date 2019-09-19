package Package_Auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.log.SessionLogsToFileRepository;

public class DemoFileDownload {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		FirefoxProfile Fox=new FirefoxProfile();
		FirefoxOptions options = new FirefoxOptions();
		
		Fox.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		Fox.setPreference("browser.download.folderList",0);
		Fox.setPreference("browser.download.DownloadDir","D:\\files\\files\\");
		System.setProperty("webdriver.gecko.driver","D:\\JavaAutomation\\Files\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver(Fox);
		options.setProfile(Fox);
		 WebDriver driver = new FirefoxDriver(options);
		
		//FirefoxProfile profile = new FirefoxProfile();
		//profile.setPreference("browser.download.dir", "D:\\files\\files\\");  // folder
		//profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");  // MIME type
		//profile.setPreference("pdfjs.disabled", true);  // disable the built-in viewer
		//profile.setPreference("browser.download.folderList", 0);
		//profile.setPreference("browser.download.panel.shown", false);
		//profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
	    //profile.setPreference("browser.download.manager.focusWhenStarting", false);
	    //profile.setPreference("browser.download.manager.useWindow", false);
	    //profile.setPreference("browser.download.manager.showAlertOnComplete", false);
	    //profile.setPreference("browser.download.manager.closeWhenDone", false);
	    

		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		//capabilities.setCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR, 1);

		//WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("close")).click();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/table[1]/tbody/tr[1]/td[4]/a")).click();
	}

}
