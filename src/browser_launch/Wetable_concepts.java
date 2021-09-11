package browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wetable_concepts {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("======ALL DATA=========");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		for (WebElement data : alldata) { 
			System.out.println(data.getText());
	
		}

		System.out.println("===particular row");
		List<WebElement> prow = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[3]//td"));
		for (WebElement row : prow) {
			System.out.println(row.getText());
			
		}
		
		
	}

}
