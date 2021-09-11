package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automationpratice_testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dido\\eclipse-workspace\\Selenium_concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//======Sign in========\\
		WebElement Sign = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		Sign.click();
		
		//=====Create account====\\
		WebElement create = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		create.sendKeys("mumadabest@gmail.com");
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		account.click();
		Thread.sleep(3000);
		
		//======personal information======\\
		WebElement mr = driver.findElement(By.id("id_gender1"));
		mr.click();
		Thread.sleep(2000);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstname.sendKeys("jurgen");
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastname.sendKeys("klopp");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("Liverpool");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByIndex(5);
		Thread.sleep(2000);
		
		WebElement months = driver.findElement(By.id("months"));
		Select p = new Select(months);
		p.selectByIndex(11);
		Thread.sleep(2000);
		
		WebElement years = driver.findElement(By.id("years"));
		Select d = new Select(years);
		d.selectByIndex(29);
		Thread.sleep(2000);
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("greens tech");
		Thread.sleep(2000);
		
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("Chennai,Adayar pin-600020");
		Thread.sleep(2000);
		
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("Adayar,TN");
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select m = new Select(state);
		m.selectByIndex(12);
		Thread.sleep(2000);
		
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("00000");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select r = new Select(country);
		r.selectByIndex(1);
		Thread.sleep(2000);
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		phone.sendKeys("7397278423");
		Thread.sleep(2000);
		
		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("NONE");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		submit.click();
		
		//=======order========\\
		
		WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(dress).build().perform();
		
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		ac.moveToElement(tshirt).build().perform();
		Thread.sleep(2000);
		ac.click(tshirt).build().perform();
		Thread.sleep(3000);
		
		//=======add to cart=====\\\
		
		WebElement title = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
		
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(title).build().perform();
		
		WebElement more = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]"));
		ac1.click().build().perform();
		
		
		WebElement plus = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span"));
		plus.click();
		Thread.sleep(1000);
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select k = new Select(size);
		k.selectByIndex(1);
		Thread.sleep(2000);//
		
		WebElement color = driver.findElement(By.id("color_14"));
		color.click();
		Thread.sleep(2000);
		
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addtocart.click();
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		checkout.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
