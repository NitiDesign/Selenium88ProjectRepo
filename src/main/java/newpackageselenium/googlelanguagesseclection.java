package newpackageselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelanguagesseclection {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> linkslist = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		int length = linkslist.size();
		for(int i=0;i<length;i++) {
			String text = linkslist.get(i).getText();
			System.out.println(text);
//			linkslist.get(i).click();
//			linkslist = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			
//			if(text.equalsIgnoreCase("हिन्दी"))
//			{
//			  Thread.sleep(3000);
//			  linkslist.get(i).click();
//			}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
