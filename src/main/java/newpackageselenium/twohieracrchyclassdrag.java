package newpackageselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class twohieracrchyclassdrag {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));

		WebElement source1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
		WebElement subsource1 = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(source).moveToElement(source1).build().perform();
		Thread.sleep(2000);
		//action.moveToElement(source1).build().perform();
		//subsource1.click();
		
		

		
		

	}

}
