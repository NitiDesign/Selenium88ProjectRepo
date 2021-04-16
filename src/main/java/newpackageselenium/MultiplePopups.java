package newpackageselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplePopups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String sd = driver.getTitle();
		System.out.println(sd);
		
		driver.findElement(By.xpath("//a[@title= 'Follow @seleniumeasy on Twitter']")).click();
		driver.findElement(By.xpath("//a[@title= 'Follow @seleniumeasy on Facebook']")).click();

		Set<String> Handles = driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();
		String parent1 = it.next();
		System.out.println("parent "+parent1);
		
		String child1 = it.next();
		System.out.println("parent "+child1);
		
		driver.switchTo().window(child1);
		System.out.println("child title is" +driver.getTitle());
				
		Thread.sleep(2000);
		
		driver.switchTo().window(parent1);
		System.out.println("parent1 title is" +driver.getTitle());
		
		
		
//		String s1 = driver.getWindowHandle();
//		System.out.println("parent2" +s1);
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@title= 'Follow @seleniumeasy on Facebook']")).click();
//		String s2 = driver.getWindowHandle();
//		System.out.println(s2);
//		
//		driver.switchTo().window(s1);
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);

		//driver.close();
		
//		driver.switchTo().window(s2);
//		System.out.println(driver.getTitle());

		
		
		

		
	}

}
