package newpackageselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragdropActionsclassclickhold {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement source = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"loan\"]"));

		Actions action = new Actions(driver);
		//action.dragAndDrop(source, target).build().perform();
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		
	

}}
