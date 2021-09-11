package browser_launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_concepts {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    File srcfile = ts.getScreenshotAs(OutputType.FILE);
	    
	    File Desfile  = new File("C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Screenshot\\facebook.png");
	    
	    FileUtils.copyDirectory(srcfile, Desfile);
	
	
	}

}
