package newpackageselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		
		WebElement email = driver.findElement(By.name("username"));
		email.sendKeys("naveen");
		Thread.sleep(5000);
		driver.navigate().refresh();
		email.sendKeys("niti");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
