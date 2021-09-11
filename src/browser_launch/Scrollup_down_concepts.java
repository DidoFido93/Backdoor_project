package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup_down_concepts {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		close.click();
		Thread.sleep(3000);
		
		WebElement scrolldown = driver.findElement(By.xpath("//span[text()='Gift Cards']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
		
	}

}
