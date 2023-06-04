package Basic_Browser_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		
		dr.get("https://demo.smart-hospital.in/site/login");
		dr.manage().window().maximize();
		WebElement button= dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/a[2]"));
		
		
					button.click();

					WebElement button1= dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button"));
					
					
					button1.click();

					dr.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a")).click();		
	}

}
