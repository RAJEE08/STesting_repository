package Basic_Browser_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		
		dr.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		dr.manage().window().maximize();
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[2]/div[2]/div[2]/div/select"));
		country.click();
Select select =new Select(country);
		 	select.selectByValue("IN");
	}

}
