package RestAPI.RestAPI;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ABC {
@Test
	public void test() {
	final String chromeDriverPath=System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe";
	final String firefoxDriverPath=System.getProperty("user.dir")+"\\BrowserDrivers\\geckodriver.exe";
	System.setProperty("webdriver.chrome.driver",chromeDriverPath);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
		WebDriver driver= (WebDriver)(new ChromeDriver(options));
		System.setProperty("webdriver.gecko.driver",firefoxDriverPath);
		//driver=new FirefoxDriver();
		//driver.get("https://targetjobs.co.uk/careers-advice/job-descriptions/454191-qa-analyst-job-description");
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		ArrayList<WebElement> windows=new ArrayList<WebElement>();
		windows.add((WebElement) driver.getWindowHandles());
		
		
		for(WebElement s: windows)
			System.out.println(s);
		WebElement drag=driver.findElement(By.xpath("//*[contains(@class,'clearfix ui-corner-top ng-tns-c45-2 ng-star-inserted')]"));
		 Actions action=new Actions(driver); 
		 action.dragAndDropBy(drag, 100, 200);
		 JavascriptExecutor jse =  (JavascriptExecutor)driver;
		 WebElement scrollto=driver.findElement(By.xpath("//*[contains(text(),'OK')]"));
		 jse.executeScript("arguments[0].scrollIntoView(true)", scrollto);
		 scrollto.click();
		
	}

}
