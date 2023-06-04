package Basic_Browser_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		dr.get("https://www.google.com/");
		dr.manage().window().maximize();
		//locators  sendKeys to write content in text box
		//dr.findElement(By.className("gLFyf")).sendKeys("Hello");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("hello");
		dr.findElement(By.xpath("//input[contains(@value,\"Google Search\")]")).submit();
		//dr.findElement(By.className("gNO89b")).submit();
		
	}

}
//{//=>tags}
//input[@name="btnI"]
//sendKeys(Keys.ENTER);