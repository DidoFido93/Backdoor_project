package browser_launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_concept2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement amazon = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		
		
		Actions ac = new Actions(driver);
		ac.contextClick(amazon).build().perform();
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000); 
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
		//=========search tab=========\\\
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.click();
		rb.keyPress(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_U);
		rb.keyPress(KeyEvent.VK_N);
		rb.keyPress(KeyEvent.VK_K);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
