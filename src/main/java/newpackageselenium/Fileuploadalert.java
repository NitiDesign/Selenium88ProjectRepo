package newpackageselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadalert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\hp p077tx\\Pictures\\Screenshots\\Screenshot (34).png");
		Thread.sleep(3000);
		driver.findElement(By.name("note")).sendKeys("This is a new note by niti");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Press']")).click();
		
	}

}
