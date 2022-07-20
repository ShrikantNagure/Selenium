package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_KeypadActions {

	public static void main(String[] args) {

		String chromepath= "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		//class
		Actions act=new Actions(driver);
		
		//emailid field
		WebElement txt_Email=driver.findElement(By.xpath("//input[@id='email']"));
		act.keyDown(Keys.SHIFT).sendKeys("shrikant").keyUp(Keys.SHIFT).build().perform();
		
		//select all ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		// copy ctrl+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//password field
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.click();
		
		//paste ctrl+v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
