package Basic_Browser_cmd;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		
		dr.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		dr.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,1000)","");
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(dr).withTimeout(Duration.ofMinutes(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		dr.findElement(By.id("input-to-name")).sendKeys("Janice");
	}

}
