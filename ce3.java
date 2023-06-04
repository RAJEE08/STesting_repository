package Basic_Browser_cmd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ce3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);
		dr.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		dr.manage().window().maximize();
		//implicit wait command
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//bcoz we are decreasing the time which is not taken by the system so it is scored
		String t1="Purchase a Gift Certificate";
		String t2="";
		t2=dr.getTitle();
		if(t1.equals(t2))
		{
			System.out.print("Same");
		}
		else
		{
			System.out.println("Different");
		}
	}

}

//wait until the button is visible => explicit wait
