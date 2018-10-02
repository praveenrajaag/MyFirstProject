package MyProject.MyProjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		WebElement mailid = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		
		mailid.click();
		mailid.sendKeys("praveen081");
		
		WebElement clicknextbutton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		clicknextbutton.click();
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.name("password"));
		
		password.click();
		password.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//WebElement logout = driver.findElement(By.xpath("//*[@id=\"gb_71\"]"));
		//logout.click();
		driver.quit();
		
		
		
		


	}

}
