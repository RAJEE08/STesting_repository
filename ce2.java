package Basic_Browser_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ce2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		
		dr.get("https://demo.opencart.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(5000);
		 dr.findElement(By.linkText("Returns")).click();
		Thread.sleep(5000);
		dr.navigate().back();
	dr.findElement(By.linkText("Gift Certificates")).click();
		Thread.sleep(5000);
		dr.navigate().back();
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(5000); 
		 dr.close();
	}

}

	