package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

	public static void main(String[] args) throws InterruptedException {

		String chromepath= "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.id("email"));
		txt_email.sendKeys("BugSpotter");
		
		WebElement txt_pass=driver.findElement(By.id("pass")); // call by name also (By.name)
		txt_pass.sendKeys("123456");
		
		WebElement btn_login=driver.findElement(By.id("loginbutton"));
		btn_login.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
