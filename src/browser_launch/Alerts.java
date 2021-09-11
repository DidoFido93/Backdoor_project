package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();    	
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
       
	
	}

}
