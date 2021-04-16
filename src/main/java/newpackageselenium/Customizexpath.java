package newpackageselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class Customizexpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ghghhghghhg");
		//driver.findElement(By.xpath("//input[@tabindex=1]")).sendKeys("jdjdjdjdjdjdjd");
		//u[contains(text(),'Create a new account')]
		//driver.findElement(By.xpath("//u[contains(text(),'Create a new account')]")).click();
		//driver.findElement(By.xpath("//u[text()='Create a new account']")).click();

		//String s = driver.findElement(By.xpath("//div[@class='logtext']")).getText();
		//System.out.println(s);
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//driver.findElement(By.xpath("//u[contains(text(),'Forgot Password?')]")).click();
		//driver.findElement(By.xpath("//*[@class='f12']")).click();
		//driver.findElement(By.xpath("//*[@class='black' and @href='https://www.rediff.com/getahead/report/rubina-dilaiks-top-10-bigg-boss-looks/20210223.htm']")).click();
	    
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
