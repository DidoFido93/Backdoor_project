package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_concepts1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(course).build().perform();
		
		WebElement soft = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[20]/a/span"));
		ac.moveToElement(soft).build().perform();
		Thread.sleep(3000);
		
		
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[3]/ul/li[20]/ul/li[6]/a/span"));
		ac.click(selenium).build().perform();
		
		
		
		
		
		
	}

}
