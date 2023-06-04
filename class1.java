package Basic_Browser_cmd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		
		//login button
		
		dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
		//profile button
		
	dr.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		Thread.sleep(5000);
//		//logout
		dr.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	
		
	}

}
