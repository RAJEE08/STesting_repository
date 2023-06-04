package Basic_Browser_cmd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);//to import packages ctrl+shift+O
		dr.get("https://www.alibaba.com/");
		dr.manage().window().maximize();
		
		String t1="";
		t1=dr.getTitle();
		
	}

}
