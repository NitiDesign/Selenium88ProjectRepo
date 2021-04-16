package newpackageselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authpopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String username = "admin";
		String password = "admin";
		driver.get("https://" +username +":" +password +"@"+"the-internet.herokuapp.com/basic_auth");

		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
	}

}
