package Basic_Browser_cmd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\janic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();//javascript files it will not accept so to map we have to write chromeoptions
		co.addArguments("--remote-allow-origins=*");
		WebDriver dr=new ChromeDriver(co);
		dr.get("https://www.google.com/");
		dr.manage().window().maximize();
		dr.findElement(By.className("gLFyf")).sendKeys("Janice");
		
		WebDriverWait wait=new WebDriverWait(dr,Duration.ofSeconds(20));
		WebElement re=wait.until(ExpectedConditions.elementToBeClickable(By.className("gNO89b")));
		
		dr.findElement(By.className("gNO89b")).submit();
		dr.quit();
	}

}
//implicit wait will wait till the given time
//explicit wait will wait till the button executes but not for hours 