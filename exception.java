package Basic_Browser_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		
		dr.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		dr.manage().window().maximize();
		try {
			dr.findElement(By.className("form-check-inp")).click();
		}
		catch(NoSuchElementException e)
		{
//			throw e;
			dr.close();
			System.out.print("Element not found");
		}
	}

}
