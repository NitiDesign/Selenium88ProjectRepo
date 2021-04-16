package newpackageselenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicsselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.navigate().to("https://www.amazon.in/");
	
	//List<WebElement> linklist = driver.findElements(By.tagName("a"));
//	List<WebElement> linklist = driver.findElements(By.tagName("a"));
//
//	int size = linklist.size();
//	System.out.println("total links on page is " +size);
//	for(int i=0;i<size;i++)
//	{   String str =  linklist.get(i).getText();
//	    	
//		if(!str.isEmpty()) {
//		System.out.println(i+"--->" +str);
//		System.out.println(linklist.get(i).getAttribute("href"));
//	}

	List<WebElement> imageslist = driver.findElements(By.tagName("img"));

	System.out.println("total images on page is " +imageslist.size());
	for(int i=0;i<imageslist.size();i++)
	{   
		System.out.println(imageslist.get(i).getAttribute("src"));
	    	
	}
	
//	Thread.sleep(2000);
//	driver.navigate().back();
//	driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
//	Thread.sleep(2000);
//    
//	driver.findElement(By.id("login1")).sendKeys("niti.kakkar@rediffmail.com");
//	Thread.sleep(2000);
//	driver.findElement(By.id("password")).sendKeys("nitidav08");;
//	Thread.sleep(2000);
//
//	driver.findElement(By.name("proceed")).click();
//
//	driver.navigate().to("https://app.hubspot.com/");
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//
//	driver.findElement(By.cssSelector("#username")).sendKeys("testhubspot@gmail.com");
//	Thread.sleep(2000);
//
//	driver.findElement(By.cssSelector("#password")).sendKeys("test@123");
//	driver.findElement(By.id("loginBtn")).click();
//	
	}}

