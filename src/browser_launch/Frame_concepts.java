package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_concepts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("SingleFrame");
		WebElement TextBox = driver.findElement(By.xpath("//input[@type='text']"));
		TextBox.sendKeys("Jajaja");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		WebElement BOX = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		BOX.click();
		Thread.sleep(3000);
		
		WebElement parent = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(parent);
		Thread.sleep(3000);
		
		
		WebElement childframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(childframe);
		Thread.sleep(3000);
		
		WebElement Number = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		Number.sendKeys("12345");
		Thread.sleep(3000);
		
		
		
		
	}

}
