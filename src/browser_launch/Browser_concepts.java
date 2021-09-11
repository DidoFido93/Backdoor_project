package browser_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_concepts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    
	    //navigate methods
	    driver.navigate().to("https://www.amazon.in/ref=nav_logo");
	    Thread.sleep(3000);
	    driver.navigate().back();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    Thread.sleep(3000);
	    driver.navigate().refresh(); 
	    Thread.sleep(3000);
	    
	   // to get current url
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   
	   // title of the page
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   driver.close();
	}

}
