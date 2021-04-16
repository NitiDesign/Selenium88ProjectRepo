package newpackageselenium;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hashmap {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(getCredentialsMap());
//		Set<String> credentials1 = getCredentialsMap().keySet();
		//System.out.println(credentials1);
		//System.out.println(getCredentialsMap().get("deliveyBoy"));
		String credentials = getCredentialsMap().get("deliveyBoy");
		driver.findElement(By.id("login1")).sendKeys(credentials.split(":")[0]);
		driver.findElement(By.id("password")).sendKeys(credentials.split(":")[1]);
		
	}
		
		public static HashMap<String,String> getCredentialsMap() {
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("customer", "niti_dav08@rediffmail.com:nitinidhi");
		hashmap.put("manager", "nishi_dav08@rediffmail.com:nitinidhi");
		hashmap.put("deliveyBoy", "nidhi_dav08@rediffmail.com:nitinidhi");
		hashmap.put("customer", "papina_dav08@rediffmail.com:nitinidhi");	
		return hashmap;

		
		
		
		
		
		
	}

}
