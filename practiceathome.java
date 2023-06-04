package Basic_Browser_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practiceathome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		
		dr.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		dr.manage().window().maximize();
WebElement button= dr.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]"));
		
		
		boolean isSelected = button.isSelected();

		// performing click operation if element is not selected 
		if(isSelected == false) {
			button.click();
		}
WebElement button1= dr.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Scanner\"]"));
		
		
		boolean isSelected1 = button1.isSelected();

		// performing click operation if element is not selected 
		if(isSelected1 == false) {
			button1.click();
		}



	}

}
