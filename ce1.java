package Basic_Browser_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ce1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		dr.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		dr.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,1000)","");
		
		dr.findElement(By.id("input-firstname")).sendKeys("Janice");
		dr.findElement(By.id("input-lastname")).sendKeys("Magdalene");
		dr.findElement(By.id("input-email")).sendKeys("janicemagdalene@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("janicemagdalene");
		//dr.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();relative xpath
		dr.findElement(By.id("input-newsletter-yes")).click();
		
		dr.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		 WebElement button=dr.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));
		 Thread.sleep(7000);
		 button.click();
		 ////*[@id="input-password"]
		 
		 ////*[@id="input-password"]
		 dr.close();
		}
		
	}

////*[@id="form-register"]/div/div/div/input


