package browser_launch;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
	    WebDriver driver  = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    WebElement username = driver.findElement(By.id("email"));
	    username.sendKeys("didopeter1993@gmail.com");
	    Thread.sleep(3000);
	    
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("240404334");
	
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	
	
	
	
	}
	

}
